## 注解

#### 元注解
『元注解』是用于修饰注解的注解，通常用在注解的定义上
```java
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.SOURCE)
public @interface Override {

}
```
- @Target：注解的作用目标
    ElementType.TYPE：允许被修饰的注解作用在类、接口和枚举上
    ElementType.FIELD：允许作用在属性字段上
    ElementType.METHOD：允许作用在方法上
    ElementType.PARAMETER：允许作用在方法参数上
    ElementType.CONSTRUCTOR：允许作用在构造器上
    ElementType.LOCAL_VARIABLE：允许作用在本地局部变量上
    ElementType.ANNOTATION_TYPE：允许作用在注解上
    ElementType.PACKAGE：允许作用在包上
- @Retention：注解的生命周期
    RetentionPolicy.SOURCE：当前注解编译期可见，不会写入 class 文件
    RetentionPolicy.CLASS：类加载阶段丢弃，会写入 class 文件
    RetentionPolicy.RUNTIME：永久保存，可以反射获取
- @Documented：注解是否应当被包含在 JavaDoc 文档中
- @Inherited：是否允许子类继承该注解

#### java内置注解
@Override
@Deprecated
@SuppressWarnings