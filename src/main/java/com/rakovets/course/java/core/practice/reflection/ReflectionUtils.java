package com.rakovets.course.java.core.practice.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionUtils {
    public Field getFieldOfClass(Class<?> clazz, String fieldName) throws NoSuchFieldException {
        return clazz.getDeclaredField(fieldName);
    }

    public Method getMethodOfClass(Class<?> clazz, String methodName) throws NoSuchMethodException {
        Method method = null;
        method = clazz.getDeclaredMethod(methodName);
        method.setAccessible(true);
        return method;
    }

    public Method[] getAllMethodOfClass(Class<?> clazz) {
        return clazz.getDeclaredMethods();
    }

    public Object runMethodToObject(Method method, Object obj) throws InvocationTargetException, IllegalAccessException {
        method.setAccessible(true);
        Object obj1 = null;
        obj1 = method.invoke(obj);
        return obj1;
    }

    public void setFieldOfObject(Field field, Object obj, Object value) throws IllegalAccessException {
        field.setAccessible(true);
        field.set(obj, value);
    }

    public Method getMethodWithParameters(Class<?> clazz, String methodName, Class<?>... forParameters) throws NoSuchMethodException {
        Method method = null;
        method = clazz.getDeclaredMethod(methodName, forParameters);
        method.setAccessible(true);
        return method;
    }

    public Object runThisMethodWithArguments(Method method, Object obj, Object... arg) throws InvocationTargetException, IllegalAccessException {
        method.setAccessible(true);
        return method.invoke(obj, arg);
    }
}
