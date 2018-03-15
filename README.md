## java-study
```java
   public static void main(String[] args){

   }
```
## java面向对象
#### 创建类，对象
类名文件一致，首字母大写
##### 创建类

```java
   public class Telphone{
    // 成员变量
    float screen;
    float cpu;
    float mem;
    // 方法
    void call(){
        System.out.printIn(screen +'')
    } 
   }
```
##### 实例化对象
```java
   Telphone phone = new Telphone();
   phone.screen = 5; //赋值
   phone.call(); //调用方法
```
##### 成员变量与局部变量
成员变量：类中定义，描述对象要有什么，整个类中使用，会有初始值
局部变量：类的方法中定义，方法中临时保存数据，方法内部使用，没有初始值，与成员变量同名时优先级高(就近原则)

#### java的构造方法
构造方法名与类名相同，没有返回值,创建对象时执行
有参无参
方法重载：根据参数
```java
   public class Telphone{
    public Telphone(){
        
    }
   }
```
#### 静态变量，静态方法
1、 静态方法中可以直接调用同类中的静态成员，但不能直接调用非静态成员，如果希望在静态方法中调用非静态变量，可以通过创建类的对象，然后通过对象来访问非静态变量
2、 在普通成员方法中，则可以直接访问同类的非静态变量和静态变量
3、 静态方法中不能直接调用非静态方法，需要通过对象来访问非静态方法。

#### 静态初始化块
静态初始化块只在类加载时执行，且只会执行一次，同时静态初始化块只能给静态变量赋值，不能初始化普通的成员变量。
```java
   public class HelloWorld {
    
    String name; // 声明变量name
	String sex; // 声明变量sex
	static int age;// 声明静态变量age
    // 构造方法
	public   HelloWorld     () { 
		System.out.println("通过构造方法初始化name");
		name = "tom";
	}
    // 初始化块
	{ 
		System.out.println("通过初始化块初始化sex");
		sex = "男";
	}
    // 静态初始化块
	    static    { 
		System.out.println("通过静态初始化块初始化age");
		age = 20;
	}
	public void show() {
		System.out.println("姓名：" + name + "，性别：" + sex + "，年龄：" + age);
	}
	public static void main(String[] args) {
        // 创建对象
		HelloWorld hello = new HelloWorld();
		// 调用对象的show方法
        hello.show(); 
	}
}
```

#### 封装
```java
   private
   getter setter
```
```java
    public class Telphone{
    // 成员变量
    private float screen;
    private float cpu;
    float mem;
    // get
    public float getScreen(){
        return screen;
    }
    // set
    public void setScreen(float screen){
        this.screen = screen;
    }
   }
```
#### 使用包管理类
管理java文件，解决同名冲突
包全小写
import 引用
 
#### 访问修饰符
```java
   private: 本类
   default(默认)：本类，同包
   protected:本类，同包,子类
   public:本类，同包,子类,其他
```

#### java中this关键字
指代当前对象

#### 内部类
内部类（ Inner Class ）就是定义在另外一个类里面的类。与之对应，包含内部类的类被称为外部类。
1. 内部类提供了更好的封装，可以把内部类隐藏在外部类之内，不允许同一个包中的其他类访问该类
2. 内部类的方法可以直接访问外部类的所有数据，包括私有的数据
3. 内部类所实现的功能使用外部类同样可以实现，只是有时使用内部类更方便
成员内部类:
```java
   //外部类HelloWorld
    public class HelloWorld {
        // 内部类Inner，类Inner在类HelloWorld的内部
        public class Inner {
            // 内部类的方法
            public void show() {
                System.out.println("welcome to imooc!");
            }
        }
        public static void main(String[] args) {
            // 创建外部类对象
            HelloWorld hello = new HelloWorld();
            // 创建内部类对象
            Inner i = hello.new Inner();
            // 调用内部类对象的方法
            i.show();
        }
    }
```
静态内部类:
1、 静态内部类不能直接访问外部类的非静态成员，但可以通过 new 外部类().成员 的方式访问 
2、 如果外部类的静态成员与内部类的成员名称相同，可通过“类名.静态成员”访问外部类的静态成员；如果外部类的静态成员与内部类的成员名称不相同，则可通过“成员名”直接调用外部类的静态成员
3、 创建静态内部类的对象时，不需要外部类的对象，可以直接创建 内部类 对象名= new 内部类();
```java
   //外部类
    public class HelloWorld {
        // 外部类中的静态变量score
        private static int score = 84;
        // 创建静态内部类
        public     static     class SInner {
            // 内部类中的变量score
            int score = 91;
            public void show() {
                System.out.println("访问外部类中的score：" +  HelloWorld.score          );
                System.out.println("访问内部类中的score：" + score);
            }
        }
        // 测试静态内部类
        public static void main(String[] args) {
            // 直接创建内部类的对象
            SInner si = new SInner();
            
            // 调用show方法
            si.show();
        }
    } 
```
方法内部类:
方法内部类就是内部类定义在外部类的方法中，方法内部类只在该方法的内部可见，即只在该方法内可以使用。
方法内部类不能使用访问控制符和 static 修饰符
匿名内部类

### 继承
继承是单继承
拥有父类的属性和方法(private 修饰的除外)
```java
   class Dog extends Animal{

   }
```
