/**
 * 
 */
package util.adibrata.framework.license;

import java.io.File;
import java.util.Properties;

import util.adibrata.framework.configuration.*;
/**
 * @author Henry
 *
 */
import util.adibrata.framework.exceptionhelper.*;
public class License {

	private static Properties configfiles;
	@SuppressWarnings("unused")
	private static LicenseConfig lLicenseConfig;
	public License() throws Exception
	{
		lLicenseConfig= new LicenseConfig();
	}
	
	
	
	public static Boolean UserLicense(int intUser) throws Exception
	{
		String lLicenseSetting;
		try
		{
			lLicenseSetting = lLicenseConfig.Properties("UserNumber");
		}
		catch (Exception lExcp)
		{
			ExceptionEntities lEntExp = new ExceptionEntities();
			lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
			lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
			ExceptionHelper.WriteException(lEntExp, lExcp);
		}
		finally
		{
			
		}
		return false;
		
				
	}
	
	public static Boolean OfficeLicense(int intUser) throws Exception
	{
		String lLicenseSetting;
		try
		{
			lLicenseSetting = lLicenseConfig.Properties("OfficeNumber");
		}
		catch (Exception lExcp)
		{
			ExceptionEntities lEntExp = new ExceptionEntities();
			lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
			lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
			ExceptionHelper.WriteException(lEntExp, lExcp);
		}
		finally
		{
			
		}
		return false;
		
				
	}
	
	public static Boolean ExpiredLicense(int intUser) throws Exception
	{
		String lLicenseSetting;
		try
		{
			lLicenseSetting = lLicenseConfig.Properties("ExpiredDate");
		}
		catch (Exception lExcp)
		{
			ExceptionEntities lEntExp = new ExceptionEntities();
			lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
			lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
			ExceptionHelper.WriteException(lEntExp, lExcp);
		}
		finally
		{
			
		}
		return false;
		
				
	}
}
