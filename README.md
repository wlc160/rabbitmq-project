# rabbitmq-project
rabbitmq基本使用
1、MQ 的本质是什么呢？ 

  消息队列，又叫做消息中间件。是指用高效可靠的消息传递机制进行与平台无关的 数据交流，并基于数据通信来进行分布式系统的集成。通过提供消息传递和消息队列模 型，可以在分布式环境下扩展进程的通信（维基百科）。
  
2、MQ 的几个主要特点： 

  （1）是一个独立运行的服务。生产者发送消息，消费者接收消费，需要先跟 服务器建立连接。 
  
  （2）采用队列作为数据结构，有先进先出的特点。
  
  （3）具有发布订阅的模型，消费者可以获取自己需要的消息。

3、为什么要使用 MQ？ 

  （1）对于数据量大或者处理耗时长的操作，我们可以引入 MQ 实现异步通信，减少客户端的等待，提升响应速度。 
  
  （2）对于改动影响大的系统之间，可以引入 MQ 实现解耦，减少系统之间的直接依赖。 
  
  （3）对于会出现瞬间的流量峰值的系统，我们可以引入 MQ 实现流量削峰，达到保 护应用和数据库的目的。 

4、使用消息队列带来的一些问题 ？

  （1）系统可用性降低：原来是两个节点的通信，现在还需要独立运行一个服务，如果 MQ 服务器或者通信网络出现问题，就会导致请求失败。 
  
  （2）系统复杂性提高： 为什么说复杂？第一个就是你必须要理解相关的模型和概念，才 能正确地配置和使用 MQ。第二个，使用 MQ 发送消息必须要考虑消息丢失和消息重复 消费的问题。一旦消息没有被正确地消费，就会带来数据一致性的问题。 
  
  所以，我们在做系统架构的时候一定要根据实际情况来分析，不要因为我们说了这 么多的 MQ 能解决的问题，就盲目地引入 MQ。

5、基本特性

  （1）高可靠：RabbitMQ 提供了多种多样的特性让你在可靠性和性能之间做出权衡，包 括持久化、发送应答、发布确认以及高可用性。 

  （2）灵活的路由：通过交换机（Exchange）实现消息的灵活路由。 

  （3）支持多客户端：对主流开发语言（Python、Java、Ruby、PHP、C#、JavaScript、 Go、Elixir、Objective-C、Swift 等）都有客户端实现。 
  
  （4）集群与扩展性：多个节点组成一个逻辑的服务器，支持负载。 
  
  （5）高可用队列：通过镜像队列实现队列中数据的复制。
  
  （6）权限管理：通过用户与虚拟机实现权限管理。 
  
  （7）插件系统：支持各种丰富的插件扩展，同时也支持自定义插件。 
  
  （8）与 Spring 集成：Spring 对 AMQP 进行了封装。
