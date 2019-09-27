package com.rbmq.info.constant;

/**
 * 存放 RabbitMQ 中的 Queue 队列的名称
 *
 * @author lcwen
 * @version V1.0: RabbitMQQueueConstant.java 2019/9/5 14:32
 **/
public interface RabbitMQQueueConstant {

    /**
     * 指定绑定到 RFanoutExchange 交换机的队列名称，用于接收 A 类型的信息
     */
    String R_FANOUT_QUEUE = "RFanoutQueue";

    /**
     * 指定绑定到 RFanoutExchange 交换机的队列名称，用于接收 A 类型的信息
     */
    String R_FANOUT_QUEUE2 = "RFanoutQueue2";

    /**
     * 指定绑定到 RDirectExchange 交换机的队列名称，用于接收 A 类型的信息
     */
    String R_DIRECT_QUEUE = "RDirectQueue";

    /**
     * 指定绑定到 RDirectExchange 交换机的队列名称，用于接收 A 类型的信息
     */
    String R_DIRECT_QUEUE2 = "RDirectQueue2";

    /**
     * 指定绑定到 RTopicExchange 交换机的队列名称，用于接收 A 类型的信息
     */
    String R_TOPIC_QUEUE = "R_TopicQueue";

}
