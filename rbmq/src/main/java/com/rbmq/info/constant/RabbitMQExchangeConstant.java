package com.rbmq.info.constant;

/**
 * 工程名:rbmq
 * 包名:com.rbmq.constant
 * 文件名:RabbitMQExchangeConstant
 * description:
 *
 * @author lcwen
 * @version V1.0: RabbitMQExchangeConstant.java 2019/9/5 11:29
 **/
public interface RabbitMQExchangeConstant {

    /**
     * 以fanout广播式方法发送A信息的Exchange名称
     */
    String R_FANOUT_EXCHANGE = "RFanoutExchange";

    /**
     * 以topic主题式方法发送A信息的Exchange名称
     */
    String R_TOPIC_EXCHANGE = "RTopicExchange";

    /**
     * 以direct直连式发送信息的交换机名称
     */
    String R_DIRECT_EXCHANGE = "RDirectExchange";

}
