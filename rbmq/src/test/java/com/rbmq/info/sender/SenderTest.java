package com.rbmq.info.sender;

import com.rbmq.info.constant.RabbitMQRoutKeyConstant;
import com.rbmq.info.producer.RSender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 工程名:rbmq
 * 包名:com.rbmq.sender
 * 文件名:SenderTest
 * description:
 *
 * @author lcwen
 * @version V1.0: SenderTest.java 2019/9/5 11:54
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class SenderTest {

    @Autowired(required = false)
    private RSender rSender;

    @Test
    public void testFanoutMsg(){
        String msg = "Hello ,my name is wlc, this is a msg of fanout";
        this.rSender.sendFanoutMsg(msg);
    }

    @Test
    public void testDirectMsg(){
        String msg = "Hello ,my name is wlc, this is a msg of direct";
        this.rSender.sendDirectMsg(msg, RabbitMQRoutKeyConstant.A_RK1);
    }

    @Test
    public void testTopicMsg(){
        String msg = "Hello ,my name is wlc, this is a msg of topic";
        this.rSender.sendTopicMsg(msg,RabbitMQRoutKeyConstant.A_ALL);
    }

}
