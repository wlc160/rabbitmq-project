package com.rbmq.info.producer;

import com.rbmq.info.constant.RabbitMQExchangeConstant;
import com.rbmq.info.utils.DateUtils;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 工程名:rbmq
 * 包名:com.rbmq.producer
 * 文件名:RSender
 * description:
 *
 * @author lcwen
 * @version V1.0: RSender.java 2019/9/5 11:49
 **/
@Component
public class RSender {

    @Autowired
    private AmqpTemplate amqpTemplate;

    /**
     * 发送广播消息
     * @param msg
     */
    public void sendFanoutMsg(String msg){

        //要发送的信息拼上当前时间戳
        String content = msg + "\t" + DateUtils.getDateTime();

        this.amqpTemplate.convertAndSend(RabbitMQExchangeConstant.R_FANOUT_EXCHANGE, "", content);

    }

    /**
     * 发送直连消息
     * @param msg
     * @param routeKey
     */
    public void sendDirectMsg(String msg ,String routeKey){
        //要发送的信息拼上当前时间戳
        String content = msg + "\t" + DateUtils.getDateTime();

        this.amqpTemplate.convertAndSend(RabbitMQExchangeConstant.R_DIRECT_EXCHANGE, routeKey, content);
    }

    /**
     * 发送主题消息
     * @param msg
     * @param routeKey
     */
    public void sendTopicMsg(String msg ,String routeKey){
        //要发送的信息拼上当前时间戳
        String content = msg + "\t" + DateUtils.getDateTime();
        this.amqpTemplate.convertAndSend(RabbitMQExchangeConstant.R_TOPIC_EXCHANGE, routeKey, content);
    }


}
