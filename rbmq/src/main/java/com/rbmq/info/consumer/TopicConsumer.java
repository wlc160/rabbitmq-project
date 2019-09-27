package com.rbmq.info.consumer;

import com.rbmq.info.constant.RabbitMQQueueConstant;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * 工程名:rbmq
 * 包名:com.rbmq.info.consumer
 * 文件名:TopicConsumer
 * description:
 *
 * @author lcwen
 * @version V1.0: TopicConsumer.java 2019/9/5 15:56
 **/
@Component
@RabbitListener(queues = {RabbitMQQueueConstant.R_TOPIC_QUEUE})
public class TopicConsumer {


    /**
     * 义消息接收处理逻辑
     * @param content
     */
    @RabbitHandler
    public void handler(String content){
        System.out.println("TopicConsumer 接收到的消息：" + content);
    }


}
