package cn.ssm.run;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RmiService {
    public static void main(String args[]){
        new ClassPathXmlApplicationContext("spring-mybatis.xml");
    }
}
