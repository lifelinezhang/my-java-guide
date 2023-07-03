### 消息队列基础
##### 1、为什么要用消息队列
https://cloud.tencent.com/developer/article/1961095

##### 2、消息队列有什么缺点
https://blog.csdn.net/qq_37181069/article/details/123097966

##### 3、MQ常用协议
https://www.cnblogs.com/doit8791/p/10230326.html

##### 4、MQ的通讯模式
https://blog.csdn.net/cscer/article/details/112811

##### 5、多线程异步和MQ的区别
https://juejin.cn/post/6943129937163321351

##### 6、JMS和AMQP
https://www.cnblogs.com/myibm/p/7919073.html

##### 7、amqp协议三层
https://www.cnblogs.com/LQBlog/p/15641870.html

##### 8、amqp模型组件
https://developer.aliyun.com/article/847370

##### 9、RPC和消息队列的区别
https://www.cnblogs.com/ouhaitao/p/9261984.html

##### 10、消息队列的一些基本概念
##### 11、如何保证消息不丢失
##### 12、如何处理重复消息
##### 13、如何保证消息的有序性
##### 14、如何处理消息堆积
https://www.cnblogs.com/zhanqing/p/queue.html
https://www.cnblogs.com/linwenbin/p/13382753.html


9、如何保证消息队列的高可用
https://juejin.cn/post/6892275796870856717



12、MQ中的消息过期失效了怎么办
13、如何保证数据一致性、事务消息如何实现
14、如何设计一个消息队列
15、MQ选型比较

20、分布式消息队列技术选型
23、mq选型



### RabbitMQ
1、基本概念、组件、路由模式
2、使用场景、优缺点
3、工作模式
4、如何保证rabbit消息的顺序性
5、消息如何分发
6、消息如何路由
7、消息基于什么传输
8、如何避免消息重复投递或重复消费
9、如何确保消息正确地发送至RabbitMq？如何确保消息接收方消费了消息
10、如何保证RabbitMq消息的可靠传输
11、为什么不应该对所有的message都是用持久化机制
12、如何保证高可用？Rabbitmq集群
13、如何解决消息队列的延时以及过期失效问题
14、消息队列满了以后该怎么处理
15、有几百万的消息持续挤压几个小时，该怎么解决
16、镜像队列
17、持久化机制
18、消费端怎么进行限流
19、死信队列
20、消息的过期时间
21、pull模式
22、导致死信的原因有哪些
23、什么是优先级队列
24、延迟队列
25、rabbitmq的事务机制
26、发送确认机制
27、消费者获取消息的方式
28、消费者无法处理当前接受的消息如何来拒绝
29、消息传输保证层级
30、vhost是什么
31、说说集群中的节点类型
32、熟悉队列结构吗
33、rabbitmq中消息可能有的几种状态
34、生产者如何将消息可靠投递到MQ
35、如何保证rabbitMQ消息队列的高可用
36、rabbitmq集群
37、交换器无法根据自身类型和路由键找到符合条件队列时，有哪些处理
38、导致死信的几种原因
39、什么是信道






### RocketMQ
1、rocketmq由哪些角色组成，每个角色的作用和特点是什么
消息模型、发送消息的方式、消费方式
rocketmq的架构

2、rocketmq中的topic和jms中的queue有什么区别
3、rocketmq的broker中的消息被消费后会立即删除吗
那么消息会堆积吗，什么时候清理过期消息
4、rocketmq消费模式有几种
5、消费消息是push还是pull
为什么要主动拉取消息而不是使用事件监听方式
6、broker如何处理拉取请求的
7、rocketmq如何做负载均衡
producer端
consumer端
当消费负载均衡consumer和queue不对等的时候会发生什么
8、消息重复消费

消息过滤

9、如何让rocketmq保证消息的顺序消费
怎么保证消息发到同一个queue
10、rocketmq如何保证消息不丢失
producer端如何保证消息不丢失
broker端如何保证消息不丢失
consumer端如何保证消息不丢失
11、rocketmq的消息堆积如何处理
如何consumer和queue不对等，上线了多台也在短时间内无法消费完堆积的消息怎么办
堆积时间过长消息超时了
堆积的消息会不会进死信队列
12、rocketmq在分布式事务支持这块机制的底层原理
事务消息


延迟消息

13、如何让你来动手实现一个分布式消息中间件，整体架构你会如何设计实现
14、看过rocketmq的源码没有，如果看过，说说你的理解
15、高吞吐量下如何优化生产者和消费者的性能，从开发和运维的角度
16、roncketmq是如何保证数据的高容错性的
17、任何一台broker突然宕机了怎么办
18、broker把自己的信息注册到哪个nameserver上
nameserver的路由剔除
nameserver的路由发现
客户端对nameserver的选择策略
19、rocketmq的刷盘策略
20、rocketmq的复制策略
21、rocketmq的集群部署方式
22、rebalance机制
23、什么是消费的至少一次原则
24、rocketmq的offset的管理
25、任何一台的broker突然宕机了怎么办？还能使用吗？消息会不会丢失
26、怎么知道有哪些broker，如何知道要连哪个broker
27、nameserver到底可以部署几台机器？为什么要集群化部署
28、系统如何从nameserver获取broker信息
29、broker挂了，系统是怎么感知到的
30、master broker是如何将消息同步给slave broker的
31、消费消息时是从master获取还是slave获取
32、如果slave broker挂掉了，会对整个系统有影响吗
33、master broker突然挂了，这样会怎么样
34、为什么使用nameserver而非zookpeer
35、nameserver如何保证最终一致性
36、客户端nameserver选择策略
37、rocketmq性能比较高的原因
38、rocketmq的存储机制







### Kafka



