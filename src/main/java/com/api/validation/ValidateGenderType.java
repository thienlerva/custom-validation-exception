package com.api.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Target({ElementType.FIELD, ElementType.TYPE_PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = GenderTypeValidator.class)
public @interface ValidateGenderType {

    public String message() default "Invalid gender type: should be Male, Female or NA";

    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
