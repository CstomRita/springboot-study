## Demo说明
此Demo的主要思想在于学会使用配置文件注入

1. 创建一个JavaBean类Person，其中属性包含对象类、Map、List等复杂类型
2. 使用配置文件对此Bean类的属性注入
3. test方法中可以获取到注入的属性

## 遇到的问题及经验教训

### JavaBean中的get/set方法

<font color=red>@AutoWired自动注入是通过get/set方法进行自动注入的，每个JavaBean都需要生成get/set方法</font>

如果不写get/set，自动注入得到的将是null