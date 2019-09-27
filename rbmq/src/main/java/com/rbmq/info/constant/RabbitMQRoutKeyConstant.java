package com.rbmq.info.constant;

/**
 * 存放 RabbitMQ 中的 RoutKey 路由key的名称
 *
 * @author lcwen
 * @version V1.0: RabbitMQRoutKeyConstant.java 2019/9/5 14:34
 **/
public interface RabbitMQRoutKeyConstant {

    /**
     * 指定路由key 为 A.rk1， 表示接收路由key为 A.rk1 的消息
     */
    String A_RK1 = "A.rk1";


    /**
     * 指定路由key 为 A.#， 表示接收路由key为 A. 开头的消息
     */
   String A_ALL = "A.#";

}
