## java 基本学习
#### index.java
```java
   while,for// 循环
```
#### Array.java java中的数组
定义数组的方法
```java
    int Array [] = {1,2,3,4};
    int Array1 [] = new int[5];
    int[] nums = new int[] { 61, 23, 4, 74, 13, 148, 20 };
``` 

#### Fun.java java中的方法
Java方法定义
```java
   访问修饰符 返回值类型 方法名(参数列表){
       方法体
   }
```
方法的重载
```java
   1、 必须是在同一个类中
   2、 方法名相同
   3、 方法参数的个数、顺序或类型不同
   4、 与方法的修饰符或返回值没有关系
```

#### Catch.java 异常处理
```java
   try {

   } catch (excption e) {

   } catch (excption e) {

   } finally{
       
   }
```
多重：先子后父

```java
   throw 
   throws
```
自定义异常
```java
   public class DrunkException extends Exception{
       public DrunkException(){
          
       } 
       public DrunkException(String message){
           super(message)
       }
   } 
```
异常链
// 

#### String
创建
```java
   String s1 = 'liubin'
   String s2 = new String();
   String s2 = new String('liubin');
```
不可变性
```java
   StringBuilder
   StringBuffer
```
#### java 的包装类
```java
   Integer m = new Integer('8');
```
##### 基本类型与包装类型的转换
```java
   // 定义double类型变量
		double a = 91.5;
         // 手动装箱
		Double b =  new   Double(a);    
        // 自动装箱
		Double c =    a   ;(Integer i = Integer.valueOf(100);)
        System.out.println("装箱后的结果为：" + b + "和" + c);
        // 定义一个Double包装类对象，值为8
		Double d = new Double(87.0);
        // 手动拆箱
		double e =     d.doubleValue()          ;
        // 自动拆箱
		double f =        d        ;
```
##### 基本类型和字符串之间的转换
1. 使用包装类的 toString() 方法
2. 使用String类的 valueOf() 方法
3. 用一个空字符串加上基本类型，得到的就是基本类型数据对应的字符串

1. 调用包装类的 parseXxx 静态方法
2. 调用包装类的 valueOf() 方法转换为基本类型的包装类，会自动拆箱

#### Date 和 SimpleDateFormat 类
```java
   Date now =  new Date();
   SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
```
#### Calendar 类的应用
```java
    // 创建Calendar对象
    Calendar c = Calendar.getInstance();
    // 获取Date对象
    Date date = c.getTime();
    // 获取当前毫秒数
    Long time = c.getTimeInMillis();
```
#### Math 类
```java
   // 0-10 的随机整型
   int x = (int)Math.round(Math.random()*10);
```