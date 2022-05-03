package io.github.zhiweicoding.core.tool;

/**
 * @Created by zhiwei on 2022/5/3.
 */
public interface SampleTool<T> extends Tool<T, T> {

    @Override
    T work(T t);

}
