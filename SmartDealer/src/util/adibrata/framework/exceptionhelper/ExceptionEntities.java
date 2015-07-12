/**
 * 
 */
package util.adibrata.framework.exceptionhelper;

/**
 * @author Henry
 *
 */
import java.io.Serializable;

import javax.persistence.Entity;

@SuppressWarnings({ "unused", "serial" })
@Entity
public class ExceptionEntities implements Serializable{

	
	private String JavaClass;
	private String MethodName;
	
	public String getJavaClass() {
		return JavaClass;
	}

	public void setJavaClass(String javaClass) {
		JavaClass = javaClass;
	}

	public String getMethodName() {
		return MethodName;
	}

	public void setMethodName(String methodName) {
		MethodName = methodName;
	}

	
}
