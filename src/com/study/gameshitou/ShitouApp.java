package com.study.gameshitou;

import javax.swing.*;

/**
 * com.study.Jframe
 *
 * @Author: JF LI
 * @Date: 2021/8/25 21:33
 * @Version v1.0
 **/
public class ShitouApp {
    public static void main(String[] args) {
        JFrame jframe = new JFrame();
        jframe.setTitle("石头迷阵");
        jframe.setSize(468, 580);
        jframe.setLocationRelativeTo(null);
        jframe.setAlwaysOnTop(true);
        jframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        // 1.通过窗体对象，取消默认布局
        jframe.setLayout(null);
        jframe.setLayout(null);
        //设置背景
        int[][] numArray = new int[][]{
                {0, 1, 2, 3}, {4, 5, 6, 7}, {8, 9, 10, 11}, {12, 13, 14, 15}
        };
        int x = 4;
        int y = 4;
        //注入数据
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                JLabel backgroundLabel = new JLabel(new ImageIcon("src/com/study/image/shitou/" + numArray[i][j] + ".png"));
                backgroundLabel.setBounds(25 + 100 * i, 110 + 100 * j, 100, 100);
                jframe.getContentPane().add(backgroundLabel);
            }
        }

        //设置窗体可见
        JLabel backgroundLabel = new JLabel(new ImageIcon("src/com/study/image/shitou/background.png"));
        backgroundLabel.setBounds(0, 50, 450, 484);
        jframe.getContentPane().add(backgroundLabel);
        jframe.setVisible(true);
    }
}
