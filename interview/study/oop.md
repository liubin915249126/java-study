## java 面向对象

#### 构造方法
在 Java 中，有一种特殊的方法被称为 构造方法，也被称为构造函数、构造器等。在 Java 中，通过提供这个构造器，来确保每个对象都被初始化。构造方法只能在对象的创建时期调用一次，保证了对象初始化的进行。构造方法比较特殊，它没有参数类型和返回值，它的名称要和类名保持一致，并且构造方法可以有多个

#### 方法重载
方法名称必须相同。

参数列表必须不同（个数不同、或类型不同、参数类型排列顺序不同等）。

方法的返回类型可以相同也可以不相同。

仅仅返回类型不同不足以成为方法的重载。

重载是发生在编译时的，因为编译器可以根据参数的类型来选择使用哪个方法。

#### 类的初始化
上面我们创建出来了一个 Car 这个对象，其实在使用 new 关键字创建一个对象的时候，其实是调用了这个对象无参数的构造方法进行的初始化
初始化顺序：
静态属性：static 开头定义的属性
静态方法块： static {} 包起来的代码块
普通属性： 非 static 定义的属性
普通方法块： {} 包起来的代码块
构造函数： 类名相同的方法
方法： 普通方法

#### 对象作用域
作用域通常由 {} 的位置来决定，这也是我们常说的代码块

#### 访问控制权限
访问控制权限又称为封装
public：同一类，同一包中的类，子类，其他包中的其他类
protected：同一类，同一包中的类，子类
default：同一类，同一包中的类
private：同一类

#### 继承
```java
class Father{}
class Son extends Father{}
```
#### 多态
多态指的是同一个行为具有多个不同表现形式。
是指一个类实例（对象）的相同方法在不同情形下具有不同表现形式。封装和继承是多态的基础，也就是说，多态只是一种表现形式而已。
- 继承
- 重写父类方法
- 父类引用指向子类对象
```java
public class Fruit {

    int num;

    public void eat(){
        System.out.println("eat Fruit");
    }
}
public class Apple extends Fruit{

    @Override
    public void eat() {
        super.num = 10;
        System.out.println("eat " + num + " Apple");
    }

    public static void main(String[] args) {
        // Fruit 类型的对象竟然指向了 Apple 对象的引用，
        // 这其实就是多态 -> 父类引用指向子类对象，因为 Apple 继承于 Fruit，并且重写了 eat 方法，所以能够表现出来多种状态的形式。
        Fruit fruit = new Apple();
        fruit.eat();
    }
}
```

#### 组合
组合其实不难理解，就是将对象引用置于新类中即可。组合也是一种提高类的复用性的一种方式
。如果你想让类具有更多的扩展功能，你需要记住一句话多用组合，少用继承。
```java
public class SoccerPlayer {
    private String name;
    private Soccer soccer;
}
public class Soccer {
    private String soccerName;    
}
```
#### 代理
```java
public class Destination {

    public void todo(){
        System.out.println("control...");
    }
}

public class Device {
    private String name;
    private Destination destination;
    private DeviceController deviceController;

    public void control(Destination destination){
        destination.todo();
    }

}
public class DeviceController {
    private Device name;
    private Destination destination;
    public void control(Destination destination){
        destination.todo();
    }
}
```
[动态代理](https://mp.weixin.qq.com/s?__biz=MzkwMDE1MzkwNQ==&mid=2247495729&idx=1&sn=a8960d2bf5a3cb61ad1cbd4fe0f547bc&chksm=c04ae76ff73d6e79f0f786666dfc769fda050c497d9b5ce2a40e4218fa409c9c87640c9834af&token=807132442&lang=zh_CN#rd)
[深入理解代理](https://mp.weixin.qq.com/s?__biz=MzkwMDE1MzkwNQ==&mid=2247495842&idx=1&sn=e04e448d3e193912bf4702125028451f&chksm=c04ae7fcf73d6eea6737ff788c8cd09ed7e9c208858439c5fcd7269f1792708507fedb7b6e1b&token=941500738&lang=zh_CN#rd)

#### static
static 可以用来修饰成员变量和方法，static 用在没有创建对象的情况下调用 方法/变量。
由于静态方法不依赖于任何对象就可以直接访问，因此对于静态方法来说，是没有 this 关键字的，实例变量都会有 this 关键字。在静态方法中不能访问类的非静态成员变量和非静态方法，
[static](https://mp.weixin.qq.com/s?__biz=MzI0ODk2NDIyMQ==&mid=2247484455&idx=1&sn=582d5d2722dab28a36b6c7bc3f39d3fb&chksm=e999f135deee7823226d4da1e8367168a3d0ec6e66c9a589843233b7e801c416d2e535b383be&token=1464638247&lang=zh_CN#rd)

#### final
- final 修饰类时，表明这个类不能被继承。final 类中的成员变量可以根据需要设为 final，但是要注意 final 类中的所有成员方法都会被隐式地指定为 final 方法。
- final 修饰方法时，表明这个方法不能被任何子类重写，因此，如果只有在想明确禁止该方法在子类中被覆盖的情况下才将方法设置为 final。
- final 修饰变量分为两种情况，一种是修饰基本数据类型，表示数据类型的值不能被修改；一种是修饰引用类型，表示对其初始化之后便不能再让其指向另一个对象
[final、finally 和 finalize](https://mp.weixin.qq.com/s?__biz=MzkwMDE1MzkwNQ==&mid=2247495775&idx=1&sn=98e9f5ba4ea59616161e3c9c9c103456&source=41#wechat_redirect)