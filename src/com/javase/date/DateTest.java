package com.javase.date;

import com.study.classdemo.Employee;

import java.lang.reflect.Array;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
/**
 * @author Jiafeng1.Li
 */
public class DateTest {
    public static void main(String[] args) {
        Date date1 = new Date();
        System.out.println(date1);
        //日期格式化
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        System.out.println(sdf.format(date1));
        LocalDate date = LocalDate.now();
        int month = date.getMonthValue();
        int day = date.getDayOfMonth();
        int year = date.getYear();
        //处理日历的类
        GregorianCalendar gr = new GregorianCalendar(2021, Calendar.DECEMBER, 21);
        gr.add(Calendar.DAY_OF_MONTH, 1000);

        int year1 = gr.get(Calendar.YEAR);

        //查询日期是星期几
        LocalDate date2 = LocalDate.now();
        /*int month1 = date2.getMonthValue();*/
        /*int today = date2.getDayOfMonth();*/
        /* date2 = date2.minusDays(today -1); */
        DayOfWeek week = date2.getDayOfWeek();
        int value = week.getValue();
        System.out.println("当前为星期:" + value);
        System.out.println("year1:" + year1);
        System.out.println(date.plusDays(-1));
        System.out.println();
        System.out.println(year + "年" + month + "月" + day + "日");
        //打印每个月的日历
        LocalDate date3 = LocalDate.now();
        //获取月份数据
        int month3 = date3.getMonthValue();
        //获取时间数据
        int day3 = date3.getDayOfMonth();
        //减去指定天数的日期，此时代表的意思为找到当前月的第一天
        date3 = date3.minusDays(day3 - 1);
        //获取第一天的星期
        DayOfWeek week3 = date3.getDayOfWeek();
        int value3 = week3.getValue();
        System.out.println("Mon Tue Wed Thu Fri Sat Sun");
        for (int i = 1; i < value3; i++) {
            System.out.print("   ");
        }
        while (date3.getMonthValue() == month3) {
            if (date3.getDayOfMonth() == day3) {
                System.out.print(" * ");
            }else {
                System.out.printf("%3d",date3.getDayOfMonth());
            }
            if (date3.getDayOfWeek().getValue() == 7){
                //每周的最后一天输出换行
                System.out.println(" ");
            }
            date3 = date3.plusDays(1);
        }
        ArrayList<String> testList = new ArrayList<>();
        //提前指定集合的长度
        testList.ensureCapacity(2);
        testList.add("test");
        testList.set(0,"");
        //删除集合冗余的空间分配
        testList.trimToSize();
        System.out.println(testList.get(0));
        ArrayList<Integer> test = new ArrayList<>();
        test.add(1);
        System.out.println(test.get(0));
        System.out.printf("%s,%.2f","MAX:",max(3.1,5.6,-5,10));
        System.out.println();
        System.out.println("测试Class");
        Employee e = new Employee();
        System.out.println(e);
        System.out.println(e.getClass());
        System.out.println(e.getClass().getName());
        System.out.println("测试自动扩容方法");
        Array[] a = new Array[10];
        System.out.println("a.length:" + a.length);
        a = (Array[]) goodCopyOf(a,20);
        assert a != null;
        System.out.println("a.length:" + a.length);

    }
    public static double max(double... values)
    {
        double largest = Double.NEGATIVE_INFINITY;
        for(double v : values) {
            if(v > largest) {
                largest = v;
            }
        }
        return largest;
    }

    /*编写通用的自动扩容数组的方法*/

    public static Object goodCopyOf(Object a,int newLength)
    {
        Class<?> cl = a.getClass();
        if(!cl.isArray())
        {
            return null;
        }
        Class<?> componentType = cl.getComponentType();
        int length = Array.getLength(a);
        Object newArray = Array.newInstance(componentType,newLength);
        System.arraycopy(a,0,newArray,0,Math.min(length,newLength));
        return newArray;
    }

}
