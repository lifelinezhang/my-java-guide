### JVM内存结构
##### 1、jvm内存区域划分
##### 2、OOM
https://zhuanlan.zhihu.com/p/43279292
https://cloud.tencent.com/developer/article/1810426
##### 3、内存泄漏
https://blog.csdn.net/wuhuayangs/article/details/122594327
一个对象还在但是他的引用却不在了，会导致内存泄漏
##### 4、深拷贝和浅拷贝
https://blog.csdn.net/weixin_44772566/article/details/136515491
##### 5、jvm如何分配直接内存，new对象如何不分配在堆而分配在栈上
https://www.cnblogs.com/myseries/p/12884249.html
##### 6、常量池
https://cloud.tencent.com/developer/article/1810426
https://tech.meituan.com/2014/03/06/in-depth-understanding-string-intern.html
##### 7、为什么要把堆和栈区分出来？栈不是也可以存储数据吗？
https://blog.csdn.net/NZC2237/article/details/135159926
##### 8、为什么不把基本类型放堆中？
https://zhuanlan.zhihu.com/p/442259646
##### 9、对象在内存中是如何布局的？（这一块跟多线程有关系）
https://blog.csdn.net/Alphr/article/details/106295538
https://www.cnblogs.com/javazhiyin/p/14023183.html
https://www.toutiao.com/article/6934342274692268556/?group_id=6934342274692268556（对象的内存布局）
##### 10、java程序是如何执行的
https://blog.csdn.net/xiaoliangtx/article/details/118675229
##### 11、说一下堆内存中对象的分配的基本策略
https://blog.csdn.net/u011069294/article/details/107325136
##### 12、在一个静态方法内调用一个非静态成员为什么是非法的



### JMM（java内存模型，通常与多线程、并发相关）
https://javaguide.cn/java/concurrent/jmm.html
##### 1、核心是原子性、可见性、有序性
##### 2、指令重排：有哪些？底线是什么？怎么保证？
##### 3、happends-before
##### 4、内存屏障分类
##### 5、volatile：保证可见性和有序性（禁止指令重排）
##### 6、synchronized：可见性通过清除工作内存实现；原子性
##### 7、final（this逸出，对象的安全发布，内存语义）
https://blog.csdn.net/gd_yuzhe/article/details/119031820（JMM综述）
https://blog.csdn.net/wyttRain/article/details/114520547 （内存屏障）
https://blog.csdn.net/qq_37705280/article/details/117777680（双重检验锁的解析）
##### 8、对象分配内存是否线程安全？
##### 9、当一个线程进入某个对象的一个synchronized的实例方法后，其它线程是否可进入此对象的其它方法？

### 类加载机制
##### 1、类加载过程
##### 2、双亲委派模型
##### 3、classload机制详解
##### 4、类加载为什么要使用双亲委派模式，有没有什么场景是打破了这个模式？


### 垃圾收集
##### 1、如何判断对象是否可以被回收
##### 2、染色标记、读写屏障
##### 3、java中都有哪些引用类型
##### 4、垃圾回收算法与应用场景
##### 5、垃圾收集器的种类、垃圾回收过程、应用场景
##### 6、新生代与老年代的垃圾收集器组合
##### 7、jvm调优工具
##### 8、常用jvm调优参数
##### 9、jvm调优经验
##### 10、GC有环怎么处理
##### 11、分析System.GC方法
##### 12、GCROOT指的是哪些东西
##### 13、被引用的对象就一定能存活吗？


### JVM调优
多读几遍：https://developer.aliyun.com/article/928676

##### 1、整体思路：
jvm调优首先要判断有没有问题？这个要看哪些数据特征？

其次哪个特征异常的话通常可能会是什么问题？

怎么进行问题的排除，确定到底是哪个问题？

如何调整进行解决？



##### 2、jstack案例
https://blog.csdn.net/CoreyXuu/article/details/110624151

https://www.cnblogs.com/jimoliunian/p/12975201.html


##### 3、cpu负载过高：
可能的原因：
- 频繁GC
- 死循环、死锁、线程阻塞、io wait等等

死循环和死锁可以通过jstack来查看占用cpu最高的业务线程的堆栈来定位

https://zhuanlan.zhihu.com/p/140742113


##### 4、jvm内存指标：
内存溢出排查思路：
项目启动的时候要设置内存溢出异常时的日志打印，然后发生溢出的时候导出dump文件进行分析

https://cloud.tencent.com/developer/article/2000708

内存泄漏：
观察gc的情况总会有一些内存回收不掉

https://www.jianshu.com/p/37f7cca2ce5d

堆外内存：

https://juejin.cn/post/7255634554987020343

反射：

https://heapdump.cn/article/54786

##### 5、生产环境下jvm启动参数：
https://cloud.tencent.com/developer/article/1903501

