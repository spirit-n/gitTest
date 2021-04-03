package com.spirit.chilren;

import lombok.Data;

/**
 * @author spirit
 * @date 2021/04/03
 */
@Data
public class Children extends Father{
    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public Integer getAge() {
        return super.getAge();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void setAge(Integer age) {
        super.setAge(age);
    }
}
