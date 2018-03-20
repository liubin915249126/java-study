## java 中的集合框架

## Collection 与 Map 连个接口 
```java
   Collection：List (序列) ,Queue, //排列有序，可重复
               Set //无序不可重复
   Map //键值对            
```
## List 序列 ArrayList 排列有序，可重复 
```java
   ArrayList.add(cr1); //cr1类的实例
   ArrayList.add(0,cr2);
   ArrayList.addAll(Arrays.asList(course)); //course数组
   ArrayList.addAll(0,Arrays.asList(course));
```
#### 循环遍历list
```java
   // 1.for 
   // 2.Iterator
   public void iterator(){
        Iterator it = courseToSelect.iterator();
        while(it.hasNext()){
            Course cr = (Course)it.next();
            System.out.println(cr.id);
        }
    }
    // 3.forEach
```
#### 修改,删除list中元素 
```java
   // set
   courseToSelect.set(2,new Course("7", "毛概")); //两个参数
   // remove
   courseToSelect.remove(cr); // 删除实例
   courseToSelect.remove(index); // 按索引删除
   courseToSelect.removeAll(Array.asList({})); // 删除数组
```
#### 范型
```java
   // 集合可以是任意类型的对象(对象的引用) 如果把某个对象放入集合，则会忽略他的类型，当作Object处理
   // 范型则是规定集合只能存放特定类型的对象(及其子类型) 编译期间进行检查 不用强制转换 (范型只能是包装类型)
   public List<Course> courses;
```

## set 集 HashSet 无序不可重复
多次添加某个对象只保留第一次添加的
```java
   public Set<Course>course = new HashSet<Course>();
   add // student.courses.add(cr);
   iterator ,foreach // 循环，不能使用get    
```

## map HashMap

```java
   // key,value任意类型
   // key不能重复，value可以
   // map 支持范型 Map<k,v>   
```