# 两种自定义 starter 方式

SpringBoot2.7推出新的自动配置
• 在META-INF/spring/org.springframework.boot.autoconfigure.AutoConfiguration.imports
• 文件里添加配置类名称，每行包含一个配置类全限定名
• 兼容META-INF/spring.factories方式
• SpringBoot3.x 移除spring.factories
• 移除META-INF/spring.factories方式
• 只支持META-INF/spring/org.springframework.boot.autoconfigure.AutoConfiguration.imports 增加自动配置

## 第一种
分支：master
META-INF/spring

## 第二种
分支：
MATA-INF/spring.factories
