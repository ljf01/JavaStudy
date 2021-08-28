package com.study.gameshitou;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * com.study.gameshitou
 *
 * @Author: JF LI
 * @Date: 2021/8/28 16:31
 * @Version v1.0
 **/
public class JinapanshijianClass extends JFrame implements KeyListener {
    public static void main(String[] args) {
        JinapanshijianClass jp = new JinapanshijianClass();
        jp.init();
    }

    public void init() {
        setSize(514, 524);
        setLocationRelativeTo(null);
        //设置居中
        setLayout(null);
        //关闭默认布局
        setDefaultCloseOperation(3);
        //设置关闭模式
        this.addKeyListener(this);
        //设置当前窗体为事件
        setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println(e.getKeyCode());
        System.out.println("键盘按下了");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println(e.getKeyCode());
        System.out.println("键盘松开了");
    }
}
