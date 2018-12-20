# SpringBoot使用Schedule实现的定时任务demo

  pom.xml
    
    <!-- schedule 依赖组件 -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter</artifactId>
    </dependency>
    
  SpringTaskDemoApplication
  
    开启注解： @EnableScheduling
    
  ScheduledTask
  
    开启定时任务并行线程数
    
  ScheduledService
  
    三种实现定时任务的方式
    
        1. 使用cron ： cron表达式可以通过：http://cron.qqe2.com/ 生成
        
        2. 使用fixedRate ： 两次任务开始的时间点计算
        
        3. 使用fixedDelay ： 间隔时间为前一次任务的结束与下一次任务的开始