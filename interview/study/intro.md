## java 基础

#### 编译
首先你需要在应用中编写 Java 代码；
用 Eclipse 或者 javac 把 Java 代码编译为 .class 文件；
然后把你的 .class 文件打成 .jar 文件；

#### 数据类型
在 Java 中，数据类型只有四类八种。

整数型：byte、short、int、long

byte 也就是字节，1 byte = 8 bits，byte 的默认值是 0 ；
short 占用两个字节，也就是 16 位，1 short = 16 bits，它的默认值也是 0 ；
int 占用四个字节，也就是 32 位，1 int = 32 bits，默认值是 0 ；
long 占用八个字节，也就是 64 位，1 long = 64 bits，默认值是 0L；
所以整数型的占用字节大小空间为 long > int > short > byte

浮点型

浮点型有两种数据类型：float 和 double
float 是单精度浮点型，占用 4 位，1 float = 32 bits，默认值是 0.0f；
double 是双精度浮点型，占用 8 位，1 double = 64 bits，默认值是 0.0d；

字符型

字符型就是 char，char 类型是一个单一的 16 位 Unicode 字符，最小值是 \u0000 (也就是 0 )，最大值是 \uffff (即为 65535)，char 数据类型可以存储任何字符，例如 char a = 'A'。

布尔型

布尔型指的就是 boolean，boolean 只有两种值，true 或者是 false，只表示 1 位，默认值是 false。

#### 基础语法

大小写敏感：Java 是对大小写敏感的语言，例如 Hello 与 hello 是不同的，这其实就是 Java 的字符串表示方式。
类名：对于所有的类来说，首字母应该大写，例如 MyFirstClass。
包名：包名应该尽量保证小写，例如 my.first.package。
方法名：方法名首字母需要小写，后面每个单词字母都需要大写，例如 myFirstMethod()。


#### for-each
```java
int array[] = {7, 8, 9};

for (int arr : array) {
     System.out.println(arr);
}
```