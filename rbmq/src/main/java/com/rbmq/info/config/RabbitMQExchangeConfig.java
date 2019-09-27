package com.rbmq.info.config;

import com.rbmq.info.constant.RabbitMQExchangeConstant;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 工程名:rbmq
 * 包名:com.rbmq.config
 * 文件名:RabbitMQExchangeConfig
 * description:
 *
 * @author lcwen
 * @version V1.0: RabbitMQExchangeConfig.java 2019/9/5 11:25
 **/
@Configuration
public class RabbitMQExchangeConfig {

    /**
     * 以Fanout方式发送消息
     * 定义一个Exchange交换机，从该交换机接收消息
     * @return
     */
    @Bean
    public FanoutExchange rFanoutExchange(){
        return new FanoutExchange(RabbitMQExchangeConstant.R_FANOUT_EXCHANGE);
    }


    /**
     * 以主题匹配方式发送消息的交换机
     * @return
     */
    @Bean
    public TopicExchange rTopicExchange(){
        return new TopicExchange(RabbitMQExchangeConstant.R_TOPIC_EXCHANGE);
    }

    /**
     * 以直连方式发送消息的交换机
     * @return
     */
    @Bean
    public DirectExchange rDirectExchange(){
        return new DirectExchange(RabbitMQExchangeConstant.R_DIRECT_EXCHANGE);
    }




}
