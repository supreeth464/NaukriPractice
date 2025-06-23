package com.practice1.intl.qa.selenium.webelements.annotation;

import com.practice1.intl.qa.selenium.webelements.enums.LocatorType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD})
public @interface webElementProperties {
    public LocatorType locatorType();
    public String locator();
}
