package aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Created by paul on 2018/6/13.
 */
@Component("myAspect")
@Aspect
public class MyAspect {
    //@Before("bean( * UserService)")
    public void before(Pointcut pointcut) {
        System.out.println("第一个前置通知");
    }
}
