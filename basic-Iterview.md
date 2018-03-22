## Java 基础面试题
#### 八种基本数据类型的大小，以及他们的封装类
```java
    八种基本数据类型：int、short、float、double、long、boolean、byte、char。
    封装类分别是：Integer、Short、Float、Double、Long、Boolean、Byte、Character。
```
#### Switch能否用string做参数
>
    jdk7之前 switch 只能支持 byte、short、char、int 这几个基本数据类型和其对应的封装类型。
    switch后面的括号里面只能放int类型的值，但由于byte，short，char类型，它们会?自动?转换为int类型（精精度小的向大的转化），所以它们也支持。
    jdk1.7后 整形，枚举类型，boolean，字符串都可以。
    其实，jdk1.7并没有新的指令来处理switch string，而是通过调用switch中string.hashCode,将string转换为int从而进行判断。
>
####  equals与==的区别
>
    使用==比较原生类型如：boolean、int、char等等，使用equals()比较对象。
    1、==是判断两个变量或实例是不是指向同一个内存空间。 equals是判断两个变量或实例所指向的内存空间的值是不是相同。
    2、==是指对内存地址进行比较。 equals()是对字符串的内容进行比较。
    3、==指引用是否相同。 equals()指的是值是否相同。   
>
#### 自动拆箱和自动装箱定义：
自动装箱是将一个java定义的基本数据类型赋值给相应封装类的变量。 拆箱与装箱是相反的操作，自动拆箱则是将一个封装类的变量赋值给相应基本数据类型的变量。
```java
    Integer i = new Integer(100);
    int intNum1 = 100; //普通变量
    Integer intNum2 = intNum1;//自动装箱
    int intNum3 = intNum2; //自动拆箱
    Integer intNum4 =100;//自动装箱
```
#### Object有哪些公用方法
```java
    Object是所有类的父类，任何类都默认继承Object
    clone 保护方法，实现对象的浅复制，只有实现了Cloneable接口才可以调用该方法，否则抛出CloneNotSupportedException异常。
    equals 在Object中与==是一样的，子类一般需要重写该方法。
    hashCode 该方法用于哈希查找，重写了equals方法一般都要重写hashCode方法。这个方法在一些具有哈希功能的Collection中用到。
    getClass final方法，获得运行时类型
    wait 使当前线程等待该对象的锁，当前线程必须是该对象的拥有者，也就是具有该对象的锁。 wait() 方法一直等待，直到获得锁或者被中断。 wait(long timeout) 设定一个超时间隔，如果在规定时间内没有获得锁就返回。
    调用该方法后当前线程进入睡眠状态，直到以下事件发生
    1、其他线程调用了该对象的notify方法。 2、其他线程调用了该对象的notifyAll方法。 3、其他线程调用了interrupt中断该线程。 4、时间间隔到了。 5、此时该线程就可以被调度了，如果是被中断的话就抛出一个InterruptedException异常。
    notify 唤醒在该对象上等待的某个线程。
    notifyAll 唤醒在该对象上等待的所有线程。
    toString 转换成字符串，一般子类都有重写，否则打印句柄。
```
#### String、StringBuffer与StringBuilder的区别
>
  1.首先说运行速度，或者说是执行速度，在这方面运行速度快慢为：StringBuilder > StringBuffer > String
　 　String最慢的原因：
　　 String为字符串常量，而StringBuilder和StringBuffer均为字符串变量，即String对象一旦创建之后该对象是不可更改的，但后两者的对象是变量，是可以更改的
  2.在线程安全上，StringBuilder是线程不安全的，而StringBuffer是线程安全的(StringBuffer中很多方法可以带有synchronized关键字，所以可以保证线程是安全的)
  3.String：适用于少量的字符串操作的情况
　　StringBuilder：适用于单线程下在字符缓冲区进行大量操作的情况
　　StringBuffer：适用多线程下在字符缓冲区进行大量操作的情况
>
#### HashMap和HashTable的区别

#### HashMap的Hashcode的作用
```java
   如果x.equals(y)返回“true”，那么x和y的hashCode()必须相等。
   如果x.equals(y)返回“false”，那么x和y的hashCode()有可能相等，也有可能不等。
   如果x,y的hashCode()不相等,x.equals(y)返回“false”一定返回false。
```
#### 为什么重载hashCode方法
```java
   Object 的 equals() 方法是比较两个对象的内存地址是否相等(==) 
```
#### 为什么HashMap是线程不安全的
```java
   多线程同时put产生hash碰撞，其中一个被覆盖
   扩容时只有一个生效，其他线程数据丢失
   多线程环境中，使用HashMap进行put操作时会引起死循环
    //Hashtable
    Map<String, String> hashtable = new Hashtable<>();
    //synchronizedMap
    Map<String, String> synchronizedHashMap = Collections.synchronizedMap(new HashMap<String, String>());
    //ConcurrentHashMap
    Map<String, String> concurrentHashMap = new ConcurrentHashMap<>();
```
#### try?catch?finally，try里有return，finally还执行么
>
  会执行，在方法return动作之前，return语句执行之后，若finally中再有return语句，则此方法以finally的return作为最终返回，若finally中无return语句，则此方法以try的return作为最终返回。
>
#### Override和Overload的含义去区别
```java
   如果在子类中定义某方法与其父类有相同的名称和参数，我们说该方法被重写 (Overriding)。如果在一个类中定义了多个同名的方法，它们或有不同的参数个数或有不同的参数类型或有不同的参数次序，则称为方法的重载(Overloading)。
```
#### ArrayList、LinkedList、Vector的区别
```java
   Arraylist和Vector是采用数组方式存储数据，此数组元素数大于实际存储的数据以便增加插入元素，都允许直接序号索引元素，但是插入数据要涉及到数组元素移动等内存操作，所以插入数据慢，查找有下标，所以查询数据快，Vector由于使用了synchronized方法-线程安全，所以性能上比ArrayList要差，LinkedList使用双向链表实现存储，按序号索引数据需要进行向前或向后遍历，但是插入数据时只需要记录本项前后项即可，插入数据较快。
```
#### foreach与正常for循环效率对比
```java
   需要循环数组结构的数据时，建议使用普通for循环，因为for循环采用下标访问，对于数组结构的数据来说，采用下标访问比较好。(ArrayList)
   需要循环链表结构的数据时，一定不要使用普通for循环，这种做法很糟糕，数据量大的时候有可能会导致系统崩溃。(LinkList)
```
