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