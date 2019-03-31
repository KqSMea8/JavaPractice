package java.annotation;


/**
 * /**
 * Copyright (c) 2004-2017 All Rights Reserved.
 *
 * @author dz on 2018/8/14.
 */
@TestAnnotation()
public class First {
    public static void main(String[] args) {
        boolean hasAnnotation = (boolean) First.class.isAnnotationPresent(TestAnnotation.class);
        System.out.println(hasAnnotation);

    }
}
