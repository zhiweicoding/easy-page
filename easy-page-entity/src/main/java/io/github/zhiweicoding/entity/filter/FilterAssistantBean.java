package io.github.zhiweicoding.entity.filter;

import io.github.zhiweicoding.entity.page.PageAssistantBean;

/**
 * @Created by zhiwei on 2022/5/3.
 */
public class FilterAssistantBean<T> extends PageAssistantBean<T> {
    private String filterText;

    public String getFilterText() {
        return filterText;
    }

    public void setFilterText(String filterText) {
        this.filterText = filterText;
    }
}
