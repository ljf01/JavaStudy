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
        * 调用注解中的抽象方法获取配置的属性值
   * 小结：
        1. 以后大多数时候，我们会使用注解，而不是自定义注解;
        2. 注解给谁用？
            * 编辑器
            * 给解析程序用
        3. 注解不是程序的一部分，算是一个标签
   
## JavaWeb课程介绍
1. 什么事JavaWeb？
   * 使用Java语言开发互联网项目。
2. 课程介绍：
   * 数据库
   * 网页前端
   * web核心技术
   * 旅游管理系统
### Mysql数据库知识学习
   1. 数据库的基本概念
   2. Mysql数据库软件
   3. Sql
#### 数据库的基本概念
   1. 数据库的英文单词:DataBase 简称 DB
   2. 什么是数据库？
      * 用于存储和管理数据的仓库。
   3. 数据库的特点
      * 持久化存储数据的，其实数据库就是一个文件系统；
      * 方便存储和管理数据
      * 使用统一的方式操作数据库-SQL
   4. 常见的数据库软件
#### Mysql数据库软件
   1. Mysql服务启动
      * 手动
      * cmd->services.msc打开服务的窗口
      * 使用管理员打开cmd
        * net start mysql: 启动mysql的服务
        * net stop mysql:关闭mysql服务
   2. Mysql登录
        * mysql -uroot -p密码
        * mysql -hip -uroot -p连接目标的密码
        * mysql --host=ip --user=root --password=连接目标的密码
   3. Mysql退出
        * exit
        * quit
   4. Mysql目录结构
        * mysql的安装目录
            * 配置文件：my.ini
        * mysql的数据目录
            * 数据库：文件夹
            * 表:文件
            * 数据：数据
   #### SQL
   1. 什么是SQL？
       Structured Query Language:结构化查询语言
       其实就是定义了操作所有关系型数据库的规则，每一种数据库操作的方式存在不一样的地方
   2. SQL通用写法
   3. SQL分类
      1) DDL(Data Definition Language)数据定义语言;
      2) DML(Data Manipulation Language)数据操作语言，用来对数据库中表的数据进行增删改。关键字：insert，delete，update等；
      3) DQL(Data Query Language)数据查询语言，用来查询数据库中表的记录（数据）。关键字：select，where等；
      4) DCL(Data Control Language)数据控制语言，用来定义数据库的访问权限和安全级别，及创建用户。关键字：GRANT,REVOKE等；
   ##### DDL:操作数据库、表
   1. 操作数据库：CRUD
        1. C(Create):创建
            * 创建数据库：
                * create database 数据库名称；
            * 创建数据库，判断不存在，再创建：
                * create database if not exists 数据库名称；
            * 创建数据库，并指定字符集
                * create database 数据库名称 character set 字符集名；
            * 练习：创建db4数据库，判断是否存在，并且指定字符集为gbk
                * create database if not exists db4 character set gbk;
        2. R(Retrieve):查询
            * 查询所有数据库的名称：
                * show databases;
            * 查询某个数据库的字符集:查询某个数据库的创建语句
                * show create database 数据库名称；
        3. U(Update):修改
            * 修改数据库的字符集
                * alter database 数据库名称 character set 字符集名称；
        4. D(Delete):删除
            * 删除数据库: drop database 数据库名称；
            * 判断数据库是否存在，存在再删除：drop database if exists 数据库名称；
        5. 使用数据库
            * 查询当前正在使用的数据库名称
                * select database();
            * 使用数据库
                * use 数据库名称；
   2. 操作表
        1. C(Create):创建
            1. 语法:
               create table 表名(列名1 数据类型1,列名2 数据类型2);
            2. 数据库类型：
                * int :整数类型;
                * double: 小数类型;score double(5,2)
                * date:日期，只包含年月日，yyyy-MM-dd
                * datetime:日期，包含年月日时分秒 yyyy-MM-dd HH:mm:ss
                * timestamp:时间戳类型 包含年月日时分秒 yyyy-MM-dd HH:mm:ss
                * varchar: 字符串 name varchar(20);需要指定字符的最大长度、
            3. 复制表:
                create table 表名2 like 表名1;
        2. R(Retrieve):查询
            * 查询某个数据库中所有的表名称
                * show tables;
            * 查询表结构
                desc 表名;
        3. U(Update):修改
            * 修改表名:alter table 表名 rename to 新名称;
            * 修改表的字符集:alter table 表名 character set 字符集名称;
            * 添加列:alter table 表名 add 列名 数据类型;
            * 修改列名称 类型:alter table 表名 change 列名 新列别 新数据类型; alter table 表名 modify 列名 新数据类型;
            * 删除列:alter table stu drop 列名;
        4. D(Delete):删除
            * drop table 表名；
            * drop table if exists 表名；

#### DML: 增删改表中数据
1. 添加数据:insert into 表名(字段1,字段2) values (值1,值2); insert into 表名 values(值1,值2);
2. 删除数据:delete from 表名 where 字段 = “”;
   * 如果要删除所有记录:
        * delete from 表名;效率比较低
        * truncate table 表名;先删除表，在创建一张一样的表;效率更高
3. 修改数据:update 表名 set 字段 = “” where  字段1 = “”;
#### DQL:查询表中的记录
* select * from 表名;
* select 字段名称 from 表名称 where 查询条件 group by 分组字段 having 分组之后的条件 order by 排序 limit 分页限定;
* 计算值相加:如果有null则计算结果全是null可以使用IFNULL(字段,0);
* 条件查询 WHERE 子句查询;
* 排序查询:ORDER BY,ASC DESC
* 聚合函数:count(),sum(),max(),min()，avg()平均值等
* 分组查询:GROUP BY;having为分组之后的条件使用语句;where在分组之前限定;where后不可使用聚合函数,having后可用聚合函数;
* 分页查询:LIMIT 
  * 约束:主键primary key，非空not null，唯一unique，外键foreign key
  * 非空约束：
    * 添加约束：create table 表名(id int ,name varchar(20) not null);
    * 存在之后添加非空约束:alter  table 表名 modify 字段名 数据类型 not null;
    * 删除非空约束: alter table 表名 modify 字段名 数据类型;
  * 唯一约束:
    * 添加唯一约束:create table 表名 (id int ,phone_number varchar(20) unique);
    * 创建表之后添加唯一约束:alter  table 表名  modify 字段名 数据属性 unique;
    * 删除唯一约束:alter table 表名 drop index 字段名;
* 多表之间的关系
* 范式
* 

##### java代码在计算机中经历的阶段:三个阶段
* Source 源代码阶段 -> Class类对象阶段 -> Runtime运行时阶段
  ![](src/file/image/javaThree.jpg)
