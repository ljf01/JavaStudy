package com.study.game2048;

import javax.swing.*;

/**
 * com.study.game2048
 *
 * @Author: JF LI
 * @Date: 2021/8/28 12:55
 * @Version v1.0
 **/
public class MainFrame extends JFrame {
    int[][] imgArray = new int[][]{
            {0, 2, 2, 4},
            {2, 0, 8, 0},
            {0, 16, 16, 0},
            {0, 32, 0, 16}
    };

    public MainFrame() {
        initFrame();
        createView();
        //设置窗体可见
        setVisible(true);
    }

    /**
     * 此方法是用于窗体初始化的
     */
    public void initFrame() {
        setTitle("石头迷阵");
        setSize(520, 550);
        setLocationRelativeTo(null);
        setAlwaysOnTop(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        // 1.通过窗体对象，取消默认布局
        setLayout(null);

    }

    /**
     * 此方法用于绘制页面
     */
    public void createView() {
        int x = 4;
        int y = 4;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                JLabel backgroundLabel = new JLabel(new ImageIcon("src/com/study/image/2048img/" + imgArray[i][j] + ".png"));
                backgroundLabel.setBounds(50 + 100 * j, 100 + i * 100, 100, 100);
                getContentPane().add(backgroundLabel);
            }
        }
        //设置背景图片
        //设置背景图
        JLabel backImg = new JLabel(new ImageIcon("src/com/study/image/2048img/backgroup.png"));
        backImg.setBounds(50, 100, 400, 400);
        getContentPane().add(backImg);
    }
}
