### 一、基础相关
##### 1、==和eauqls的区别
https://juejin.cn/post/6844903847572275207

##### 2、hashcode和equals两种方法的关系是什么
##### 3、两个对象hashcode相同，equals也一定为true吗
https://www.cnblogs.com/tanshaoshenghao/p/10915055.html

##### 4、为什么重写equals方法之后要重写hashcode方法
https://blog.csdn.net/weixin_44906271/article/details/105880719

##### 5、final的作用
##### 6、抽象类能用final修饰吗
https://www.cnblogs.com/chansblogs/p/8387801.html

##### 7、Math.round(-1.5)是多少
https://www.cnblogs.com/coderD/p/13828628.html

##### 8、抽象类与接口的区别
https://www.w3cschool.cn/article/53470374.html

##### 9、throw和throws的区别
https://blog.csdn.net/legendaryhaha/article/details/88397984

##### 10、final、finally、finalize的区别
https://www.cnblogs.com/smart-hwt/p/8257330.html

##### 11、trycatchfinally哪个部分可以省略
http://c.biancheng.net/view/1046.html

##### 12、try-catch-finally 中，如果 catch 中 return 了，finally 还会执行吗？
https://www.cnblogs.com/mark5/p/16571343.html

##### 13、switch能否作用在byte上？long上？string上？
https://zhuanlan.zhihu.com/p/531524782

##### 14、static有什么用
https://zhuanlan.zhihu.com/p/259368621

##### 15、java静态变量、代码块和静态方法的执行顺序是什么？
https://blog.csdn.net/guangdeshishe/article/details/113820557

##### 16、重载和重写的区别
##### 17、重载的方法能否根据返回值类型进行区分
https://developer.aliyun.com/article/808363

##### 18、构造器是否可以被重写？
https://blog.csdn.net/qq_32575047/article/details/79949823

##### 19、什么是不可变对象？好处是什么？
https://blog.csdn.net/weixin_45712075/article/details/120051192

##### 20、能否创建一个包含可变对象的不可变对象
https://blog.csdn.net/qq_44840148/article/details/106149956

##### 21、值传递和引用传递的区别是什么？为什么说java中只有值传递
https://blog.csdn.net/qq_47897078/article/details/120211873

##### 22、深拷贝和浅拷贝的区别
https://juejin.cn/post/7198476152632049719

##### 23、包装类型是什么？包装类型和基本类型有什么区别？
##### 24、解释一下自动装箱和拆箱
##### 25、int和Integer有什么区别？
https://blog.csdn.net/qq_40960093/article/details/102939331

##### 26、非new生成的Integer变量和new Integer()生成变量的对比
https://blog.csdn.net/clair_chen/article/details/116005614

##### 27、判断ArrayList<String>和ArrayList<Integer>是否相等
https://juejin.cn/post/6999797611146248222

##### 28、java序列化和反序列化是什么
https://www.cnblogs.com/9dragon/p/10901448.html

##### 29、为什么需要序列化和反序列化
https://blog.csdn.net/mocas_wang/article/details/107621010

##### 30、什么是serialVersionUID？

##### 31、为什么要显示制定ServialVersionUID的值？

##### 32、serialVersionUID什么时候修改？
https://cloud.tencent.com/developer/article/1943450

##### 33、java序列化中如果有些字段不想进行序列化，怎么办？
https://blog.csdn.net/qq_36279445/article/details/109095931

##### 34、静态变量会被序列化吗
https://developer.aliyun.com/ask/418791

##### 35、String、StringBuilder、StringBuffer的区别是什么？
https://juejin.cn/post/7217655750851149861

##### 36、String为什么要设计成不可变的？
https://cloud.tencent.com/developer/article/1354352

##### 37、字符型常量和字符串常量的区别
https://blog.csdn.net/cnds123321/article/details/113385921

##### 38、String str = "aaa";和String str = new String("aaa")一样吗？new String("aaa")创建了几个字符串对象
https://blog.csdn.net/weixin_42412843/article/details/124450055

##### 39、什么是泛型中的限定通配符和非限定通配符
https://www.cnblogs.com/toSeeMyDream/p/6434696.html

##### 40、List<? extends T>和List<? super T>之间有什么区别
https://developer.aliyun.com/article/640124

##### 41、NoClassDefError和ClassNotFoundException区别
https://segmentfault.com/a/1190000021292121

##### 42、java中的io流分多少种
https://blog.csdn.net/yldmkx/article/details/116676428

### 二、集合
8、Collection和Collections有什么区别
https://juejin.cn/post/7238310754498707511

9、HashMap和Hashtable有什么区别

10、Hashmap和Treemap的区别

11、HashMap的实现原理

12、HashSet的实现原理

13、ArrayList和LinkedList的区别

14、ArrayList和Vector的区别

15、哪些集合类是线程安全的

### 三、HashMap
1、HashMap有哪些特性？

2、HashMap的底层实现原理

3、HashMap中put方法是如何实现的

4、HashMap的扩容机制

5、HashMap的get是如何实现的

6、HashMap中hash函数是怎么实现的？还有哪些hash函数的实现方式？

7、为什么不直接将key作为哈希值而是与高16位做异或运算

8、为什么是16？为什么必须是2的幂？如果输入值不是2的幂比如10会怎么样？

9、谈一下当两个对象的hashCode相等时会怎么样？

10、如果两个键的hashcode相同，你如何获取值对象？

11、如果HashMap的大小超过了负载因子(load factor)定义的容量，怎么办

12、HashMap和HashTable的区别

13、请解释一下HashMap的参数loadFactor，它的作用是什么？

14、传统hashMap的缺点(为什么引入红黑树？)：

15、平时在使用HashMap时一般使用什么类型的元素作为Key？

16、拉链法导致的链表过深问题为什么不用二叉查找树代替，而选择红黑树？为什么不一直使用红黑树？

17、Java 中的另一个线程安全的与 HashMap 极其类似的类是什么？同样是线程安全，它与 HashTable 在线程同步上有什么不同？


18、为什么 ConcurrentHashMap 比 HashTable 效率要高？

19、针对 ConcurrentHashMap 锁机制具体分析（JDK 1.7 VS JDK 1.8）

20、ConcurrentHashMap 在 JDK 1.8 中，为什么要使用内置锁 synchronized 来代替重入锁 ReentrantLock？

21、ConcurrentHashMap 简单介绍

22、ConcurrentHashMap 的并发度是什么？