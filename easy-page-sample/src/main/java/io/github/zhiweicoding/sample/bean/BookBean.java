package io.github.zhiweicoding.sample.bean;

import io.github.zhiweicoding.entity.page.PageAssistantBean;

/**
 * @Created by zhiwei on 2022/5/3.
 */
public class BookBean extends PageAssistantBean<BookBean> {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "BookBean{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
