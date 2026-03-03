package springboot;

/**
 * 这个类只用于展示 Spring Boot 风格的代码结构（伪代码），
 * 方便你对照 TypeScript / NestJS 的写法理解，不一定能在当前项目直接运行。
 *
 * 对照思路：
 * - @RestController 类比 NestJS/TS 里的 @Controller()
 * - @GetMapping / @PostMapping 类比 @Get() / @Post()
 * - 方法返回值通常是 JSON（实体或列表），类似返回 DTO。
 */
public class UserControllerExample {

    // 这里用注释写出典型的 Spring Boot 写法：
    //
    // @RestController
    // @RequestMapping("/api/users")
    // public class UserController {
    //
    //     private final UserService userService;
    //
    //     public UserController(UserService userService) {
    //         this.userService = userService;
    //     }
    //
    //     @GetMapping
    //     public List<User> listUsers() {
    //         return userService.findAll();
    //     }
    //
    //     @PostMapping
    //     public User createUser(@RequestBody CreateUserRequest request) {
    //         return userService.createUser(request);
    //     }
    // }
}

