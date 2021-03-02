package co.wordbe.book;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.FIELD})
@Inherited
public @interface BookAnnotation {

    String name() default "default name";
    int number() default 100;
}
