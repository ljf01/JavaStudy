package com.javase.date;

import static java.lang.reflect.Array.getLength;
import static java.lang.reflect.Array.newInstance;

/**
 * @author Jiafeng1.Li
 */
public class FanXin<T> {

    public T changeArrayLength(T t, int newLength)
    {
        Class<?> cl = t.getClass();
        if(!cl.isArray())
        {
            return null;
        }
        Class<?> temp = cl.getComponentType();
        int length = getLength(t);
        T newArray = (T)newInstance(temp,newLength);
        System.arraycopy(t,0,newArray,0,Math.min(length,newLength));

        return newArray;
    }
}
