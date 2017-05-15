来源：http://blog.csdn.net/yang_best/article/details/42169549

作为一个优秀的项目经理或项目带头人，必须养成良好优秀的项目命名规则和习惯。接下来把查到的资料整理一下，实际上，在很多项目中，也是遵循以下的规则。
## 一、项目名

全部小写，比如cms、workdesk,jobserver等

## 二、java相关命名
a、类命名：每音节单词前的第一个字母大写，比如FieldInfo、Expression等\
b、普通变量(包括spring里的变量引用命名)：第一个单词前小写，以后每个单词第一个字母大写，password,primaryFlag
c、静态变量：全部大写，多个单词则以_分开，比如BOOLEAN_FLAG
d、包package命名：全部小写,比如com.joinspider.workdesk

补充：
a、类名、变量名是名字组合，多名词顺序和中文顺序一样，比如ScriptEngine
b、属性也可以是形容词+名词
c、常量可使用上述规则，如果为了体现多个常量是一组的概念，也可以被修饰前置，
比如：VAR_START，VAR_END.
c、方法是动词+名字或者只有动词

## 三、属性文件.properties定义变量命名
object.a_b_c格式，全部小写，其中object是宿主，a_b_c多个单词下划线分开。
例：hibernate.cache.use_second_level_cache，hibernate.cache.provider_class，hibernate.cache.provider_configuration_file_resource_path

## 四、xml文件命名
全部小写，-符号是其xml的用途说明，类似applicationContext属习惯命名。比如springmvc-servlet.xml、workdesk-manager.xml、workdesk-servlet.xml、applicationContext-basic.xml等
xml里的内容多个字符间以-隔开，比如param-name，filter-mapping等

## 五、普通文件命名(jsp,js,img等)
和java普通变量规范相同

## 六、属性文件properties
以下划线隔开：errors_zh_CN.properties，hibernate_test.properties

## 七、数据库命名：
表、字段命名全部大写，多个单词以_隔开


附加Java命名规范
一、命名规范

1、 项目名全部小写

2、 包名全部小写

3、 类名首字母大写，如果类名由多个单词组成，每个单词的首字母都要大写。

如：public class MyFirstClass{}

4、 变量名、方法名首字母小写，如果名称由多个单词组成，每个单词的首字母都要大写。

如：int index=0;

       public void toString(){}

5、 常量名全部大写

如：public static final String GAME_COLOR=”RED”;

6、所有命名规则必须遵循以下规则：

1)、名称只能由字母、数字、下划线、$符号组成

2)、不能以数字开头

3)、名称不能使用JAVA中的关键字。

4)、坚决不允许出现中文及拼音命名。

 

二、注释规范

1、   类注释

在每个类前面必须加上类注释，注释模板如下：

/**

* Copyright (C), 2006-2010, ChengDu Lovo info. Co., Ltd.

* FileName: Test.java

* 类的详细说明

*

* @author 类创建者姓名
    * @Date    创建日期

* @version 1.00

*/

 

2、   属性注释

在每个属性前面必须加上属性注释，注释模板如下：

/** 提示信息 */

private String strMsg = null;

 

3、   方法注释

在每个方法前面必须加上方法注释，注释模板如下：

/**

* 类方法的详细使用说明

*

* @param 参数1 参数1的使用说明

* @return 返回结果的说明

* @throws 异常类型.错误代码 注明从此类方法中抛出异常的说明

*/

4、   构造方法注释

在每个构造方法前面必须加上注释，注释模板如下：

/**

* 构造方法的详细使用说明

*

* @param 参数1 参数1的使用说明

* @throws 异常类型.错误代码 注明从此类方法中抛出异常的说明

*/

 

5、   方法内部注释

在方法内部使用单行或者多行注释，该注释根据实际情况添加。

如：//背景颜色

       Color bgColor = Color.RED
