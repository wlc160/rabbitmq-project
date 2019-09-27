package com.rbmq.info.config;

import com.rbmq.info.constant.RabbitMQQueueConstant;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * RabbitMQ的Queue队列配置
 *
 * @author lcwen
 * @version V1.0: RabbitMQQueueConfig.java 2019/9/5 14:48
 **/
@Configuration
public class RabbitMQQueueConfig {


    /**
     * 创建绑定到 AFanoutExchange 交换机的队列
     * @return
     */
    @Bean
    public Queue rFanoutQueue() {
        //传入队列名称
        return new Queue(RabbitMQQueueConstant.R_FANOUT_QUEUE);
    }

    /**
     * 创建绑定到 AFanoutExchange 交换机的队列
     * @return
     */
    @Bean
    public Queue rFanoutQueue2() {
        //传入队列名称
        return new Queue(RabbitMQQueueConstant.R_FANOUT_QUEUE2);
    }

    /**
     * 创建绑定到 ADirectExchange 交换机的队列
     * @return
     */
    @Bean
    public Queue rDirectQueue() {
        //传入队列名称
        return new Queue(RabbitMQQueueConstant.R_DIRECT_QUEUE);
    }

    /**
     * 创建绑定到 ADirectExchange 交换机的队列
     * @return
     */
    @Bean
    public Queue rDirectQueue2() {
        //传入队列名称
        return new Queue(RabbitMQQueueConstant.R_DIRECT_QUEUE2);
    }

    /**
     * 创建绑定到 ATopicExchange 交换机的队列
     *
     * @return
     */
    @Bean
    public Queue rTopicQueue() {
        //传入队列名称
        return new Queue(RabbitMQQueueConstant.R_TOPIC_QUEUE);
    }
}
