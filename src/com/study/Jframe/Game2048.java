package com.study.Jframe;

import javax.swing.*;

/**
 * com.study.Jframe
 *
 * @Author: JF LI
 * @Date: 2021/8/25 22:44
 * @Version v1.0
 **/
public class Game2048 {
    public static void main(String[] args) {
        JFrame jframe = new JFrame();
        jframe.setTitle("石头迷阵");
        jframe.setSize(520, 550);
        jframe.setLocationRelativeTo(null);
        jframe.setAlwaysOnTop(true);
        jframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        // 1.通过窗体对象，取消默认布局
        jframe.setLayout(null);
        jframe.setLayout(null);
        //设置背景
        //设置窗体可见
        int x = 4;
        int y = 4;
        for (int i = 0; i < x; i++) {
            for(int j = 0;j<y;j++) {
                JLabel backgroundLabel = new JLabel(new ImageIcon("src/com/study/imag/2048img/4.png"));
                backgroundLabel.setBounds(50 + 100 * j, 100+ i * 100, 100, 100);
                jframe.getContentPane().add(backgroundLabel);
            }
        }
        jframe.setVisible(true);
    }
}
