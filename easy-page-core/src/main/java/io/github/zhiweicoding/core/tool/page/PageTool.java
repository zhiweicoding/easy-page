package io.github.zhiweicoding.core.tool.page;

import io.github.zhiweicoding.core.tool.SampleTool;
import io.github.zhiweicoding.entity.page.PageAssistantBean;

import java.util.ArrayList;
import java.util.List;

/**
 * @Created by zhiwei on 2022/5/3.
 */
public class PageTool<T extends PageAssistantBean<T>> implements SampleTool<T> {

    @Override
    public T work(T bean) {
        List<T> tAllList = bean.getTAllList();
        int allPageCount = tAllList.size();
        bean.setAllPageCount(allPageCount);
        if (allPageCount == 0) {
            bean.setTList(bean.getTAllList());
            bean.setHasNext(false);
            return bean;
        }
        int everyPageCount = bean.getEveryPageCount();
        if (everyPageCount <= 0) {
            everyPageCount = 1;
        }
        int whichPageNum = bean.getWhichPageNum() - 1;
        if (whichPageNum < 0) {
            whichPageNum = 0;
        }
        int howManyPageCount = allPageCount / everyPageCount;
        int leaveCount = allPageCount % everyPageCount;
        if (leaveCount != 0) {
            leaveCount = 1;
        }
        int startNum = whichPageNum * everyPageCount;
        int startNumOther = howManyPageCount * everyPageCount;

        if (whichPageNum > howManyPageCount) {
            if (whichPageNum >= leaveCount + howManyPageCount) {
                List<T> emptyArray = new ArrayList<>();
                bean.setTList(emptyArray);
            } else {
                bean.setTList(new ArrayList<>(tAllList.subList(startNumOther, allPageCount)));
                bean.setWhichPageNum(whichPageNum + 2);
            }
            bean.setHasNext(false);
        } else if (whichPageNum == howManyPageCount) {
            bean.setTList(new ArrayList<>(tAllList.subList(startNum, allPageCount)));
            bean.setWhichPageNum(whichPageNum + 2);
            bean.setHasNext(false);
        } else {
            bean.setTList(new ArrayList<>(tAllList.subList(startNum, startNum + everyPageCount)));
            bean.setWhichPageNum(whichPageNum + 2);
            bean.setHasNext(true);
        }
        return bean;
    }
}
