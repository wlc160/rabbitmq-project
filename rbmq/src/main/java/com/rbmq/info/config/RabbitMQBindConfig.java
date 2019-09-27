package com.rbmq.info.config;

import com.rbmq.info.constant.RabbitMQRoutKeyConstant;
import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 工程名:rbmq
 * 包名:com.rbmq.info.config
 * 文件名:RabbitMQBindConfig
 * description:
 *
 * @author lcwen
 * @version V1.0: RabbitMQBindConfig.java 2019/9/5 14:28
 **/
@Configuration
public class RabbitMQBindConfig {

    /**
     * 将 RFanoutQueue 队列绑定到 RFanoutExchange 交换机上
     * 用 RFanoutQueue 队列接收 RFanoutExchange 发送过来的消息
     * @param rFanoutQueue
     * @param rFanoutExchange
     * @return
     */
    @Bean
    public Binding bindRFanoutExchangeToRFanoutQueue(Queue rFanoutQueue, FanoutExchange rFanoutExchange) {
        return BindingBuilder.bind(rFanoutQueue).to(rFanoutExchange);
    }

    /**
     * 将 RFanoutQueue2 队列绑定到 RFanoutExchange 交换机上
     * 用 RFanoutQueue2 队列接收 RFanoutExchange 发送过来的消息
     * @param rFanoutQueue2
     * @param rFanoutExchange
     * @return
     */
    @Bean
    public Binding bindRFanoutExchangeToRFanoutQueue2(Queue rFanoutQueue2 ,FanoutExchange rFanoutExchange){
        return  BindingBuilder.bind(rFanoutQueue2).to(rFanoutExchange);
    }

    /**
     * 将 rDirectQueue 队列绑定到 rDirectExchange 交换机上
     * 指定路由key 为 A.rk1
     * @param rDirectQueue
     * @param rDirectExchange
     * @return
     */
    @Bean
    public Binding bindRDirectExchangeToRDirectQueue(Queue rDirectQueue , DirectExchange rDirectExchange){
        return  BindingBuilder.bind(rDirectQueue).to(rDirectExchange).with(RabbitMQRoutKeyConstant.A_RK1);
    }

    /**
     * 将 rDirectQueue2 队列绑定到 rDirectExchange 交换机上
     * 指定路由key 为 A.rk1
     * @param rDirectQueue2
     * @param rDirectExchange
     * @return
     */
    @Bean
    public Binding bindRDirectExchangeToRDirectQueue2(Queue rDirectQueue2 ,DirectExchange rDirectExchange){
        return  BindingBuilder.bind(rDirectQueue2).to(rDirectExchange).with(RabbitMQRoutKeyConstant.A_RK1);
    }

    /**
     * 将 rTopicQueue 队列绑定到 rTopicExchange 交换机上
     * 指定路由key 为 A.#
     * @param rTopicQueue
     * @param rTopicExchange
     * @return
     */
    @Bean
    public Binding bindRTopicExchangeToRTopicQueue(Queue rTopicQueue ,TopicExchange rTopicExchange){
        return  BindingBuilder.bind(rTopicQueue).to(rTopicExchange).with(RabbitMQRoutKeyConstant.A_ALL);
    }

}
