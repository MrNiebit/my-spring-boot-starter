package cn.lacknb.myspringbootstarter;

import cn.lacknb.myspringbootstarter.model.TestProperties;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MySpringBootStarterApplicationTests {

    @Autowired
    private TestProperties testProperties;

    @Test
    void contextLoads() {
        System.out.println(testProperties);
    }

}
