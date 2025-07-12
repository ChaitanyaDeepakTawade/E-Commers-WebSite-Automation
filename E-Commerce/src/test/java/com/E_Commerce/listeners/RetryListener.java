package com.E_Commerce.listeners;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

import com.E_Commerce.Utils.RetryAnalyzer;

public class RetryListener  implements IAnnotationTransformer {
    @Override
    public void transform(ITestAnnotation annotation, Class testClass,Constructor testConstructor, Method testMethod) 
    {
        annotation.setRetryAnalyzer(RetryAnalyzer.class);
    }

}
