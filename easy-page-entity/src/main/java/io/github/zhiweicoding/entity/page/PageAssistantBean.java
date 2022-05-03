package io.github.zhiweicoding.entity.page;

import java.io.Serializable;
import java.util.List;

/**
 * @Created by zhiwei on 2022/5/3.
 */
public class PageAssistantBean<T> implements Serializable {

    private int everyPageCount;
    private int whichPageNum;
    private int allPageCount;
    private boolean hasNext;
    private boolean hasBefore;
    private List<T> tList;
    private List<T> tAllList;

    public int getEveryPageCount() {
        return everyPageCount;
    }

    public void setEveryPageCount(int everyPageCount) {
        this.everyPageCount = everyPageCount;
    }

    public int getWhichPageNum() {
        return whichPageNum;
    }

    public void setWhichPageNum(int whichPageNum) {
        this.whichPageNum = whichPageNum;
    }

    public int getAllPageCount() {
        return allPageCount;
    }

    public void setAllPageCount(int allPageCount) {
        this.allPageCount = allPageCount;
    }

    public boolean isHasNext() {
        return hasNext;
    }

    public void setHasNext(boolean hasNext) {
        this.hasNext = hasNext;
    }

    public boolean isHasBefore() {
        return hasBefore;
    }

    public void setHasBefore(boolean hasBefore) {
        this.hasBefore = hasBefore;
    }

    public List<T> getTList() {
        return tList;
    }

    public void setTList(List<T> tList) {
        this.tList = tList;
    }

    public List<T> getTAllList() {
        return tAllList;
    }

    public void setTAllList(List<T> tAllList) {
        this.tAllList = tAllList;
    }

}
