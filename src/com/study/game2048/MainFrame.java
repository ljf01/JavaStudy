package com.study.game2048;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/** com.study.game2048 @Author: JF LI @Date: 2021/8/28 12:55 @Version v1.0 */
public class MainFrame extends JFrame implements KeyListener {
    static int[][] imgArray =
            new int[][] {
                {0, 2, 2, 4},
                {2, 0, 8, 0},
                {0, 16, 16, 0},
                {0, 32, 0, 16}
            };
    // 首次生成随机数

    public MainFrame() {
        initFrame();
        createView();
        // 设置键盘监听事件
        this.addKeyListener(this);
        // 设置窗体可见
        setVisible(true);
    }

    /** 此方法是用于窗体初始化的 */
    public void initFrame() {
        setTitle("2048");
        setSize(520, 550);
        setLocationRelativeTo(null);
        setAlwaysOnTop(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        // 1.通过窗体对象，取消默认布局
        setLayout(null);
    }

    /** 此方法用于绘制页面 */
    public void createView() {
        // 移除界面内容
        getContentPane().removeAll();
        int x = 4;
        int y = 4;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                JLabel backgroundLabel =
                        new JLabel(
                                new ImageIcon(
                                        "src/com/study/image/2048img/" + imgArray[i][j] + ".png"));
                backgroundLabel.setBounds(50 + 100 * j, 100 + i * 100, 100, 100);
                getContentPane().add(backgroundLabel);
            }
        }
        // 设置背景图片
        // 设置背景图
        JLabel backImg = new JLabel(new ImageIcon("src/com/study/image/2048img/backgroup.png"));
        backImg.setBounds(50, 100, 400, 400);
        getContentPane().add(backImg);
        // 刷新界面的方法
        getContentPane().repaint();
    }

    /** 无法监听到上下左右的按键 */
    @Override
    public void keyTyped(KeyEvent e) {}

    /** 键盘被按下时，所触发的方法，识别上下左右按键 */
    @SuppressWarnings("AlibabaUndefineMagicConstant")
    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        if (keyCode == 37) {
            left();
        }
        if (keyCode == 38) {
            top();
        }
        if (keyCode == 39) {
            right();
        }
        if (keyCode == 40) {
            below();
        }
    }

    /** 按键松开时触发的方法 */
    @Override
    public void keyReleased(KeyEvent e) {}

    /** 左移动 */
    @SuppressWarnings("AlibabaUndefineMagicConstant")
    public void left() {
        int[][] nums = new int[4][4];
        for (int x = 0; x < 4; x++) {
            int right = 0;
            for (int j = 0; j < 4; j++) {
                if (imgArray[x][j] != 0) {
                    nums[x][right] = imgArray[x][j];
                    right++;
                }
            }
        }
        imgArray = nums;
        // 对数据进行相同判定
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                if (imgArray[i][j] == imgArray[i][j + 1]) {
                    imgArray[i][j] *= 2;
                    System.arraycopy(imgArray[i], j + 1 + 1, imgArray[i], j + 1, 3 - (j + 1));
                    imgArray[i][3] = 0;
                }
            }
        }
        // 重新绘制界面
        createView();
    }

    /** 右移动 */
    @SuppressWarnings("AlibabaUndefineMagicConstant")
    public void right() {
        int[][] nums = new int[4][4];
        for (int x = 0; x < 4; x++) {
            int right = 3;
            for (int j = 3; j >= 0; j--) {
                if (imgArray[x][j] != 0) {
                    nums[x][right] = imgArray[x][j];
                    right--;
                }
            }
        }
        imgArray = nums;
        // 对数据进行相同判定
        for (int i = 0; i < 4; i++) {
            for (int j = 3; j >= 1; j--) {
                if (imgArray[i][j] == imgArray[i][j - 1]) {
                    imgArray[i][j] *= 2;
                    System.arraycopy(imgArray[i], 0, imgArray[i], 1, j - 1);
                    imgArray[i][0] = 0;
                }
            }
        }
        // 重新绘制界面
        createView();
    }

    @SuppressWarnings("AlibabaUndefineMagicConstant")
    public void top() {
        int[][] nums = new int[4][4];
        for (int x = 0; x < 4; x++) {
            int right = 0;
            for (int j = 0; j < 4; j++) {
                if (imgArray[j][x] != 0) {
                    nums[right][x] = imgArray[j][x];
                    right++;
                }
            }
        }
        imgArray = nums;
        // 对数据进行相同判定
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                if (imgArray[j][i] == imgArray[j + 1][i]) {
                    imgArray[j][i] *= 2;
                    for (int z = j + 1; z < 3; z++) {
                        imgArray[z][i] = imgArray[z + 1][i];
                    }
                    imgArray[3][i] = 0;
                }
            }
        }
        // 重新绘制界面
        createView();
    }

    /** 向下移动 */
    @SuppressWarnings("AlibabaUndefineMagicConstant")
    public void below() {
        int[][] nums = new int[4][4];
        for (int x = 0; x < 4; x++) {
            int right = 3;
            for (int j = 3; j >= 0; j--) {
                if (imgArray[j][x] != 0) {
                    nums[right][x] = imgArray[j][x];
                    right--;
                }
            }
        }
        imgArray = nums;
        // 对数据进行相同判定
        for (int i = 0; i < 4; i++) {
            for (int j = 3; j > 0; j--) {
                if (imgArray[j][i] == imgArray[j - 1][i]) {
                    imgArray[j][i] *= 2;
                    for (int z = j - 1; z > 0; z--) {
                        imgArray[z][i] = imgArray[z - 1][i];
                    }
                    imgArray[0][i] = 0;
                }
            }
        }
        // 重新绘制界面
        createView();
    }
}
