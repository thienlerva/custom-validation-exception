package com.api.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Arrays;
import java.util.List;

public class GenderTypeValidator implements ConstraintValidator<ValidateGenderType, String> {

    @Override
    public boolean isValid(String genderType, ConstraintValidatorContext constraintValidatorContext) {

        List<String> genderTypes = Arrays.asList("Male", "Female", "NA");
        return genderTypes.contains(genderType);
    }
}
