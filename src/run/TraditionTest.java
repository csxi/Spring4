package run;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;
import service.IUserService;

/**
 * Created by paul on 2018/5/25.
 */
//16:35,Bean属性的依赖注入

public class TraditionTest {
    @Test
    public void testTradition() {
        //spring的配置方式，IOC控制反转
        //构建一个spring的工厂，使用applicationContex
        // t.xml（spring的核心配置文件）获取对象
        ApplicationContext ac = new
                ClassPathXmlApplicationContext("applicationContext.xml");
        //从spring工厂中使用对象的标识获取对象
        IUserService userService = (IUserService) ac.getBean("UserService");
        userService.findUser();
    }
}
