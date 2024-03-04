package cn.lacknb.myspringbootstarter.config;

import cn.lacknb.myspringbootstarter.model.TestProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

/**
 * <h2>  </h2>
 *
 * @description:
 * @menu
 * @author: gitsilence
 * @description:
 * @date: 2024/3/4 11:24
 **/
@Configuration
public class TestConfig {

    @Bean
    @ConditionalOnMissingBean
    public TestProperties testProperties() {
        TestProperties testProperties = new TestProperties();
        testProperties.setName("my-spring-boot-starter");
        testProperties.setAge(18);
        testProperties.setSkill("coder ~");
        return testProperties;
    }
}
