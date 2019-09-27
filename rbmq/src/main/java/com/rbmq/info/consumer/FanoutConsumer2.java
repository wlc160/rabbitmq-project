package com.rbmq.info.consumer;

import com.rbmq.info.constant.RabbitMQQueueConstant;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * 工程名:rbmq
 * 包名:com.rbmq.info.consumer
 * 文件名:FanoutConsumer
 * description:
 *
 * @author lcwen
 * @version V1.0: FanoutConsumer.java 2019/9/5 14:40
 **/
@Component
//表示监听名称为 RFanoutQueue2 的消息队列
@RabbitListener(queues = {RabbitMQQueueConstant.R_FANOUT_QUEUE2})
public class FanoutConsumer2 {


    /**
     * 定义接收消息处理逻辑
     * @param content
     */
    @RabbitHandler
    public void handler(String content){
        System.out.println("FanoutConsumer2 接收到的消息：" + content);
    }

}
