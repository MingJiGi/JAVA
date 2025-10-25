package sec02_reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionExample {

    public static void main(String[] args) throws Exception{

        Class class1 = Class.forName("sec02_reflection.Car");
        System.out.println("[클래스 이름]" + class1.getName());
        System.out.println("[클래스 이름]" + class1.getSimpleName());
        System.out.println();

        System.out.println("[생성자 정보]");
        //Car클래스에서만 선언된 생성자 정보만 출력(접근제어자에 관계없음)
        Constructor[] constructors = class1.getDeclaredConstructors();

        for (Constructor constructor : constructors){
            System.out.print(constructor.getName() + "(");

           Class[] parameter = constructor.getParameterTypes();
           printParameters(parameter);
            System.out.print(") \n");
        }
        //Car클래스에만 선언된 필드 정보만 출력(접근제어자에 관계없음)
        System.out.println("[필드 정보]");
        Field[] fields = class1.getDeclaredFields();
        for (Field field : fields){
            System.out.println(field.getType().getSimpleName() + " " + field.getName());
        }
        System.out.println();

        //Car클래스에만 선언된 메서드 정보만 출력(접근제어자 관계없음)
        System.out.println("[메서드 정보]");

        Method[] method= class1.getDeclaredMethods();
        for (Method method1 : method){
            //리턴타입 정보출력
            System.out.print(method1.getReturnType().getSimpleName() + " ");
            System.out.print(method1.getName() + "(");
            Class[] parneters =  method1.getParameterTypes();
            printParameters(parneters);
            System.out.println("))");
        }
    }
    private static void printParameters(Class[] parneters){
        for (int i = 0; i < parneters.length; i++) {
            System.out.print(parneters[i].getSimpleName());
            if (i<parneters.length-1){
                System.out.print(", ");
            }
        }
    }
}
