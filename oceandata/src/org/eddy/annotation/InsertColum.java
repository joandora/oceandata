/**
 * 
 * @creatTime 下午2:22:29
 * @author XuYi
 */
package org.eddy.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author XuYi
 *
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Documented
public @interface InsertColum {

	String[] colum();
	
	String[] paramKey();
}
