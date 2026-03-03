package springboot;

/**
 * 用代码注释的方式快速总结 Spring Boot 后端开发的典型结构，
 * 方便你对照 TS / NestJS / Express 来理解：
 *
 * - Application 启动类（类似 Node 里创建 HTTP 服务器的入口）
 * - Controller 层：接收 HTTP 请求，做参数校验，调用 Service
 * - Service 层：业务逻辑，类似 TS 里 service / usecase
 * - Repository 层：数据访问（JPA / MyBatis），类似 TypeORM / Prisma
 *
 * 真实项目中，这些类会分散在不同的 package 下，这里只是用注释勾勒结构。
 */
public class ReadmeSpringBootExample {
    // Spring Boot 启动类示例：
    //
    // @SpringBootApplication
    // public class Application {
    //     public static void main(String[] args) {
    //         SpringApplication.run(Application.class, args);
    //     }
    // }
    //
    // 你可以在真正搭建 Spring Boot 项目时，对照这里的结构实现。
}

