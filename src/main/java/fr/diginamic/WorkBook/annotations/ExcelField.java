package fr.diginamic.WorkBook.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(value = RetentionPolicy.RUNTIME)
@Target({ ElementType.FIELD })
public @interface ExcelField {
	int position();

	String name();

	String regex() default ".*";
}
