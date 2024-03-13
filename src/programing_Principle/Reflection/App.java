package programing_Principle.Reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class App {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException {
        Cat thecat  = new Cat("Manny",5);


        //get the field from the class
        Field[] carFiled =  thecat.getClass().getDeclaredFields();
        for(Field f: carFiled){
            System.out.println(f.getName()+" : "+f.getType());
        }
        System.out.println("*******************************");
        //reflection
        for(Field f: carFiled){
          if (f.getName().equals("name")){
              f.setAccessible(true);
              f.set(thecat,"NewName");
          }
        }
        System.out.println(thecat.getName());

        System.out.println("*******************************");


        //Get the methods using reflection
        Method[] catMethod =  thecat.getClass().getDeclaredMethods();

        for (Method m : catMethod){
            System.out.println(m.getName());
        }

        System.out.println("*******************************");
        for (Method m : catMethod){
           //invoked public method
            if(m.getName().equals("meow")){
                m.invoke(thecat);
            }

            //calling private method
            if(m.getName().equals("callPrivate")){
                m.setAccessible(true);
                m.invoke(thecat,5);
            }

            //calling static method
            if(m.getName().equals("callStatic")){
                m.invoke(null);
            }
        }



    }
}
