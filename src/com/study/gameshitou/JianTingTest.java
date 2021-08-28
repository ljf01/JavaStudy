package com.study.gameshitou;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * com.study.gameshitou
 *
 * @Author: JF LI
 * @Date: 2021/8/28 16:04
 * @Version v1.0
 **/
public class JianTingTest {
    public static void main(String[] args) {
        JFrame jframe = new JFrame();
        jframe.setTitle("石头迷阵");
        jframe.setSize(468, 580);
        jframe.setLocationRelativeTo(null);//设置居中
        jframe.setAlwaysOnTop(true);
        jframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//设置关闭模式
        // 1.通过窗体对象，取消默认布局
        jframe.setLayout(null);
        jframe.setLayout(null);
        JButton bt = new JButton("按钮");
        bt.setBounds(0, 0, 100, 100);
        jframe.getContentPane().add(bt);
        //1.确定事件源
        //2.确定事件动作
        //3.绑定监听
        //控件事件
        bt.addActionListener(new ActionlistenerImpl());
        bt.addMouseListener(new MouseListenerImpl());
        jframe.setVisible(true);
    }
}

class ActionlistenerImpl implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("有SB~~~~~~~");
    }
}

class MouseListenerImpl implements MouseListener {

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("鼠标被点击了");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("鼠标被按下了");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("鼠标松开了");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("鼠标滑入了");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("鼠标滑出了");
    }
}
