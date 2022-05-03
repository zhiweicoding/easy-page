package io.github.zhiweicoding.sample.page;

import io.github.zhiweicoding.core.tool.SampleTool;
import io.github.zhiweicoding.core.tool.page.PageTool;
import io.github.zhiweicoding.sample.bean.BookBean;

import java.util.ArrayList;
import java.util.List;

/**
 * @Created by zhiwei on 2022/5/3.
 */
public class PageSample {

    public static void main(String[] args) {
        List<BookBean> bs = new ArrayList<>();
        BookBean b1 = new BookBean();
        b1.setId(1);
        b1.setName("b1");
        bs.add(b1);
        BookBean b2 = new BookBean();
        b2.setId(2);
        b2.setName("b2");
        bs.add(b2);
        BookBean b3 = new BookBean();
        b3.setId(3);
        b3.setName("b3");
        bs.add(b3);
        BookBean b4 = new BookBean();
        b4.setId(4);
        b4.setName("b4");
        bs.add(b4);


        BookBean bean = new BookBean();
        bean.setTAllList(bs);
        bean.setHasBefore(false);
        bean.setEveryPageCount(3);
        bean.setHasNext(true);
        bean.setWhichPageNum(2);
        SampleTool<BookBean> tool = new PageTool<>();
        BookBean work = tool.work(bean);
        System.out.println(work.getTList());
    }
}
