## spring-boot 目录结构
- src/main/java/com
  存放工程代码
com
  +- example
    +- myproject
      +- Application.java
      |
      +- domain
      |  +- Customer.java
      |  +- CustomerRepository.java
      |
      +- service
      |  +- CustomerService.java
      |
      +- controller
      |  +- CustomerController.java
      |
      +- config
      |  +- swagerConfig.java
      |
Application.java是项目的启动类
domain 目录主要用于实体（Entity）与数据访问层（Repository）
service 层主要是业务类代码
controller 负责页面访问控制
config 目录主要放一些配置类   

#### @SpringBootApplication 注解
```java
@SpringBootApplication
public class HelloWorldApplication {
	public static void main(String[] args) {
		SpringApplication.run(HelloWorldApplication.class, args);
	}
}
```
- @EnableAutoConfiguration：启用 SpringBoot 的自动配置机制
- @ComponentScan： 扫描被@Component (@Service,@Controller)注解的 bean，注解默认会扫描该类所在的包下所有的类。
- @Configuration：允许在上下文中注册额外的 bean 或导入其他配置类。
>
<!-- 修改默认端口 8080 -->
src/main/resources/application.properties
server.port=8333
>