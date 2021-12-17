## Paradigm 范型

#### 范型类
```java
//此处 T 可以随便写为任意标识，常见的如T、E、K、V等形式的参数常用于表示泛型
public class GenericDemo<T>{ 
    //value 这个成员变量的类型为T,T的类型由外部指定  
    private T value;

    public GenericDemo(T value) {
        this.value = value;
    }

    public T getValue(){ //泛型方法getKey的返回值类型为T，T的类型由外部指定
        return value;
    }
 
 		public void setValue(T value){
	      this.value = value
    }
}
```
#### 范型接口
```java
//定义一个泛型接口
public interface Generator<T> {
    public T next();
}
```
#### 范型方法
```java
public class GenericMethods {
  public <T> void f(T x){
    System.out.println(x.getClass().getName());
  }
}
```