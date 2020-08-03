package cn.qphone.spring;

import cn.qphone.spring.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestIOC {
    public static void main(String[] args) {
        quickStart();
    }

    public static void quickStart(){
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("classpath:applicationContext.xml");

        Person p = (Person) applicationContext.getBean("c1");
        Person p2 = (Person) applicationContext.getBean("c2");

        p.showinfo();
        p2.showinfo();
    }
}
