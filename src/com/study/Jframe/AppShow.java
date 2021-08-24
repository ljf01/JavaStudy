package com.study.Jframe;

import javax.swing.*;

/** @author Jiafeng1.Li */
public class AppShow {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("JButton控件演示");
        frame.setSize(514, 538);
        frame.setLocationRelativeTo(null);
        frame.setAlwaysOnTop(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        // 1.通过窗体对象，取消默认布局
        frame.setLayout(null);
        // 2.创建按钮对象
        JButton btn = new JButton();
        // 3.通过窗体对象，获取到面板对象，并调用add方法添加按钮组件
        frame.getContentPane().add(btn);
        btn.setBounds(50, 50, 90, 40);
        JButton btn2 = new JButton("开心吗");
        btn2.setBounds(50, 100, 90, 40);
        frame.getContentPane().add(btn2);

        // JLabel展示文本和图片
        ImageIcon icon =
                new ImageIcon(
                        "src/com/study/image/shitou/1.png");
        JLabel label = new JLabel(icon);
        label.setBounds(50, 150, 300, 300);
        frame.getContentPane().add(label);
        frame.setVisible(true);
    }
}
