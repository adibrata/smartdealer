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
import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;

import com.adibrata.smartdealer.model.BankAccount;
import com.adibrata.smartdealer.model.Office;
import com.adibrata.smartdealer.model.Partner;
import com.adibrata.smartdealer.model.TrxSeqNo;

public class GetTransNo {
	String strFormatNumber;
	static Session session;

	public GetTransNo() {
		session = HibernateHelper.getSessionFactory().openSession();
	}

	public GetTransNo(Session session) {
		GetTransNo.session = session;
	}

	@SuppressWarnings({ "unchecked", "unused" })
	public static String GenerateTransactionNo(Session session,
			String partnercode, Long officeid, String seqcode, Date trxdate)
			throws Exception {
		String confignumber = "";

		String strMonth;
		String strYear;
		String strPrefix;
		String strSuffix;
		String strSeqno;
		DateFormat monthformat = new SimpleDateFormat("MM");
		DateFormat yearformat = new SimpleDateFormat("yyyy");
		try {
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
				strSeqno = String.format("%" + lengthseqno + "s", "").replace(
						' ', '0')
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
						.replace("{Month}", strMonth)
						.replace("{Year}", strYear)
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
				int result = qryUpd.executeUpdate();
			}
		} catch (Exception exp) {

			ExceptionEntities lEntExp = new ExceptionEntities();
			lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1]
					.getClassName());
			lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1]
					.getMethodName());
			ExceptionHelper.WriteException(lEntExp, exp);
		}
		return confignumber;
	}

	@SuppressWarnings({ "unchecked", "unused" })
	public static String GenerateJournalNo(Session session, String partnercode,
			Long officeid, String seqcode, Date trxdate) throws Exception {
		String confignumber = "";

		String strMonth;
		String strYear;
		String strPrefix;
		String strSuffix;
		String strSeqno;
		DateFormat monthformat = new SimpleDateFormat("MM");
		try {
			DateFormat yearformat = new SimpleDateFormat("yyyy");
			Query qryTrxSeqNo = session
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
				confignumber = trxseqno.getJrnlConfigNumber();

				strSeqno = trxseqno.getJrnlSeqNo().toString();
				int lengthseqno;
				lengthseqno = trxseqno.getJrnlLengthNo() - strSeqno.length();
				strSeqno = String.format("%" + lengthseqno + "s", "").replace(
						' ', '0')
						+ strSeqno;

				strMonth = monthformat.format(trxdate);
				strYear = yearformat.format(trxdate);
				strPrefix = "";
				strSuffix = "";
				// strSuffix = trxseqno.getSuffix();

				if (trxseqno.getJrnlPrefix() == null)
					strPrefix = "";
				else
					strPrefix = trxseqno.getJrnlPrefix();

				if (trxseqno.getJrnlSuffix() == null)
					strSuffix = "";
				else
					strSuffix = trxseqno.getJrnlSuffix();

				confignumber = confignumber
						.replace("{Office}", office.getOfficeCode())
						.replace("{Month}", strMonth)
						.replace("{Year}", strYear)
						.replace("{Suffix}", strSuffix)
						.replace("{Prefix}", strPrefix)
						.replace("{SeqNo}", strSeqno);

				Query qryUpd = session
						.createQuery(
								"update TrxSeqNo a set jrnl_seq_no = jrnl_seq_no + 1 "
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
		} catch (Exception exp) {

			ExceptionEntities lEntExp = new ExceptionEntities();
			lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1]
					.getClassName());
			lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1]
					.getMethodName());
			ExceptionHelper.WriteException(lEntExp, exp);
		}
		return confignumber;
	}

	@SuppressWarnings("unused")
	public static String GenerateVoucherNo(Session session, long bankaccountid,
			Date trxdate) throws Exception {

		BankAccount bankAccount = null;

		String confignumber = "";
		Office office = new Office();
		String strMonth;
		String strYear;
		String strPrefix;
		String strSuffix;
		String strSeqno;
		DateFormat monthformat = new SimpleDateFormat("MM");
		DateFormat yearformat = new SimpleDateFormat("yyyy");
		try {
			bankAccount = (BankAccount) session.get(BankAccount.class,
					bankaccountid);

			confignumber = bankAccount.getFormatSeqNo();
			office = (Office) session.get(Office.class,
					bankAccount.getOfficeId());

			strSeqno = bankAccount.getSeqNo().toString();
			int lengthseqno;
			lengthseqno = bankAccount.getBankAccountCode().length()
					- strSeqno.length();
			System.out.println(lengthseqno);
			if (lengthseqno > 4)
				lengthseqno = 3;
			System.out.println(lengthseqno);
			strSeqno = String.format("%" + lengthseqno + "s", "").replace(' ',
					'0')
					+ strSeqno;

			strMonth = monthformat.format(trxdate);
			strYear = yearformat.format(trxdate);
			strPrefix = "";
			strSuffix = "";
			// strSuffix = trxseqno.getSuffix();

			if (bankAccount.getBankAccountCode() == null)
				strPrefix = "";
			else
				strPrefix = bankAccount.getBankAccountCode();

			confignumber = confignumber
					.replace("{Office}", office.getOfficeCode())
					.replace("{Month}", strMonth).replace("{Year}", strYear)
					.replace("{Suffix}", strSuffix)
					.replace("{Prefix}", strPrefix)
					.replace("{SeqNo}", strSeqno);

			Query qryUpd = session.createQuery(
					"update BankAccount a set seqno = seqno + 1 "
							+ " Where  Id  = :id" + " ").setParameter("id",
					bankaccountid);

			/*
			 * trxseqno.setPartner(partner);
			 * trxseqno.setOfficeId(office.getId());
			 * trxseqno.setMssequenceCode(seqcode);
			 * trxseqno.setSeqNo(trxseqno.getSeqNo() + 1);
			 * session.update(trxseqno);
			 */
			int result = qryUpd.executeUpdate();

		} catch (Exception exp) {

			ExceptionEntities lEntExp = new ExceptionEntities();
			lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1]
					.getClassName());
			lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1]
					.getMethodName());
			ExceptionHelper.WriteException(lEntExp, exp);
		}
		return confignumber;
	}

	public static String GetSequenceDesc(Session session, String partnercode,
			Long officeid, String seqcode) throws Exception {
		String description = "";
		try {
			Query qrycoacode = session
					/*
					 * .createQuery(
					 * "Select a from  TrxSeqNo a inner join  Office b WITH " +
					 * " a.officeId = b.id " + "inner join " +
					 * " Partner c WITH a.partner = c.partnerCode and b.partner = c.partnerCode "
					 * );
					 */
					.createQuery(" Select jrnlSeqName from  TrxSeqNo "
							+ " Where partnercode = :partnercode and officeid = :office and mssequencecode = :seqcode");
			qrycoacode.setParameter("partnercode", partnercode);
			qrycoacode.setParameter("office", officeid);
			qrycoacode.setParameter("seqcode", seqcode);

			description = (String) qrycoacode.uniqueResult();
		} catch (Exception exp) {

			ExceptionEntities lEntExp = new ExceptionEntities();
			lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1]
					.getClassName());
			lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1]
					.getMethodName());
			ExceptionHelper.WriteException(lEntExp, exp);
		}
		return description;
	}
}
