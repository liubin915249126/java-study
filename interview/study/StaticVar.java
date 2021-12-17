public class StaticVar {


    // static 修饰的对象为静态对象，所有类的对象共享 name
    static String name = "Hello";

    public static void main(String[] args) {
        // 静态变量可以直接通过类名来访问，无需创建类的对象
        System.out.println(StaticVar.name);
        // 创建类的对象
        StaticVar hello = new StaticVar();
        // 通过对象名的方式去访问静态变量
        System.out.println(hello.name);
        // 通过对象名的方式去修改静态变量
        hello.name = "word";
        // 再次使用类名的方式访问静态变量但已被修改
        System.out.println(StaticVar.name);
    }
}