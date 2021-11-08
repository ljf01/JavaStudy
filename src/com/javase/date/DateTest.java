package com.javase.date;

import com.javase.Employee;

import javax.swing.Timer;
import  java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.*;

import static jdk.nashorn.internal.objects.NativeMath.max;

/**
 * @author Jiafeng1.Li
 */
public class DateTest implements ActionListener {
    public static void main(String[] args) {
        Comparable<Employee> interfaceTest =  new Employee();
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
        System.out.println("lambda");
        //测试invoke
        System.out.println("invoke测试");
        try {
            Method square = DateTest.class.getMethod("square",double.class);
            Method sqrt = Math.class.getMethod("sqrt", double.class);
            printTable(1,10,10,sqrt);
            printTable(1,10,10,square);
        } catch (NoSuchMethodException ex) {
            ex.printStackTrace();
        }
        System.out.println("接口interface实现");

        System.out.println("排序");
        Employee [ ] staff = new Employee [ 3 ] ;
        staff [ 0 ] = new Employee (1,"Harry Hacker", 35000 ) ;
        staff [ 1 ] = new Employee ( 2," Carl Cracker " , 75000 ) ;
        staff [ 2 ] = new Employee ( 3," Tony Tester " , 38000 ) ;
        Arrays.sort(staff);
        for (Employee e1 : staff) {
            System.out.println(e1.getName()+":"+e1.getPrice());
        }
        System.out.println();
        System.out.println("隔断时间打印数据");
        ActionListener listener = new DateTest();
        Timer timer = new Timer(1000,listener);
        Timer time = new Timer(1000, System.out::println);

        timer.start();//每秒执行一次listener
        try {
            Thread.sleep(10000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        System.out.println("delay60秒");

        //发出一声响铃
        Toolkit.getDefaultToolkit().beep();

        System.out.println();
        System.out.println("clone");
        Employee[] emp1 = staff.clone();
        System.out.println(emp1[0].getName());
        Employee em = new Employee();
        Employee em1 = em.clone();
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
    //测试invoke调用
    public static double square(double x)
    {
        return x * x;
    }
    public static void printTable(double from ,double to,int n, Method f)  {
        System.out.println(f);
        double dx = (to-from)/(n-1);
        for(double x = from ;x<=to;x+=dx)
        {
            try
            {
                double y = (Double)f.invoke(null,x);
                System.out.printf("%10.4f | %10.4f%n",x,y);
            }catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String strDateFormat = "yyyy-MM-dd HH:mm:ss";
        SimpleDateFormat sdf = new SimpleDateFormat(strDateFormat);
        System.out.println("This print time is " + sdf.format(new Date()));
        Toolkit.getDefaultToolkit().beep();
    }
}
