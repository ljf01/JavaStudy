### Junit使用：
1. 定义一个测试类
建议：测试类名：被测试类名加Test
包名：xxx.xxx.xx.test
2. 定义测试方法：可以独立运行
建议：方法名，testXxx
返回值：void
参数列表:空参
3. 给方法加@Test注解
4. 导入Junit依赖
判定结果：红色失败，绿色成功，一般使用断言操作处理结果
@Before注解用于资源申请
@After注解用于资源释放
### 反射：框架设计的灵魂
* 框架：半成品软件，可以在框架的基础上进行软件开发，简化编码。
* 反射:将类的各个组成部分封装成其他对象，这就是反射机制。 好处:
1. 可以在程序运行过程中，操作这些对象。
2. 可以解耦，提高程序的可扩展性。
* 获取Class对象的方式：
  1. Class.forName("全类名"):将字节码文件加载进内存，返回Class对象
  2. 类名.Class：通过类名的属性class获取
  3. 对象getClass():getClass()方法在Object类中定义着。
  结论：同一个字节码（*.class）在一次程序运行过程中，只会被加载一次，不论通过哪一种方式获取的Class对象都是同一个。
* Class对象功能：
  * 获取功能:
  1. 获取成员变量们
     * Field[]getFields();获取所有public修饰的成员变量
     * Field getField(String name);获取指定名称的public修饰的成员变量
     * Filed getDeclaredFields();获取所有的成员变量不考虑修饰符
     * Field getDeclaredField(String name);
  2. 获取构造方法们
     * Constructor<?>[] getConstructors()
     * Constructor<T> getConstructor(类<?>...parameterTypes)
     * Constructor<T> getDeclaredConstructor(类<?>... parameterTypes)
     * Constructor<?>[] getDeclaredConstructors()
  3. 获取成员方法们
     * Method[] getMethods();
     * Method getMethod(String name,类<?>... parameterTypes)
     * Method[] getDeclaredMethods();
     * Method getDeclaredMethod(String name,类<?>... parameterTypes);
  4. 获取类名
     * String getName();
* Field:成员变量
    * 操作：
    1. 设置值
        * void set(Object obj,Object value)
    2. 获取值
        * get(Object obj)
    3. 忽略访问权限修饰符的安全检查
        * setAccessible(true); //暴力反射
* Constructor：构造方法
    * 创建对象：T newInstance(Object... initrans);
    * 如果使用空参数构造函数，操作可以简化，Class对象的newInstance方法
* Method:方法对象
    * 执行方法:
        * Object invoke(Object obj,Object... args)
* 案例
    * 需求:写一个框架，不能改变该类的任何代码的前提下，可以帮助我们创建任意类的对象，并且执行其中任意的方法
        * 实现：
            1. 配置文件;
            2. 反射;
        * 步骤:
            1. 将需要创建的对象的全类名和需要执行的方法定义在配置文件中;
            2. 在程序中加载读取配置文件;
            3. 使用反射技术来加载文件进内存;
            4. 创建对象;
            5. 执行方法;
## 注解:
   * JDK1.5之后的新特性;
   * 说明程序的;
   * 作用分类:
     1. 编写文档;
     2. 代码分析;
     3. 编译检查;
   * JDK中预定义的一些注解:
     1. @Override:检测被该注解标注的方式是否是继承自父类（接口）的;
     2. @Deprecated:该注解给标注的内容，表示已过时
     3. @SuppressWarnings:压制警告
        * 一般传递参all:@SuppressWarnings("all")
   * 自定义注解:
        * 格式：
            1. 元注解
            2. public @interface 注解名称{}
        * 本质:注解本质就是一个接口，该接口默认继承Annotation类
        ~~~ java
        public interface com.javawebstudy.Anno.MyAnno extends java.lang.annotation.Annotation{}
        ~~~
        * 属性：接口中的抽象方法
           1. 要求：
              * 属性的返回值类型：
                 * 基本数据类型
                 * String
                 * 枚举
                 * 注解
                 * 以上类型的数组
             * 定义了属性，在使用时需要给属性赋值
                * 如果定义属性时，使用default关键字给属性默认初始化值，则使用注解时，可以不进行属性的赋值;
                * 如果只有一个属性需要赋值，并且属性的名称是value，则value可以省略，直接定义值即可
        * 元注解:用于描述注解的注解
            * @Target：描述注解能够作用的位置;
              * ElementType取值：
                * TYPE:可以作用与类上;
                * METHOD:可以作用于方法上;
                * FIELD:可以作用于成员变量上;
            * @Retention：描述注解能被保存的阶段;
                * @Retention(RetentionPolicy.RUNTIME):当前被描述的注解，会保留到class字节码文件中，并被jvm读取到 
            * @Documented：描述注解是否被抽取到api文档中
            * @Inherited：描述注解是否被子类继承
   * 在程序使用（解析）注解:获取注解中定义的属性值
        * 获取注解定义的位置的对象（Class、Method、Field）
        * 获取指定的注解：
            * getAnnotation(Class)
        * 调用注解中的抽象方法
##### java代码在计算机中经历的阶段:三个阶段
* Source 源代码阶段 -> Class类对象阶段 -> Runtime运行时阶段
  ![](src/file/image/javaThree.jpg)
