package cn.lacknb.myspringbootstarter.model;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * <h2>  </h2>
 *
 * @description:
 * @menu
 * @author: gitsilence
 * @description:
 * @date: 2024/3/4 11:25
 **/
public class TestProperties {

    private String name;

    private Integer age;

    private String skill;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    @Override
    public String toString() {
        return "TestProperties{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", skill='" + skill + '\'' +
                '}';
    }
}
