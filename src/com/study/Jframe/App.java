package com.study.Jframe;

import javax.swing.*;

/** @author Jiafeng1.Li */
public class App {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        //设置窗体宽高
        frame.setSize(514, 538);
        //设置窗体居中
        frame.setLocationRelativeTo(null);
        //设置窗体置顶
        frame.setAlwaysOnTop(true);

        //调用成员方法，设置关闭模式
        frame.setDefaultCloseOperation(3);
        //调用成员方法，设置窗体标题
        frame.setTitle("2048小游戏");
        //设置窗体可见
        frame.setVisible(true);

    }
}
