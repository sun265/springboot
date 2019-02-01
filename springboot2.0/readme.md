此项目涉及重点
1、springboot aop使用
2、beetl模板使用  //null
3、常见注解解释：
   @Controller
   @RestController
   @Configuration   声明springBoot项目配置类，在项目启动是添加到bean中由springboot容器管理
   @Aspect          声明类是一个切面，需要配合@Configuration注解使用
   @Around          切面使用的注解，表示执行前、后调用
   @Before
   @After
   @Within          声明切面类型
   @Bean            声明bean
   @Component       声明一个不好形容的类，交由springboot管理
   @RequestParam    
   @RequestBody 
   @ResponseBody   
   @Param 
   @PostConstruct   对面初始化时执行的操作
4、数据库访问
   a、BeetlSQL包使用
                   使用beetlsql自动生成相关代码、dao操作、md文件
                   
   b、jdbctemplete
   c、jpa
5、druid数据源使用
   见配置文件

   