package com.mooc.jiangzh.dubbo;

import com.mooc.jiangzh.dubbo.service.ISendMsg;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-hello.xml");
        context.start();
        while (true){
            Scanner scanner = new Scanner(System.in);
            String instr = scanner.next();

            ISendMsg iSendMsg = (ISendMsg) context.getBean("consumerSendMsg");
            System.out.println(iSendMsg.sendMsg(instr));
        }
    }
}
