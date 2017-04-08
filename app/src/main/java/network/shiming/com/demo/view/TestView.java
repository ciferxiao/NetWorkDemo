package network.shiming.com.demo.view;

import java.util.ArrayList;

import network.shiming.com.demo.bean.TadayBean;

/**
 * Created by shiming on 2017/4/3.
 */
public interface TestView {
    void getTadayBean(ArrayList<TadayBean> bean);
    void fail(String error_code,String msg);
}
