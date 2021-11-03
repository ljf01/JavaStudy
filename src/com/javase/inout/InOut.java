package com.javase.inout;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 * @author Jiafeng1.Li
 */
public class InOut {
    public static void main(String[] args)
    {
        try {
            //读取文件
            Scanner sc = new Scanner(Paths.get("D:\\javase\\javase.txt"), String.valueOf(StandardCharsets.UTF_8));
            String temp = sc.nextLine();
            System.out.println(temp);
            //写入文件
            try (PrintWriter pr = new PrintWriter("D:\\javase\\Test.txt", String.valueOf(StandardCharsets.UTF_8))) {
                pr.print("TEST_TEST_TEST");
                pr.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
