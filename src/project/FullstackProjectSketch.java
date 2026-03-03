package project;

/**
 * 这是一个「前后端联动」的 Java 全栈项目结构草稿，
 * 用注释帮助你把自己熟悉的前端技术和 Java 后端对上号。
 *
 * 设想场景：一个简单的任务管理 / 笔记应用。
 *
 * - 前端：React / Vue / Next.js，调用 REST API
 * - 后端：Spring Boot，暴露 /api/** 接口
 * - 数据库：MySQL / PostgreSQL
 *
 * 建议模块拆分（类比前端的 feature modules）：
 *
 * - user：用户注册 / 登录 / 鉴权
 * - task：任务的增删改查、分页、过滤
 * - common：统一异常、统一响应、日志
 */
public class FullstackProjectSketch {
    // 在真正搭项目时，你可以：
    //
    // 1. 用 Spring Initializr 生成一个 Spring Boot 工程
    // 2. 创建以下 package：
    //    - com.example.project.user
    //    - com.example.project.task
    //    - com.example.project.common
    // 3. 每个包下再拆：
    //    - controller（处理 HTTP 请求）
    //    - service（业务逻辑）
    //    - repository（数据访问）
    //    - model / entity（实体类）
    //
    // 这个类本身不承担具体逻辑，只是作为你实战项目的「蓝图说明」。
}

