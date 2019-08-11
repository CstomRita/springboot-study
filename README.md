通过此project学习springBoot
## 为什么要从SSM到SpringBoot
之前一直使用SSM框架，那么SSM和SpringBoot的具体区别是什么呢？

以下是从知乎转到的答案，觉得说的很不错：

对于普通开发而言，springboot和ssm好像并没有太多的区别，尤其web开发过程中，基本上就是springmvc接收请求，spring做对象管理，mybatis进行数据操作，在这一层面而言，使用springboot和ssm or ssh，并没有什么区别

Controller层接收请求 ->service处理操作 - >dao层数据操作

但是跳转到更上一级而言，springboot的意义就十分重大了。

它提供了一个<font color=red>**标准**</font>:

1. 在以往的ssm架构中，根据不同架构师的理念
    1. 对于ssm的整体配置，有着不同的理解，
有些架构师喜欢将html页面，静态文件等等扔在一个目录下解析，
有些架构师喜欢分开目录解析，
还有些架构师喜欢在页面后附加.do 来区分是请求controller还是静态资源。
当然这样做并没有太大的问题，
唯一的问题是<font color=red>有没有一个良好的标准来约束。从而减少开发人员上手时，减少阅读配置文件的时间?</font>
如果形成一个良好的规范，大家都遵守该规范，那么也就不再有必要阅读那些毫无意义却又十分重要的配置文件？

    2. 在springboot-starter-web中，你可以直接将静态资源放在/static下，静态页面放在/public下，若是需要配置站点的icon，只需要在目录下放置一个对应名称的文件即可。

2. 若是需要连接mysql：
    1. 使用ssm架构，或许架构师会这么做:首先引入对应的jar包，然后处理对应的依赖，若是有冲突，则需要解决依赖冲突，解决完毕后，配置对应的配置文件，然后再配置spring的xml。
    2. 换成springboot ，就只需要两步，寻找starter，在application.properties配置必要参数。依赖问题由starter及springboot parent去解决，参数配置集中配置在application.properties。这就解决了好几个问题，首先，参数配置均在application.properties中，其次，依赖问题有starter自己解决，依赖冲突有springboot parent去解决。我们只需要关注最核心的几个参数配置即可，而且其他人上手该项目，也只需要去关注最重要的几个点即可，而不是在一堆xml中去查证对应配置。



<font color=Red>**由此看来，springboot和传统的ssm的区别，则在于其提供了一个良好且有效的标准，虽然它允许你可以自由配置，但是它仍旧希望你在满足需求的前提下，使用它的默认配置，而在目前看来，springboot的默认配置，也已经满足了绝大多数情况下的开发要求。**</font>



对于springboot和ssm的区别，个人理解看来，springboot更像是一个应用商店，你需要什么，你就去寻找对应的应用(starter)，并组装完成你的需求，而ssm，则仅仅是一个简单的应用工具，仅用于web开发领域。



## 具体学习笔记见[SpringBoot第一篇入门笔记.md](SpringBoot第一篇入门笔记.md)
