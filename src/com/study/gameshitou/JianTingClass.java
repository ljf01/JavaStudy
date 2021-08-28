package com.study.gameshitou;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * com.study.gameshitou
 *
 * @Author: JF LI
 * @Date: 2021/8/28 16:17
 * @Version v1.0
 **/
public class JianTingClass extends JFrame implements MouseListener {
    JButton bt = new JButton("按钮");
    int flag = 1;

    public void init() {
        setSize(468, 580);
        setLocationRelativeTo(null);
        //设置居中
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //设置关闭模式
        // 1.通过窗体对象，取消默认布局
        setLayout(null);
        setLayout(null);
        bt.setBounds(0, 0, 100, 100);
        getContentPane().add(bt);
        //鼠标事件
        bt.addMouseListener(this);
        //键盘事件
        setVisible(true);
    }
    

    //鼠标事件
    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if (flag == 1) {
            bt.setBounds(0, 100, 100, 100);
            flag = 2;
        } else if (flag == 2) {
            bt.setBounds(0, 0, 100, 100);
            flag = 1;
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
