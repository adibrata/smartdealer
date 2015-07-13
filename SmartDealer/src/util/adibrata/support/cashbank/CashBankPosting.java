/**
 * 
 */
package util.adibrata.support.cashbank;

/**
 * @author Henry
 *
 */
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.hibernate.Session;

import com.adibrata.smartdealer.model.CashBankHdr;
import com.adibrata.smartdealer.model.JrnlHdr;
import com.adibrata.smartdealer.model.Office;
import com.adibrata.smartdealer.model.Partner;
import com.adibrata.smartdealer.model.TransJob;

import util.adibrata.framework.cachehelper.*;
import util.adibrata.framework.exceptionhelper.*;
import util.adibrata.support.jourmal.JrnlHdrModel;
import util.adibrata.support.transno.GetTransNo;

//import model.adibrata.smartfinance.*;

public class CashBankPosting {
	private DateFormat monthformat = new SimpleDateFormat("MM");
	private DateFormat yearformat = new SimpleDateFormat("yyyy");
	DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	private Date dtmUpd = Calendar.getInstance().getTime();
	/**
	 * 
	 */
	public CashBankPosting() {
	
		// TODO Auto-generated constructor stub
	}

	public void CashBankSave(Session session, TransJob transjob,
			Office office, Partner partner, JrnlHdrModel jrnlHdrModel)throws Exception 
	{
	
			CashBankHdr bankHdr = new CashBankHdr();
			try {
				String periodyear = "", periodmonth = "";

				periodmonth = monthformat.format(transjob.getJobPost());
				periodyear = yearformat.format(transjob.getJobPost());

				bankHdr.setPartner(partner);
				bankHdr.setOffice(office);
				this.JournalNo = GetTransNo.GenerateJournalNo(session,
						partner.getPartnerCode(), office.getId(),
						this.hdrModel.getJrnlNoCode(), transjob.getJobPost());

				bankHdr.setJrnlNo(this.JournalNo);

				bankHdr.setPeriodYear(periodyear);
				bankHdr.setPeriodMonth(periodmonth);
				bankHdr.setTrxDate(transjob.getJobPost());
				bankHdr.setReffDate(transjob.getJobDate());
				bankHdr.setReffNo(this.hdrModel.getReffNo());

				bankHdr.setTrxDesc(this.hdrModel.getReffNo());
				bankHdr.setJrnlAmt(this.hdrModel.getAmountTrx());
				bankHdr.setStatusTr("OP");
				bankHdr.setFlag("M");
				bankHdr.setIsActive((short) 1);

				// jrnlhdr.setJrnlTrxCode(trxconfighdr.getJrnlTrxCode());
				bankHdr.setCoaSchmCode(transjob.getCoaSchmCode());

				bankHdr.setJobId(transjob.getId());
				bankHdr.setUsrUpd(userupd);
				bankHdr.setUsrCrt(this.userupd);
				bankHdr.setDtmUpd(dtmUpd);
				bankHdr.setDtmCrt(dtmUpd);

				session.save(bankHdr);

			} catch (Exception exp) {

				ExceptionEntities lEntExp = new ExceptionEntities();
				lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1]
						.getClassName());
				lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1]
						.getMethodName());
				ExceptionHelper.WriteException(lEntExp, exp);
			}
			return jrnlhdr;
		}
		
	}
}
