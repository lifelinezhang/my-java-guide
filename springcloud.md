### 一、综述
微服务演进：https://www.cnblogs.com/wzh2010/p/14940280.html

高可用概述：https://javaguide.cn/high-availability/high-availability-system-design.html

微服务基础理论：https://developer.aliyun.com/article/8611

### 路由网关
https://juejin.cn/post/6882567936033652750
https://www.cnblogs.com/javastack/p/15337244.html

什么是网关？作用是什么

网关如何实现路由功能

什么是api网关

api网关和传统网关有什么不同

如何保护api网关

如何监控和管理api网关

如何配置api网关

如何扩展api网关的功能

网关的安全性如何提高

gateway网关和nginx有什么不同

1、springcloudgateway  优点
1、springcloudgateway  处理流程
1、springcloudgateway  的路由实现
1、springcloudgateway  限流的实现
1、springcloudgateway  鉴权的实现
1、springcloudgateway  服务熔断的实现




### 二、服务注册与发现
1、cap理论
https://cloud.tencent.com/developer/article/1860632

nacos的功能特性有哪些

如何理解nacos中的命名空间

1、nacos的服务注册是如何实现的

nacos的服务注册表结构是怎样的

nacos如何避免并发读写冲突问题

临时实例与永久实例

1、nacos健康检测机制
https://juejin.cn/post/7222656390548340793

nacos中的保护阈值的作用是什么

nacos的就近访问是什么意思

3、nacos的负载均衡是如何实现的

4、nacos的故障恢复是如何实现的

5、nacos的动态配置是如何实现的

6、nacos的服务发现方式有哪些

7、nacos的优缺点有哪些

nacos的架构

nacos的数据模型（领域模型）


### 服务之间通信/负载均衡
https://zhuanlan.zhihu.com/p/457256778

https://segmentfault.com/a/1190000041228958

1、什么是feign
2、feign与openfeign的区别
3、openfeign的启动原理
4、openfeign的工作原理
5、openfeign如何负载均衡
6、openfeign如何处理错误
7、openfeign如何支持文件上传
8、如何开启日志增强
openfeign如何传参
超时如何处理
如何替换默认的httpclient
如何熔断降级
如何通讯优化
openfeign的生命周期

### 配置中心/分布式配置
https://juejin.cn/post/6899663020805341191

https://blog.csdn.net/Skyhaohao/article/details/120630387

https://zhuanlan.zhihu.com/p/62191330

1、什么是配置中心？为什么要有配置中心
市场上有哪些主流的配置中心
配置中心一般会配置什么内容

什么信息一般不会写到配置中心

项目中为什么要定义bootstrap文件
nacos配置中心宕机了，我们的服务还可以读取到配置信息吗

微服务引用中我们的客户端如何获取配置中心的信息

客户端如何感知配置中心数据变化

服务启动后没有从配置中心获取我们的配置数据是什么原因

你项目中使用的日志规范是什么
你了解项目中的日志级别吗
nacos配置管理模型的北京
nacos配置中的管理模型的怎样的
nacos客户端是够可以读取共享配置

配置中心的选型






### 熔断限流/服务降级

https://blog.csdn.net/skyhaohao/article/details/120634032

https://www.cnblogs.com/crazymakercircle/p/14285001.html

1、你了解哪些限流算法
2、sentinel默认的限流算法是什么
sentinel中的阈值应用类型？
sentinel限流规则中默认有哪些限流模式

sentinel的限流效果有哪些

sentinel为什么可以对我们的业务进行限流，原理是什么

什么是降级熔断

为什么要进行降级熔断？

sentinel中限流、降级的异常父类是谁

sentinel出现降级熔断时、系统底层抛出的异常是谁

sentinel的异常处理接口是谁
sentinel中异常处理接口下默认的实现类为？

加入sentinel中默认的异常处理规则不满足我们的需求怎么办？

我们如何自己定义sentinel中异常处理呢？

sentinel降级熔断策略有哪些

sentinel熔断处理逻辑中有哪些状态

sentinel对服务调用进行熔断以后处于什么状态

sentinel设置的熔断时长到期以后，sentinel的熔断会处于什么状态


sentinel中的熔断逻辑恢复正常调用以后，会出现什么状态

如何理解热点数据
热点数据的限流规则是怎么样的
热点数据中的特殊参数如何理解

对于热点数据的访问出现限流以后的底层异常是什么

如何理解sentinel中的系统规则

sentinel中的常用系统规则有哪些

sentinel系统保护规则被处罚以后底层会抛出什么异常

如何理解sentinel中的授权规则

sentinel的授权规则是如何设计的

如何理解sentinel中的白名单

如何理解sentinel中的黑名单

sentinel如何识别白名单和黑名单

授权规则中requestOriginParser类的作用是什么







### 链路追踪

### 分布式定时任务
https://blog.csdn.net/weixin_37854829/article/details/115196099

https://www.codetd.com/article/14796999#_147

xxl-job原理
xxl-job优缺点



xxl-job故障转移
xxl-job失败重试
xxl-job路由策略
xxl-job如何实现任务分片
xxl-job集群部署如何保证只触发一次任务？定时器质性中断如何补偿




### 分布式事务

