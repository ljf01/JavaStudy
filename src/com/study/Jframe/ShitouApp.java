package com.study.Jframe;

import javax.swing.*;

/**
 * com.study.Jframe
 *
 * @Author: JF LI
 * @Date: 2021/8/25 21:33
 * @Version v1.0
 **/
public class ShitouApp {
    public static void main(String[] args){
        JFrame jframe = new JFrame();
        jframe.setTitle("石头迷阵");
        jframe.setSize(468,530);
        jframe.setLocationRelativeTo(null);
        jframe.setAlwaysOnTop(true);
        jframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        // 1.通过窗体对象，取消默认布局
        jframe.setLayout(null);
        jframe.setLayout(null);
        //设置背景
        JLabel backgroundLabel = new JLabel(new ImageIcon("src/com/study/image/shitou/background.png"));
        backgroundLabel.setBounds(0,0,450,484);
        jframe.getContentPane().add(backgroundLabel);
        //设置窗体可见

        jframe.setVisible(true);
    }
}
