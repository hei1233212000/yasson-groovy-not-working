package com.pojo;

import com.google.common.base.MoreObjects;

import java.io.Serializable;

public class JavaUser implements Serializable {
    private static final long serialVersionUID = 1L;

    private String name;
    private Integer age;

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("name", name)
                .add("age", age)
                .toString();
    }

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

    public static final class Builder {
        private String name;
        private Integer age;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder age(Integer age) {
            this.age = age;
            return this;
        }

        public JavaUser build() {
            JavaUser javaUser = new JavaUser();
            javaUser.setName(name);
            javaUser.setAge(age);
            return javaUser;
        }
    }
}
