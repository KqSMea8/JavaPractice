package java.java8.Type;

import java.lang.reflect.*;

public class TypeBeanTest {

    public static void main(String[] args) {
        Field[] declaredFields = TypeBean.class.getDeclaredFields();
        for (int i = 0; i < declaredFields.length; i++) {
            Field declaredField = declaredFields[i];
            Type genericType = declaredField.getGenericType();
            System.out.println("变量名：" + declaredField.getName());
            System.out.println("变量声明的类型："+genericType.getTypeName());
            if (genericType instanceof Class) {
                System.out.println("变量类型为Class");
            } else if (genericType instanceof ParameterizedType) {
                System.out.println("变量类型为ParameterizedType");
            } else if (genericType instanceof TypeVariable) {
                System.out.println("变量类型为TypeVariable");
            } else if (genericType instanceof GenericArrayType) {
                System.out.println("变量类型为GenericArrayType");
            } else if (genericType instanceof WildcardType) {
                System.out.println("变量类型为WildcardType");
            }
            System.out.println();
        }
    }
}

