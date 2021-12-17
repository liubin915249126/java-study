#### Iterable 接口
fail-fast 
实现此接口允许对象成为 for-each 循环的目标，也就是增强 for 循环，它是 Java 中的一种语法糖。
```java
List<Object> list = new ArrayList();
for (Object obj: list){}
```
#### 顶层接口
Collection 是一个顶层接口，它主要用来定义集合的约定
List 接口也是一个顶层接口，它继承了 Collection 接口 ，同时也是 ArrayList、LinkedList 等集合元素的父类
Set 接口位于与 List 接口同级的层次上，它同时也继承了 Collection 接口。Set 接口提供了额外的规定。它对add、equals、hashCode  方法提供了额外的标准。
Queue 是和 List、Set 接口并列的 Collection 的三大接口之一。Queue 的设计用来在处理之前保持元素的访问次序。除了 Collection 基础的操作之外，队列提供了额外的插入，读取，检查操作。
SortedSet 接口直接继承于 Set 接口，使用 Comparable 对元素进行自然排序或者使用 Comparator 在创建时对元素提供定制的排序规则。set 的迭代器将按升序元素顺序遍历集合。
Map 是一个支持 key-value 存储的对象，Map 不能包含重复的 key，每个键最多映射一个值。这个接口代替了Dictionary 类，Dictionary 是一个抽象类而不是接口。

#### ArrayList
ArrayList 是实现了 List 接口的可扩容数组(动态数组)，它的内部是基于数组实现的。它的具体定义如下：
```java
public class ArrayList<E> extends AbstractList<E> implements List<E>, RandomAccess, Cloneable, java.io.Serializable {...}
```
ArrayList 可以实现所有可选择的列表操作，允许所有的元素，包括空值。ArrayList 还提供了内部存储 list 的方法，它能够完全替代 Vector，只有一点例外，ArrayList 不是线程安全的容器。
ArrayList 有一个容量的概念，这个数组的容量就是 List 用来存储元素的容量。
ArrayList 不是线程安全的容器，如果多个线程中至少有两个线程修改了 ArrayList 的结构的话就会导致线程安全问题，作为替代条件可以使用线程安全的 List，应使用 Collections.synchronizedList
```java
List list = Collections.synchronizedList(new ArrayList(...))
```

#### LinkedList 类
LinkedList 是一个双向链表，允许存储任何元素(包括 null )