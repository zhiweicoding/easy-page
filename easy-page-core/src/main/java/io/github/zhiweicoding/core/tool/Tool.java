package io.github.zhiweicoding.core.tool;

/**
 * @Created by zhiwei on 2022/5/3.
 */
public interface Tool<T, V>  {

    T work(V t);
}
