## reflect

#### 正射
改变数据类型会频繁修改代码
```java
Map<Integer, Integer> map = new HashMap<>();
map.put(1, 1);
Map<Integer, Integer> map = new LinkedHashMap<>();
map.put(1, 1);
```

#### 反射
在代码运行之前，我们不确定将来会使用哪一种数据结构，
只有在程序运行时才决定使用哪一个数据类，而反射可以在程序运行过程中动态获取类信息和调用类方法。
通过反射构造类实例，代码会演变成下面这样。
```java
public Map<Integer, Integer> getMap(String className) {
    Class clazz = Class.forName(className);
    Consructor con = clazz.getConstructor();
    return (Map<Integer, Integer>) con.newInstance();
}
```
#### Java 反射的主要组成部分
- Class：任何运行在内存中的所有类都是该 Class 类的实例对象，每个 Class 类对象内部都包含了本来的所有信息。记着一句话，通过反射干任何事，先找 Class 准没错！
- Field：描述一个类的属性，内部包含了该属性的所有信息，例如数据类型，属性名，访问修饰符······
- Constructor：描述一个类的构造方法，内部包含了构造方法的所有信息，例如参数类型，参数名字，访问修饰符······
- Method：描述一个类的所有方法（包括抽象方法），内部包含了该方法的所有信息，与Constructor类似，不同之处是 Method 拥有返回值类型信息，因为构造方法是没有返回值的。

#### 获取类的 Class 对象
在 Java 中，每一个类都会有专属于自己的 Class 对象，当我们编写完.java文件后，使用javac编译后，就会产生一个字节码文件.class，在字节码文件中包含类的所有信息，如属性，构造方法，方法······当字节码文件被装载进虚拟机执行时，会在内存中生成 Class 对象，它包含了该类内部的所有信息，在程序运行时可以获取这些信息。
```java
// 类名.class：这种获取方式只有在编译前已经声明了该类的类型才能获取到 Class 对象
Class clazz = SmallPineapple.class;
```
```java
// 实例.getClass()：通过实例化对象获取该实例的 Class 对象
SmallPineapple sp = new SmallPineapple();
Class clazz = sp.getClass();
```
```java
// Class.forName(className)：通过类的全限定名获取该类的 Class 对象
Class clazz = Class.forName("com.bean.smallpineapple");
```
#### 构造类的实例化对象
```java
// Class 对象调用newInstance()方法
Class clazz = Class.forName("com.bean.SmallPineapple");
SmallPineapple smallPineapple = (SmallPineapple) clazz.newInstance();
smallPineapple.getInfo();
// [null 的年龄是：0]
```java
// 通过 getConstructor(Object... paramTypes) 方法指定获取指定参数类型的 Constructor， Constructor 调用 newInstance(Object... paramValues) 时传入构造方法参数的值，同样可以构造一个实例，且内部属性已经被赋值。
// 通过Class对象调用 newInstance() 会走默认无参构造方法，如果想通过显式构造方法构造实例，需要提前从Class中调用getConstructor()方法获取对应的构造器，通过构造器去实例化对象。
Class clazz = Class.forName("com.bean.SmallPineapple");
Constructor constructor = clazz.getConstructor(String.class, int.class);
constructor.setAccessible(true);
SmallPineapple smallPineapple2 = (SmallPineapple) constructor.newInstance("小菠萝", 21);
smallPineapple2.getInfo();
// [小菠萝 的年龄是：21]

```

#### 获取类中的变量（Field）
Field[] getFields()：获取类中所有被public修饰的所有变量
Field getField(String name)：根据变量名获取类中的一个变量，该变量必须被public修饰
Field[] getDeclaredFields()：获取类中所有的变量，但无法获取继承下来的变量
Field getDeclaredField(String name)：根据姓名获取类中的某个变量，无法获取继承下来的变量

#### 获取类中的方法（Method）
Method[] getMethods()：获取类中被public修饰的所有方法
Method getMethod(String name, Class...<?> paramTypes)：根据名字和参数类型获取对应方法，该方法必须被public修饰
Method[] getDeclaredMethods()：获取所有方法，但无法获取继承下来的方法
Method getDeclaredMethod(String name, Class...<?> paramTypes)：根据名字和参数类型获取对应方法，无法获取继承下来的方法
#### 获取类的构造器（Constructor）
Constuctor[] getConstructors()：获取类中所有被public修饰的构造器
Constructor getConstructor(Class...<?> paramTypes)：根据参数类型获取类中某个构造器，该构造器必须被public修饰
Constructor[] getDeclaredConstructors()：获取类中所有构造器
Constructor getDeclaredConstructor(class...<?> paramTypes)：根据参数类型获取对应的构造器

[referer](https://juejin.cn/post/6864324335654404104)

#### 获取注解
Annotation[] getAnnotations()：获取该对象上的所有注解
Annotation getAnnotation(Class annotaionClass)：传入注解类型，获取该对象上的特定一个注解
Annotation[] getDeclaredAnnotations()：获取该对象上的显式标注的所有注解，无法获取继承下来的注解
Annotation getDeclaredAnnotation(Class annotationClass)：根据注解类型，获取该对象上的特定一个注解，无法获取继承下来的注解
