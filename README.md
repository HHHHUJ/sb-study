## controller

Controller层，实现与web前端的交互

## bean

Bean层,又称model层，模型层，entity层，实体层，数据库表的映射实体类，存放POJO对象

## service

Service层,业务层，包含业务接口类和业务实现类（Impl）

## mapper

又称DAO层，包括XxxMapper.java(数据库访问接口类)，XxxMapper.xml(数据库链接实现)

#注解
@RestController
rest 风格注解器 等同于@Controller + @ResponseBody

@Override 
注解是用来指定方法重写的，只能修饰方法并且只能用于方法重写，不能修饰其它的元素。
它可以强制一个子类必须重写父类方法或者实现接口的方法


