package com.rbmq.info.consumer;

import com.rbmq.info.constant.RabbitMQQueueConstant;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * 工程名:rbmq
 * 包名:com.rbmq.info.consumer
 * 文件名:DirectConsumer
 * description:
 *
 * @author lcwen
 * @version V1.0: DirectConsumer.java 2019/9/5 15:48
 **/
@Component
@RabbitListener(queues = {RabbitMQQueueConstant.R_DIRECT_QUEUE})
public class DirectConsumer {

    /**
     * 定义接收消息处理逻辑
     * @param content
     */
    @RabbitHandler
    public void handler(String content){
        System.out.println("DirectConsumer accept a message:" + content);
    }

}
