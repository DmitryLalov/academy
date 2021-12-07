package by.academy.classwork.lesson11;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.ANNOTATION_TYPE, ElementType.METHOD, ElementType.FIELD})
@Inherited
public @interface Provider {
    int age()default 0;
    String name()default "noName";
    String[] products()default {};
}
