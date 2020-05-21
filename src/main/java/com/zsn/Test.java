package com.zsn;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @Author: zsn
 * @Date: 2020/5/21 23:49
 */
public class Test {
    public static void main(String[] args) {
        Frame f=new Frame();
        f.addWindowListener(new WindowAdapter() { //WindowAdapter反而不是Adapter ，只是为了方便编程
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
            }
        });
    }
}
