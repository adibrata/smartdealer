/**
 * 
 */
package util.adibrata.support.transno;

/**
 * @author Henry
 *
 */
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import util.adibrata.framework.dataaccess.HibernateHelper;

import com.adibrata.smartdealer.model.Office;
import com.adibrata.smartdealer.model.Partner;
import com.adibrata.smartdealer.model.TransJob;
import com.adibrata.smartdealer.model.TrxSeqNo;

public class GetTransNo {
	String strFormatNumber;
	static Session session; 
	
	public GetTransNo()
	{
		session = HibernateHelper.getSessionFactory().openSession();
	}

	public GetTransNo (Session session)
	{
		this.session = session;
	}
	
	public static String GenerateTransactionNo(Session session, String partnercode,
			Long officeid, String seqcode, Date trxdate) {
		String confignumber = "";

		String strMonth;
		String strYear;
		String strPrefix;
		String strSuffix;
		String strSeqno;
		DateFormat monthformat = new SimpleDateFormat("MM");
		DateFormat yearformat = new SimpleDateFormat("yyyy");
		Query qryTrxSeqNo = session
				/*
				 * .createQuery(
				 * "Select a from  TrxSeqNo a inner join  Office b WITH " +
				 * " a.officeId = b.id " + "inner join " +
				 * " Partner c WITH a.partner = c.partnerCode and b.partner = c.partnerCode "
				 * );
				 */
				.createQuery(
						"from  TrxSeqNo a, Office b,  Partner c  "
								+ " Where a.officeId = b.id and "
								+ " a.partner = c.partnerCode and b.partner = c.partnerCode "
								+ " and c.partnerCode = :partnercode "
								+ " and b.id = :officeid and a.mssequenceCode = :seqcode")
				.setParameter("partnercode", partnercode)
				.setParameter("officeid", officeid)
				.setParameter("seqcode", seqcode);

		List<Object[]> lstSeqNo = (List<Object[]>) qryTrxSeqNo.list();

		for (Object[] aRow : lstSeqNo) {
			TrxSeqNo trxseqno = (TrxSeqNo) aRow[0];
			Office office = (Office) aRow[1];
			Partner partner = (Partner) aRow[2];
			confignumber = trxseqno.getConfigNumber();

			strSeqno = trxseqno.getSeqNo().toString();
			int lengthseqno;
			lengthseqno = trxseqno.getLengthNumber() - strSeqno.length();
			strSeqno = String.format("%" + lengthseqno + "s", "").replace(' ',
					'0')
					+ strSeqno;

			strMonth = monthformat.format(trxdate);
			strYear = yearformat.format(trxdate);
			strPrefix = "";
			strSuffix = "";
			// strSuffix = trxseqno.getSuffix();
			strPrefix = trxseqno.getPrefix();
			if (trxseqno.getPrefix() == null) {
				strPrefix = "";
			}

			if (trxseqno.getSuffix() == null) {
				strSuffix = "";

			} else {
				strSuffix = trxseqno.getSuffix();
			}

			confignumber = confignumber
					.replace("{Office}", office.getOfficeCode())
					.replace("{Month}", strMonth).replace("{Year}", strYear)
					.replace("{Suffix}", strSuffix)
					.replace("{Prefix}", strPrefix)
					.replace("{SeqNo}", strSeqno);

			Query qryUpd = session
					.createQuery(
							"update TrxSeqNo a set seq_no = seq_no + 1 "
									+ " Where  PartnerCode  = :partnercode"
									+ " and a.officeId = :officeid and a.mssequenceCode = :seqcode")
					.setParameter("partnercode", partner.getPartnerCode())
					.setParameter("officeid", office.getId())
					.setParameter("seqcode", seqcode);

			/*
			 * trxseqno.setPartner(partner);
			 * trxseqno.setOfficeId(office.getId());
			 * trxseqno.setMssequenceCode(seqcode);
			 * trxseqno.setSeqNo(trxseqno.getSeqNo() + 1);
			 * session.update(trxseqno);
			 */
			int result = qryUpd.executeUpdate();
		}
		return confignumber;
	}

	public String GenerateJournalNo(String partner, String office) {
		Session session = HibernateHelper.getSessionFactory().openSession();
		List<TransJob> lstTransJob = session.createQuery(
				"from TransJob a WHERE JobStatus = 'NE'").list();
		return "";
	}

	public String GenerateVoucherNo(String partner, String office) {
		Session session = HibernateHelper.getSessionFactory().openSession();
		List<TransJob> lstTransJob = session.createQuery(
				"from TransJob a WHERE JobStatus = 'NE'").list();
		return "";
	}
}

/*
 * 
 * //----------------------------------------------------------------------------
 * -- //<copyright file="CSSqlClassFile.cs" company="Microsoft"> // Copyright
 * (c) Microsoft Corporation. All rights reserved. //</copyright>
 * //--------------
 * ---------------------------------------------------------------- using
 * System; using System.Collections.Generic; using System.Text; using
 * System.Data.SqlClient; using System.Data; using Microsoft.SqlServer.Server;
 * 
 * 
 * namespace Adibrata.Database.Script.StoreProcedure { public class
 * MasterSequenceClass { string _sequenceno; string _formatsequence; string
 * _prefix; string _suffix; string _isoffice; string _isyear; string _ismonth;
 * 
 * string _month; string _year; string _office; int _officeid; int _seqno;
 * string _strseqno;
 * 
 * int _lengthnumber; char _fill = '0';
 * 
 * 
 * public string GetSequenceNo(int OfficeID, string SequenceID, string
 * PostingDate) { SqlParameter oParam = new SqlParameter(); StringBuilder sb =
 * new StringBuilder(); SqlDataReader _rdr; //CommonClass _common = new
 * CommonClass();
 * 
 * 
 * sb.Append("Select Seq_No, Length_Number, Prefix, Suffix, "); sb.Append(
 * "IsOffice, IsYear, IsMonth, FormatNumber from Ms_Sequence with (nolock) where OfficeID = @OfficeID and MsSequenceID = @SequenceID"
 * );
 * 
 * _sequenceno = ""; using (SqlConnection _con = new
 * SqlConnection("context connection=true")) { if (_con.State ==
 * ConnectionState.Closed) { _con.Open(); };
 * 
 * using (SqlCommand _cmd = _con.CreateCommand()) { _fill = '0'; try {
 * _cmd.CommandText = sb.ToString(); _cmd.Connection = _con;
 * _cmd.Parameters.AddWithValue("@OfficeID", OfficeID);
 * _cmd.Parameters.AddWithValue("@SequenceID", SequenceID); _rdr =
 * _cmd.ExecuteReader(); while (_rdr.Read()) { _seqno = (int)_rdr["Seq_No"];
 * _lengthnumber = (int)_rdr["Length_Number"]; _prefix = (string)_rdr["Prefix"];
 * _suffix = (string)_rdr["Suffix"]; _isoffice = (string)_rdr["IsOffice"];
 * _isyear = (string)_rdr["IsYear"]; _ismonth = (string)_rdr["IsMonth"];
 * _formatsequence = (string)_rdr["FormatNumber"]; } _rdr.Close(); } catch
 * (Exception exp) { throw new Exception(exp.Message); } finally { if
 * (_con.State == ConnectionState.Open) { _con.Close(); }; }
 * 
 * #region "Start Sequence No Generated" _strseqno =
 * _seqno.ToString().Trim().PadLeft(_lengthnumber, _fill);
 * 
 * if (_ismonth == "1") { _month =
 * DateTime.Now.Month.ToString().Trim().PadLeft(2, _fill); } else { _month = "";
 * }
 * 
 * if (_isyear == "1") { _year = DateTime.Now.Year.ToString().Trim().PadLeft(4,
 * _fill); } else { _year = ""; }
 * 
 * if (_isoffice == "1") { _office = CommonClass.GetOfficeCode(OfficeID); } else
 * { _office = ""; } _sequenceno = _formatsequence; _sequenceno =
 * _sequenceno.ToUpper().Replace("{MONTH}", _month); _sequenceno =
 * _sequenceno.ToUpper().Replace("{YEAR}", _year); _sequenceno =
 * _sequenceno.ToUpper().Replace("{OFFICEID}", _office); _sequenceno =
 * _sequenceno.ToUpper().Replace("{SEQNO}", _strseqno); _sequenceno =
 * _sequenceno.ToUpper().Replace("{PREFIX}", _prefix); _sequenceno =
 * _sequenceno.ToUpper().Replace("{SUFFIX}", _suffix); #endregion
 * 
 * sb.Clear(); sb.Append(
 * "Update Ms_Sequence set Seq_No = Seq_No + 1 where OfficeID = @OfficeID and MsSequenceID = @SequenceID"
 * );
 * 
 * _cmd.Connection = _con;
 * 
 * _cmd.CommandText = sb.ToString();
 * 
 * 
 * if (_con.State == ConnectionState.Closed) { _con.Open(); };
 * 
 * try { int rowaffected = _cmd.ExecuteNonQuery(); } catch (Exception exp) {
 * throw new Exception(exp.Message); } finally { if (_con.State ==
 * ConnectionState.Open) { _con.Close(); }; } } } sb.Clear(); return
 * _sequenceno; }
 * 
 * 
 * public string GetJournalNo( int OfficeID, int JournalTransactionID, string
 * PostingDate) { SqlParameter oParam = new SqlParameter(); StringBuilder sb =
 * new StringBuilder(); SqlDataReader _rdr; //CommonClass _common = new
 * CommonClass();
 * 
 * sb.Append("Select Seq_No, Length_Number, Prefix, Suffix, "); sb.Append(
 * "IsOffice, IsYear, IsMonth, FormatNumber from Ms_Journal_Seq with (nolock) where OfficeID = @OfficeID and JrnlTrxID = @SequenceID"
 * );
 * 
 * _sequenceno = "";
 * 
 * using (SqlConnection _con = new SqlConnection("context connection=true")) {
 * if (_con.State == ConnectionState.Closed) { _con.Open(); }; using (SqlCommand
 * _cmd = _con.CreateCommand()) { try { _cmd.CommandText = sb.ToString();
 * _cmd.Connection = _con; _cmd.Parameters.AddWithValue("@OfficeID", OfficeID);
 * _cmd.Parameters.AddWithValue("@SequenceID", JournalTransactionID); _rdr =
 * _cmd.ExecuteReader(); while (_rdr.Read()) { _seqno = (int)_rdr["Seq_No"];
 * _lengthnumber = (int)_rdr["Length_Number"]; _prefix = (string)_rdr["Prefix"];
 * _suffix = (string)_rdr["Suffix"]; _isoffice = (string)_rdr["IsOffice"];
 * _isyear = (string)_rdr["IsYear"]; _ismonth = (string)_rdr["IsMonth"];
 * _formatsequence = (string)_rdr["FormatNumber"]; } _rdr.Close(); } catch
 * (Exception exp) { throw new Exception(exp.Message); } finally { if
 * (_con.State == ConnectionState.Open) { _con.Close(); }; }
 * 
 * _strseqno = _seqno.ToString().Trim().PadLeft(_lengthnumber, _fill);
 * 
 * if (_ismonth == "1") { _month =
 * Convert.ToDateTime(PostingDate).Month.ToString().Trim().PadLeft(2, _fill); }
 * else { _month = ""; }
 * 
 * if (_isyear == "1") { _year =
 * Convert.ToDateTime(PostingDate).Year.ToString().Trim().PadLeft(4, _fill); }
 * else { _year = ""; }
 * 
 * if (_isoffice == "1") { _office = CommonClass.GetOfficeCode(OfficeID); } else
 * { _office = ""; } _sequenceno = _formatsequence; _sequenceno =
 * _sequenceno.ToUpper().Replace("{MONTH}", _month); _sequenceno =
 * _sequenceno.ToUpper().Replace("{YEAR}", _year); _sequenceno =
 * _sequenceno.ToUpper().Replace("{OFFICEID}", _office); _sequenceno =
 * _sequenceno.ToUpper().Replace("{SEQNO}", _strseqno); _sequenceno =
 * _sequenceno.ToUpper().Replace("{PREFIX}", _prefix); _sequenceno =
 * _sequenceno.ToUpper().Replace("{SUFFIX}", _suffix);
 * 
 * sb.Clear(); sb.Append(
 * "Update Ms_Journal_Seq set Seq_No = Seq_No + 1 where OfficeID = @OfficeID and JrnlTrxID = @SequenceID"
 * ); _cmd.Connection = _con;
 * 
 * _cmd.CommandText = sb.ToString();
 * 
 * if (_con.State == ConnectionState.Closed) { _con.Open(); };
 * 
 * try { int rowaffected = _cmd.ExecuteNonQuery(); } catch (Exception exp) {
 * throw new Exception(exp.Message); } finally { if (_con.State ==
 * ConnectionState.Open) { _con.Close(); }; }
 * 
 * } } //sb.Clear(); return _sequenceno; }
 * 
 * public string GetVoucherNo(int BankAccountID, string PostingDate) {
 * SqlParameter oParam = new SqlParameter(); StringBuilder sb = new
 * StringBuilder(); SqlDataReader _rdr; //CommonClass _common = new
 * CommonClass();
 * 
 * sb.Append("Select OfficeID, Seq_No, Length_Number, Prefix, Suffix, ");
 * sb.Append(
 * "IsOffice, IsYear, IsMonth, FormatNumber from Ms_BankAccount with (nolock) where ID = @SequenceID"
 * );
 * 
 * _sequenceno = ""; using (SqlConnection _con = new
 * SqlConnection("context connection=true")) { if (_con.State ==
 * ConnectionState.Closed) { _con.Open(); };
 * 
 * using (SqlCommand _cmd = _con.CreateCommand()) { _fill = '0';
 * _cmd.CommandText = sb.ToString(); _cmd.Parameters.AddWithValue("@SequenceID",
 * BankAccountID); _cmd.ExecuteNonQuery(); _rdr = _cmd.ExecuteReader();
 * 
 * try { while (_rdr.Read()) { _seqno = (int)_rdr["Seq_No"]; _lengthnumber =
 * (int)_rdr["Length_Number"]; _prefix = (string)_rdr["Prefix"]; _suffix =
 * (string)_rdr["Suffix"]; _isoffice = (string)_rdr["IsOffice"]; _isyear =
 * (string)_rdr["IsYear"]; _ismonth = (string)_rdr["IsMonth"]; _formatsequence =
 * (string)_rdr["FormatNumber"]; _officeid = (int)_rdr["OfficeID"]; } } catch
 * (Exception exp) { throw new Exception(exp.Message); } finally { if
 * (_con.State == ConnectionState.Open) { _con.Close(); }; } _rdr.Close();
 * 
 * _strseqno = _seqno.ToString().Trim().PadLeft(_lengthnumber, _fill);
 * 
 * if (_ismonth == "1") { _month =
 * Convert.ToDateTime(PostingDate).Month.ToString().Trim().PadLeft(2, _fill); }
 * else { _month = ""; }
 * 
 * if (_isyear == "1") { _year =
 * Convert.ToDateTime(PostingDate).Year.ToString().Trim().PadLeft(4, _fill); }
 * else { _year = ""; }
 * 
 * if (_isoffice == "1") { _office = CommonClass.GetOfficeCode(_officeid); }
 * else { _office = ""; } _sequenceno = _formatsequence; _sequenceno =
 * _sequenceno.ToUpper().Replace("{MONTH}", _month); _sequenceno =
 * _sequenceno.ToUpper().Replace("{YEAR}", _year); _sequenceno =
 * _sequenceno.ToUpper().Replace("{OFFICEID}", _office); _sequenceno =
 * _sequenceno.ToUpper().Replace("{SEQNO}", _strseqno); _sequenceno =
 * _sequenceno.ToUpper().Replace("{PREFIX}", _prefix.Trim()); _sequenceno =
 * _sequenceno.ToUpper().Replace("{SUFFIX}", _suffix.Trim());
 * 
 * sb.Clear();
 * sb.Append("Update Ms_BankAccount set Seq_No = Seq_No + 1 where ID = @SequenceID"
 * ); _cmd.CommandText = sb.ToString();
 * 
 * if (_con.State == ConnectionState.Closed) { _con.Open(); }; _cmd.Connection =
 * _con; try { int rowaffected = _cmd.ExecuteNonQuery(); } catch (Exception exp)
 * { throw new Exception(exp.Message); } finally { if (_con.State ==
 * ConnectionState.Open) { _con.Close(); } }
 * 
 * } } sb.Clear(); return _sequenceno; }
 * 
 * public int GetMaxHistorySequenceNo(long _agrmntid) { int _histseqno; using
 * (SqlConnection _con = new SqlConnection("context connection=true")) {
 * 
 * if (_con.State == ConnectionState.Closed) { _con.Open(); };
 * 
 * using (SqlCommand _cmd = _con.CreateCommand()) { try { _cmd.CommandText =
 * "Select Isnull(Max(HistSeqNo),0) + 1 as HistorySequenceNo From PayHistHdr with (nolock) where AgrmntID = @AgrmntID"
 * ;
 * 
 * _cmd.Connection = _con; _cmd.Parameters.AddWithValue("@AgrmntID", _agrmntid);
 * _histseqno = Convert.ToInt32(_cmd.ExecuteScalar()); } catch (Exception exp) {
 * throw new Exception(exp.Message); } finally { if (_con.State ==
 * ConnectionState.Open) { _con.Close(); }; } } } return _histseqno; }
 * 
 * 
 * public string GetAgreementNo(string OfficeID, string ProductID) {
 * SqlParameter oParam = new SqlParameter(); StringBuilder sb = new
 * StringBuilder(); SqlDataReader _rdr;
 * 
 * sb.Append("Select Seq_No, Length_Number, Prefix, Suffix, "); sb.Append(
 * "IsOffice, IsYear, IsMonth, FormatNumber from Ms_BankAccount with (nolock) where OfficeID = @OfficeID and ProductID = @SequenceID"
 * ); _sequenceno = ""; using (SqlConnection _con = new
 * SqlConnection("context connection=true")) { if (_con.State ==
 * ConnectionState.Closed) { _con.Open(); };
 * 
 * using (SqlCommand _cmd = _con.CreateCommand()) {
 * 
 * _fill = '0'; try { _cmd.CommandText = sb.ToString(); _cmd.Connection = _con;
 * _cmd.Parameters.AddWithValue("@OfficeID", OfficeID);
 * _cmd.Parameters.AddWithValue("@SequenceID", ProductID); _rdr =
 * _cmd.ExecuteReader();
 * 
 * try { while (_rdr.Read()) { _seqno = (int)_rdr["Seq_No"]; _lengthnumber =
 * (int)_rdr["Length_Number"]; _prefix = (string)_rdr["Prefix"]; _suffix =
 * (string)_rdr["Suffix"]; _isoffice = (string)_rdr["IsOffice"]; _isyear =
 * (string)_rdr["IsYear"]; _ismonth = (string)_rdr["IsMonth"]; _formatsequence =
 * (string)_rdr["FormatNumber"]; } } catch (Exception exp) { throw new
 * Exception(exp.Message); } finally{_rdr.Close(); if (_con.State ==
 * ConnectionState.Open) { _con.Close(); };}
 * 
 * 
 * _strseqno = _seqno.ToString().Trim().PadLeft(_lengthnumber, _fill);
 * 
 * if (_ismonth == "1") { _month =
 * DateTime.Now.Month.ToString().Trim().PadLeft(2, _fill); } else { _month = "";
 * }
 * 
 * if (_isyear == "1") { _year = DateTime.Now.Year.ToString().Trim().PadLeft(4,
 * _fill); } else { _year = ""; }
 * 
 * if (_isoffice == "1") { _office = OfficeID.Trim(); } else { _office = ""; }
 * _sequenceno = _formatsequence; _sequenceno =
 * _sequenceno.ToUpper().Replace("{MONTH}", _month); _sequenceno =
 * _sequenceno.ToUpper().Replace("{YEAR}", _year); _sequenceno =
 * _sequenceno.ToUpper().Replace("{OFFICEID}", _office); _sequenceno =
 * _sequenceno.ToUpper().Replace("{SEQNO}", _strseqno); _sequenceno =
 * _sequenceno.ToUpper().Replace("{PREFIX}", _prefix); _sequenceno =
 * _sequenceno.ToUpper().Replace("{SUFFIX}", _suffix);
 * 
 * sb.Clear(); sb.Append(
 * "Update Ms_Journal_Seq set Seq_No = Seq_No + 1 where OfficeID = @OfficeID and JournalID = @SequenceID"
 * ); _cmd.CommandText = sb.ToString(); int rowaffected =
 * _cmd.ExecuteNonQuery(); } catch (Exception exp) { throw new
 * Exception(exp.Message); } finally { if (_con.State == ConnectionState.Open) {
 * _con.Close(); }; } } } sb.Clear();
 * 
 * return _sequenceno; } } }
 */