/**
 * 
 */
package util.adibrata.support.cashbank;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.adibrata.smartdealer.model.Office;
import com.adibrata.smartdealer.model.Partner;
import com.adibrata.smartdealer.model.TrxSeqNo;

/**
 * @author Henry
 *
 */
public class BankAccEndBalance {

	/**
	 * 
	 */
	public BankAccEndBalance() {
		// TODO Auto-generated constructor stub
	}
	public BankAccEndBalance(Session session) {
	
	}
	
public void Update (Session session)
{
	// TODO Auto-generated constructor stub
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
}
