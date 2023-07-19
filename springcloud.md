### 一、综述
微服务演进：https://www.cnblogs.com/wzh2010/p/14940280.html

高可用概述：https://javaguide.cn/high-availability/high-availability-system-design.html

微服务基础理论：https://developer.aliyun.com/article/8611

### 二、路由网关
https://juejin.cn/post/6882567936033652750
https://www.cnblogs.com/javastack/p/15337244.html

##### 1、什么是网关？作用是什么
https://juejin.cn/post/7187583802099630136

##### 2、网关如何实现路由功能
https://blog.csdn.net/sweatOtt/article/details/117710163

##### 3、什么是api网关
https://info.support.huawei.com/info-finder/encyclopedia/zh/API%E7%BD%91%E5%85%B3.html

https://www.zhihu.com/tardis/zm/art/144669763?source_id=1005

https://zhuanlan.zhihu.com/p/500587132

https://developer.aliyun.com/article/847511

##### 4、springcloudgateway  优点
https://juejin.cn/post/6854573221094637575

##### 5、springcloudgateway  处理流程
https://www.jianshu.com/p/c40a757fad01
https://juejin.cn/post/7044447160821088263

##### 6、springcloudgateway  的路由实现
https://juejin.cn/post/7038231474465669157

##### 7、springcloudgateway  限流的实现
https://cloud.tencent.com/developer/article/1509723

##### 8、常见的限流算法
https://www.cnblogs.com/LBSer/p/4083131.html

##### 9、springcloudgateway  鉴权的实现
##### 10、springcloudgateway  服务熔断的实现




### 三、服务注册与发现
##### 1、cap理论
https://cloud.tencent.com/developer/article/1860632

##### 2、nacos的功能特性有哪些
https://nacos.io/zh-cn/docs/what-is-nacos.html

##### 3、nacos的服务发现方式有哪些
https://segmentfault.com/a/1190000041376137

##### 4、nacos的服务注册是如何实现的
https://blog.csdn.net/Saintmm/article/details/121981184
https://blog.csdn.net/Saintmm/article/details/122019300
https://blog.csdn.net/Saintmm/article/details/122269468

##### 5、nacos的服务注册表结构是怎样的
https://www.cnblogs.com/wekenyblog/p/17517450.html

##### 6、nacos如何避免并发读写冲突问题
https://www.cnblogs.com/wekenyblog/p/17517864.html

##### 7、临时实例与永久实例
https://www.cnblogs.com/l1pe1/p/16727244.html

##### 8、nacos健康检测机制
https://juejin.cn/post/7222656390548340793

##### 9、nacos中的保护阈值的作用是什么
https://juejin.cn/post/7064380271461662756

##### 10、nacos的就近访问是什么意思
https://nacos.io/en-us/blog/cmdb.html

##### 11、nacos的负载均衡是如何实现的
https://developer.aliyun.com/article/845183

##### 12、nacos的故障恢复是如何实现的

##### 13、nacos的动态配置是如何实现的
https://blog.csdn.net/wangliangluang/article/details/127040023

##### 14、nacos的架构

##### 15、nacos的数据模型（领域模型）


### 四、服务之间通信/负载均衡
https://zhuanlan.zhihu.com/p/457256778

https://segmentfault.com/a/1190000041228958

##### 1、什么是feign
##### 2、feign与openfeign的区别
##### 3、openfeign的启动原理
##### 4、openfeign的工作原理
https://www.cnblogs.com/651434092qq/p/14260784.html

##### 5、openfeign如何负载均衡
https://developer.aliyun.com/article/775626

##### 6、openfeign如何处理错误
https://www.yisu.com/zixun/603222.html

##### 7、openfeign如何支持文件上传
https://chenyongjun.vip/articles/109

##### 8、如何开启日志增强
##### 9、openfeign如何传参
https://www.cnblogs.com/nhdlb/p/12783453.html

##### 10、超时如何处理
##### 11、如何替换默认的httpclient
##### 12、如何熔断降级
##### 13、如何通讯优化
##### 14、openfeign的生命周期
https://juejin.cn/post/7019848193449918501

### 五、配置中心/分布式配置
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






### 六、熔断限流/服务降级

https://blog.csdn.net/skyhaohao/article/details/120634032

https://www.cnblogs.com/crazymakercircle/p/14285001.html

##### 1、你了解哪些限流算法
https://www.cnblogs.com/liqiangchn/p/14253924.html

##### 2、sentinel默认的限流算法是什么
##### 3、sentinel中的阈值应用类型？
https://www.jianshu.com/p/2f96a526d17f

##### 4、sentinel限流规则中默认有哪些限流模式
https://blog.csdn.net/QRLYLETITBE/article/details/125834577

##### 5、sentinel的限流效果有哪些
https://www.cnblogs.com/linjiqin/p/15369129.html

##### 6、sentinel为什么可以对我们的业务进行限流，原理是什么
https://www.cnblogs.com/wuzhenzhao/p/11453649.html

##### 7、什么是降级熔断

##### 8、为什么要进行降级熔断？
https://www.cnblogs.com/xiaowenshu/p/11649439.html

##### 9、sentinel中限流、降级的异常父类是谁

##### 10、sentinel出现降级熔断时、系统底层抛出的异常是谁

##### 11、sentinel的异常处理接口是谁
##### 12、sentinel中异常处理接口下默认的实现类为？

##### 13、加入sentinel中默认的异常处理规则不满足我们的需求怎么办？

##### 14、我们如何自己定义sentinel中异常处理呢？

##### 15、sentinel降级熔断策略有哪些
https://www.cnblogs.com/linjiqin/p/15374998.html

##### 16、sentinel熔断处理逻辑中有哪些状态

##### 17、sentinel对服务调用进行熔断以后处于什么状态

##### 18、sentinel设置的熔断时长到期以后，sentinel的熔断会处于什么状态


##### 19、sentinel中的熔断逻辑恢复正常调用以后，会出现什么状态

##### 20、如何理解热点数据
##### 21、热点数据的限流规则是怎么样的
##### 22、热点数据中的特殊参数如何理解

##### 23、对于热点数据的访问出现限流以后的底层异常是什么

##### 24、如何理解sentinel中的系统规则

##### 25、sentinel中的常用系统规则有哪些

##### 26、sentinel系统保护规则被处罚以后底层会抛出什么异常

##### 27、如何理解sentinel中的授权规则

##### 28、sentinel的授权规则是如何设计的

##### 29、如何理解sentinel中的白名单

##### 30、如何理解sentinel中的黑名单

##### 31、sentinel如何识别白名单和黑名单

##### 32、授权规则中requestOriginParser类的作用是什么


### 七、链路追踪



### 八、分布式定时任务
https://blog.csdn.net/weixin_37854829/article/details/115196099

https://www.codetd.com/article/14796999#_147

##### 1、xxl-job原理
https://blog.csdn.net/weixin_38004638/article/details/116086122

##### 2、xxl-job优缺点

##### 3、xxl-job故障转移
##### 4、xxl-job失败重试

##### 5、xxl-job路由策略
https://juejin.cn/post/7047149322475044877

##### 6、xxl-job如何实现任务分片
https://www.cnblogs.com/mazhuang/p/14903280.html

##### 7、xxl-job集群部署如何保证只触发一次任务？定时器质性中断如何补偿
https://blog.csdn.net/xiaopeng_code/article/details/119193317



### 九、分布式事务
https://www.cnblogs.com/crazymakercircle/p/14375424.html

1、什么是分布式事务

2、cap与base

3、分布式事务分类：柔性事务与刚性事务

4、

2、分布式事务有哪些解决方案

3、你们是如何处理的



























