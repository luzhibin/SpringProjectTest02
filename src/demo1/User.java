package demo1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

//@Component("user")相当于<bean id="user" class="demo1.User"></bean>
@Component("user")
@Scope("prototype")
public class User {
    @Value("LUZHIBIN")
    public String name;

/*    @Autowired*//*根据类型注入*//*
    @Qualifier("dog")*//*根据名称来进行注入*/
    @Resource(name = "dog")
    public Dog dog;

    @PostConstruct
    public void init(){
        System.out.println("init----初始化");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("destroy-----销毁");
    }
}