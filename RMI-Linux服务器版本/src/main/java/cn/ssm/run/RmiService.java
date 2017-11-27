package cn.ssm.run;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RmiService {
    public static void main(String args[]) throws InterruptedException {
        System.setProperty("java.rmi.server.hostname" , "116.62.225.7");
        new ClassPathXmlApplicationContext("spring-mybatis.xml");
        Object lock = new Object();
        synchronized (lock) {
            lock.wait();
        }
    }
}
