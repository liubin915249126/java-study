## maven
```java
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>
    <groupId>com.itwanger</groupId>
    <artifactId>MavenDemo</artifactId>
    <version>0.0.1-SNAPSHOT</version>
    <name>MavenDemo</name>
</project>
```
第一行是XML头，指定了该xml文档的版本和编码方式。
project 是根元素，声明了一些POM相关的命名空间及xsd元素。
modelVersion指定了当前POM的版本，对于Maven 3来说，值只能是4.0.0。
groupId定义了项目属于哪个组织，通常是组织域名的倒序，比如说我的域名是 itwanger.com，所以groupId就是 com.itwanger。
artifactId定义了项目在组织中的唯一ID。
version指定了项目当前的版本，SNAPSHOT意为快照，说明该项目还处于开发中。
name 声明了一个对于用户更为友好的项目名称。

```java
<project>
...
<dependencies>
    <dependency>
        <groupId>实际项目</groupId>
　　　　 <artifactId>模块</artifactId>
　　　　 <version>版本</version>
　　　　 <type>依赖类型</type>
　　　　 <scope>依赖范围</scope>
　　　　 <optional>依赖是否可选</optional>
　　　　 <!—主要用于排除传递性依赖-->
　　　　 <exclusions>
　　　　     <exclusion>
　　　　　　　    <groupId>…</groupId>
　　　　　　　　　 <artifactId>…</artifactId>
　　　　　　　</exclusion>
　　　　 </exclusions>
　　</dependency>
<dependencies>
...
</project>

```