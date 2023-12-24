package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.collections.Emp;
import com.springcore.constructorInject.Certificate;
import com.springcore.constructorInject.Person;
import com.springcore.ref.A;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) 
    {
        System.out.println( "Hello World!" );
        ApplicationContext context=new ClassPathXmlApplicationContext("resources/config.xml");
        Student s1=(Student) context.getBean("student1");
        System.out.println(s1);

//        accessing collection type
        ApplicationContext context2=new ClassPathXmlApplicationContext("resources/collectionConfig.xml");
        Emp e1=(Emp)context2.getBean("emp1");
        System.out.println(e1.toString());
        
//        accessing ref
        ApplicationContext context3=new ClassPathXmlApplicationContext("resources/refConfig.xml");
        A a=(A) context3.getBean("aref");
        System.out.println("x: "+a.getX());
        System.out.println("ob: "+a.getOb().getY());
        
//        accessing using constructor injection
        ApplicationContext context4=new ClassPathXmlApplicationContext("resources/constructorConfig.xml");
        Person person=(Person) context4.getBean("person");
        System.out.println("constructor injection: "+person);
    }
}
