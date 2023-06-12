### 参考大纲
https://cloud.tencent.com/developer/article/2193997

### 基础知识
##### 1、数据类型及区别
https://blog.csdn.net/Hicodden/article/details/107394343
https://zhuanlan.zhihu.com/p/352503879
https://www.cnblogs.com/yoyowin/p/15265418.html

##### 2、数据类型长度取值解析
https://my.oschina.net/u/2607135/blog/1838589

##### 3、数据库设计三大范式
https://blog.csdn.net/A_art_xiang/article/details/113880638

##### 4、数据库连接池
https://blog.csdn.net/CrankZ/article/details/82874158

##### 5、你可以用什么来确保表格里的字段只接受特定范围里的值
https://blog.csdn.net/horses/article/details/106529341


### 索引
##### 1、索引类型
##### 2、索引优缺点
##### 3、索引的数据结构
##### 4、聚簇索引与非聚簇索引，其B+树实现有什么区别、各自的查找匹配逻辑
##### 7、索引的底层实现原理和优化（innodb和myisam实现的区别）
##### 8、最左匹配
##### 9、覆盖索引、回表
https://developer.aliyun.com/article/831250
https://www.cnblogs.com/gotodsp/p/12559159.html

##### 10、创建索引的原则
https://blog.csdn.net/Elliot_Elliot/article/details/115743125

##### 11、前缀索引
https://blog.csdn.net/wdjnb/article/details/122880079

##### 12、索引下推
https://juejin.cn/post/7005794550862053412

##### 13、索引失效
https://blog.csdn.net/feiying0canglang/article/details/121239921

##### 14、为什么LIKE以%开头索引会失效？一定会失效吗？
https://blog.csdn.net/xue_mind/article/details/117698061
https://juejin.cn/post/7130083417223331848

##### 15、如果表中有字段为null，又被经常查询该不该给这个字段创建索引？
##### 16、有字段为null索引是否会失效？
https://blog.csdn.net/qq_41893274/article/details/112297443
https://blog.csdn.net/cxu123321/article/details/107861422
https://cloud.tencent.com/developer/article/1469056

##### 17、为什么官方建议使用自增长主键作为索引？（说一下自增主键和字符串类型主键的区别和影响）
https://blog.csdn.net/u014571143/article/details/129273389

##### 18、优化器
##### 19、一个表有多个索引的时候，能否手动选择使用哪个索引？（force index）
##### 20、能否查看到索引选择的逻辑？是否使用过optimizer_trace？
##### 21、多个索引优先级是如何匹配的？
https://blog.csdn.net/adminpd/article/details/124651881
https://www.cnblogs.com/michael9/p/12929775.html
https://zhuanlan.zhihu.com/p/192707721
https://blog.csdn.net/lilizhou2008/article/details/107554975
http://blog.itpub.net/28218939/viewspace-2658978/

##### 22、使用Order By时能否通过索引排序？
https://cloud.tencent.com/developer/article/1181272

##### 23、通过索引排序内部流程是什么？
##### 24、什么是双路排序和单路排序
https://blog.csdn.net/xianyun1992/article/details/107651184

##### 25、group by 分组和order by在索引使用上有什么区别？
https://www.jianshu.com/p/b2963c29af0e

##### 26、主键和候选键有什么区别?
https://www.cnblogs.com/lab-zj/p/12167280.html

##### 27、简单描述MySQL中，索引,主键,唯一索引, 联合索引的区别，对数据库的性能有什么影响(从读写两方面什么情况下设置了索|但无法使用
https://blog.csdn.net/congbaobei/article/details/79624512

##### 28、一个B+树大概能存放多少条索引记录
https://juejin.cn/post/6973647815473889311

##### 29、什么时候适合创建索引、什么时候不适合创建索引
https://zhuanlan.zhihu.com/p/616767033


### 数据结构
##### 1、Hash和B+树的区别
##### 2、B+树和二叉查找树的区别
##### 3、什么是2-3树 2-3-4树
##### 4、平衡二叉树、红黑树、B树、B+树的区别
https://blog.csdn.net/qq_38163244/article/details/109704712
https://www.cnblogs.com/henuliulei/p/15114440.html
https://blog.csdn.net/chen_zhang_yu/article/details/52415077


### 存储
##### 1、常见的存储引擎及如何选择
https://zhuanlan.zhihu.com/p/394998355

##### 2、MyISM和Innodb
https://zhuanlan.zhihu.com/p/75165526
https://blog.csdn.net/catch_exception/article/details/130035662

##### 3、Innodb的特性
https://www.cnblogs.com/zhs0/p/10528520.html

##### 4、Innodb为什么使用自增主键
https://blog.csdn.net/m0_45406092/article/details/111940017

##### 5、Innodb的架构设计
##### 6、Innodb的页、区、段
##### 7、页由哪些数据组成
##### 8、页插入记录的过程
https://juejin.cn/post/7007421609900245000
https://developer.aliyun.com/article/743573
https://developer.aliyun.com/article/743582
https://developer.aliyun.com/article/743590
https://blog.csdn.net/gb4215287/article/details/113185778
https://developer.aliyun.com/article/743882
https://juejin.cn/post/6974225353371975693
https://blog.csdn.net/lvqinglou/article/details/12022308

##### 9、缓存与缓冲区
https://blog.csdn.net/Hpsyche/article/details/104460944


11、Innodb有哪些线程
14、innodb的事务实现原理
16、myism的应用场景
17、myism存储引擎特性有哪些
19、Mysql内部有哪些核心模块组成，作用是什么？
20、能否单独为一张表设置存储引擎？
21、阿里、京东等大厂都有自研的存储引擎，如何开发一套自己的？
22、MySQL 存储引擎架构了解吗？
23、存储时期
24、Myql 中的事务回滚机制概述


### 分库分表
1、类型
2、可能遇到的问题
3、中间件
4、实现分库分表工具的实现思路

### 读写分离
1、说一下读写分离常见方案？



### 事务
1、什么是数据库事务
2、四大特性及如何实现
3、事务的并发问题，mysql是如何避免的
4、隔离级别及如何实现的、如何选择隔离级别
5、完整性约束
6、XA协议
7、xa事务
8、xa事务与普通事务区别是什么
9、什么是2pc 3pc
10、缓存可以提高事务隔离级别的性能吗
11、原子性、持久性是如何实现的

### 锁
1、有哪些锁以及锁的作用
2、隔离级别和锁的关系
3、Innodb的锁算法
4、快照度和当前读
5、MVCC及其实现
6、死锁的原因和处理办法
7、锁的优化策略
8、乐观锁与悲观锁
9、select for update会产生哪些操作
10、什么是一致性非锁定读和锁定读？
11、表级锁和行级锁有什么区别？
12、行级锁是如何实现的
13、当前读和快照读分别是什么？
14、什么是共享锁
15、什么事排他锁
16、什么事意向锁


### 主从
1、什么是主从复制
2、作用
3、架构
4、实现原理
5、异步复制和半同步
6、主从常见问题及解决方式
7、主从同步延迟的解决办法
8、复制流程
9、什么是 MySQL 多实例，如何配置 MySQL 多实例？
10、如何开启从库的 binlog 功能？
11、MySQL 如何实现双向互为主从复制，并说明应用场景？
12、MySQL 如何实现级联同步，并说明应用场景？
13、MySQL 主从复制故障如何解决？
14、如何监控主从复制是否故障？
15、MySQL 数据库如何实现读写分离？
16、生产一主多从从库宕机，如何手工恢复？


### 日志
1、有哪些常见日志
2、bin log作用是什么？
3、redo log作用是什么？
4、undo log作用是什么？
5、Mysql日志是否实时写入磁盘？
6、bin log刷盘机制是如何实现的？
7、redo log刷盘机制是如何实现的？
8、undo log刷盘机制是如何实现的？
9、MySQL的binlog有有几种录入格式？分别有什么区别？
10、Mysql集群同步时为什么使用binlog？优缺点是什么？
11、innodb中有多少中日志
12、profile的意义以及使用场景

### 视图
1、视图
2、游标
3、存储过程
4、触发器

### SQL
1、sql关键字的执行顺序
2、in和exists的区别
3、union和union all的区别
4、drop、delete和truncate的区别

5、一条sql是如何执行的
6、如何判断sql走了索引
7、索引失效
8、where子句如何优化
9、超大分页或者深度分页如何处理
10、大表查询如何优化
11、注入漏洞
12、sql的生命周期
13、慢sql监控及查询、优化
14、MySQL Sleep 线程过多如何解决？
15、sort_buffer_size 参数作用？如何在线修改生效？
16、Binlog 工作模式有哪些？各什么特点，企业如何选择？
17、误操作执行了一个 drop 库 SQL 语句，如何完整恢复？
18、如何在线正确清理 MySQL binlog？
19、mysqldump 备份使用了-A -B 参数，如何实现恢复单表？
20、子查询与join哪个效率高？为什么
21、join查询可以无限叠加吗？Mysql对join查询有什么限制吗？
22、join 查询算法了解吗？
23、如何优化过多join查询关联？
24、是否有过mysql调优经验？
25、开发中使用过哪些调优工具？
26、索引如何进行分析和调优？
27、mysql提示“不存在此列”的时候，是哪个节点爆出的？
28、

### 数据库设计
1、可以使用MySQL直接存储文件吗
2、如何存储ip地址
3、长文本如何存储？
4、大段文本如何设计表结构？
5、大段文本查找时如何建立索引？
6、为什么不使用字符串存储日期？
7、如果需要使用时间戳 timestamp和int该如何选择？
8、日期，时间如何存取？
9、TIMESTAMP，DATETIME 的区别是什么？
10、decimal与ﬂoat,double的区别是什么？
11、浮点类型如何选型？为什么？
12、预编译sql是什么？有什么好处
13、超键、候选键、主键、外键分别是什么？

### 常见sql手写题



### 运维相关
##### 1、mysql数据库服务器性能分析的方法命令有哪些
https://zhuanlan.zhihu.com/p/612656741

##### 2、mysq有关权限的几个表
https://blog.csdn.net/m0_50370837/article/details/124189933

##### 3、备份
https://zhuanlan.zhihu.com/p/597980094
https://blog.csdn.net/CN_TangZheng/article/details/103884575
https://juejin.cn/post/7065566178625880101

##### 4、mysql服务器毫无规律的异常重启如何排查问题？
https://blog.csdn.net/qq_40907977/article/details/114655938
https://blog.csdn.net/weixin_43424368/article/details/109294148

##### 5、mysql 线上修改表结构有哪些风险? （元数据锁）
https://juejin.cn/post/7209319092514209853
https://www.cnblogs.com/wangtao_20/p/3504395.html

##### 6、什么是mysql多实例部署？
https://blog.csdn.net/huyinghao03/article/details/116614138

##### 7、MySQL 数据库作发布系统的存储，一天五万以上的增量，预计运维二年怎么优化?
https://developer.aliyun.com/ask/499541

##### 8、如何加强 MySQL 安全，请给出可行的具体措施？`