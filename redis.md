nosql四大类

1、redis为什么这么快
2、分布式缓存常见的技术选型方案
3、redis和memcached的区别和共同点
redis底层使用的什么协议
4、为什么要用缓存
5、常见的缓存读写策略
6、redis除了做缓存，还能做什么
7、redis做分布式锁，有什么缺陷、Redlock算法
8、redis可以做消息队列吗
9、redis数据结构（5基础、3特殊）
一个redis实例最多能存放多少的keys，list、set、sortedset他们最多能存多少元素

10、redis中string的应用场景、字符串类型的最大存储容量
11、String还是Hash存储对象数据更好呢？
12、String的底层实现是什么
13、购物车信息用String还是hash存储更好呢？
14、使用redis实现一个排行榜怎么做？
15、set的应用场景是什么？
16、使用set实现抽奖系统怎么做？
17、使用bitmap统计活跃用户怎么做？
18、使用HyperLogLog统计页面UV怎么做？
19、redis的持久化机制
20、redis单线程模型及为什么（IO多路复用）
虚拟内存机制
热点数据和冷数据
21、redis6.0之前为什么不适用多线程
22、redis6.0之后为何引入了多线程
多线程如何开启以及配置
reids多线程的实现机制
多线程是否会导致线程安全问题
redis和memcached多线程的区别

Redis持久化数据和缓存怎么做扩容
为什么redis需要把所有数据放到内存中


23、redis的后台线程
24、redis给缓存数据设置过期时间有啥用
25、redis是如何判断数据是否过期的呢？（数据过期策略）
持久化文件对过期策略的处理
redis的RDB和AOF
在生成rdb期间，redis可以同时处理写请求吗

26、过期数据的删除策略
27、redis的内存淘汰机制
redis实现的链表有哪些特性
reids是如何实现字典的
redishash冲突了怎么办
什么是渐进式rehash
redis回收进程如何工作的？
redis回收使用的是什么算法
redis存储中文的方式


有序集合zset的底层实现
zset为何不使用红黑树等平衡树
什么是redis的intset
什么是压缩列表
什么是redisObject
五种类型分别对于哪种实现

什么是redis的pipeline
原生批命令（mset、mget）和pipeline的区别

如何保证redis中的数据都是热点数据

redis是单线程的、如何提高多核cpu的利用率
为什么要做redis分区、常见的分区算法
你知道哪些redis的分区实现方案
redis分区有什么缺点
修改配置不重启 Redis 会实时生效吗
redis发布订阅


### redis事务
28、什么是redis事务
29、如何使用redis事务
30、redis的事务支持原子性吗、支持回滚吗
31、redis事务支持持久性吗
32、如何解决redis事务的缺陷
如何保证redis的高并发
如何解决redis的并发竞争key的问题
如何保证redis的原子性
redis事务相关的命令有哪些
rediskey的过期时间和永久有效分别怎么设置



### redis性能优化
https://mp.weixin.qq.com/s/nNEuYw0NlYGhuKKKKoWfcQ
https://javaguide.cn/database/redis/redis-common-blocking-problems-summary.html
https://mp.weixin.qq.com/s/mIc6a9mfEGdaNDD3MmfFsg
https://mp.weixin.qq.com/s/FPYE1B839_8Yk1-YSiW-1Q
redis常见性能问题和解决方案

33、使用批量操作减少网络传输
34、大量key集中过期问题
35、redis bigkey
36、redis hotkey
37、慢查询命令
38、redis内存碎片
redis如何做内存优化
有哪些办法可以降低redis的内存是使用情况
redis内存用完了会发生什么

### redis生产问题
39、缓存穿透
布隆过滤器
40、缓存击穿
41、缓存雪崩
42、如何保证缓存和数据库数据的一致性
43、哪些情况可能会导致redis阻塞
如何设置key当前失效
如何实现分布式锁
如何实现排行榜功能
分布式Redis是前期做还是后期规模上来了再做好？为什么？
缓存预热
缓存降级
redis做异步队列
redis做延时队列



### redis集群
怎么实现Redis的高可用

redis sentinel
1、什么是sentinel，有什么用
哨兵的主要工作任务
哨兵模式搭建
哨兵模式的工作原理
2、sentinel如何检测节点是否下线？主管下线和客观下线的区别
3、sentinel是如何实现故障转移的
4、为什么建议部署多个sentinel节点
5、sentinel如何选择出新的master
6、如何从sentinel集群中选择出leaser
7、sentinel可以防止脑裂吗
redis集群搭建有几种模式
哨兵模式的原理
哨兵模式故障迁移流程


主从
redis主从复制的实现
redis的主从同步策略



redis cluster
1、为什么需要redis cluster，解决了什么问题，有什么优势
2、rediscluster是如何分片的
3、为什么reids cluster的哈希槽是16384个
什么是一致性hash以及解决什么问题
cluster模式的原理
cluster集群的扩容流程
cluster集群收缩流程
集群的故障发现和迁移
codis、twemproxy以及cluster方案对比
集群会有写操作丢失吗？为什么
集群之间是如何复制的
集群的最大节点个数是多少
redis集群如何选择数据库
怎么测试redis的连通性
redis集中群节点的通信机制
redis集群中节点的数据分布算法
Redis 集群方案什么情况下会导致整个集群不可用
如何实现集群中的 session 共享存储


### redis客户端
redis支持的java客户端都有什么？官方推荐哪个
jedis和redisson对比有什么优缺点





redis的基本命令
查看 Redis 使用情况及状态信息用什么命令


lru算法












