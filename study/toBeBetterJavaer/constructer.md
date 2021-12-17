#### 构造方法必须符合以下规则：

- 构造方法的名字必须和类名一样；
- 构造方法没有返回类型，包括 void；
- final构造方法不能是抽象的、静态的、最终的、同步的，也就是说，构造方法不能通过 abstract、static、final、synchronized 关键字修饰。
    - 由于构造方法不能被子类继承，所以用 final 和 abstract 修饰没有意义；
    - 构造方法用于初始化一个对象，所以用 static 修饰没有意义；
    - 多个线程不会同时创建内存地址相同的同一个对象，所以用 synchronized 修饰没有必要。

#### 如何复制对象
通过构造方法
```java
/**
 * @author 沉默王二，一枚有趣的程序员
 */
public class CopyConstrutorPerson {
    private String name;
    private int age;

    public CopyConstrutorPerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public CopyConstrutorPerson(CopyConstrutorPerson person) {
        this.name = person.name;
        this.age = person.age;
    }

    public void out() {
        System.out.println("姓名 " + name + " 年龄 " + age);
    }

    public static void main(String[] args) {
        CopyConstrutorPerson p1 = new CopyConstrutorPerson("沉默王二",18);
        p1.out();

        CopyConstrutorPerson p2 = new CopyConstrutorPerson(p1);
        p2.out();
    }
}
```
通过对象的值
通过 Object 类的 clone() 方法
  