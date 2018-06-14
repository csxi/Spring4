package run;

import entity.Car;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * Created by paul on 2018/5/28.
 */

public class BeanTest1 {
    @Test
    public void test(){
        ApplicationContext applicationContext=
    new ClassPathXmlApplicationContext("applicationContext.xml");
        Car car = (Car) applicationContext.getBean("Car");
        System.out.println(car);
    }
}
