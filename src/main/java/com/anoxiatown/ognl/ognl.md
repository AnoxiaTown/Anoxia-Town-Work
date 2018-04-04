OGNL介绍

    OGNL最初是为了能够使用对象的属性名来建立 UI 组件 (component) 和 控制器 (controllers) 之间的联系
    简单来说就是：视图 与 控制器 之间数据的联系
    后来为了应付更加复杂的数据关系
    Drew Davidson 发明了一个被他称为 KVCL(Key-Value Coding Language) 的语言
    Luke 参与进来后,用 ANTLR 来实现了该语言,并给它取了这个新名字,他后来又使用 JavaCC 重新实现了该语言
    目前 OGNL 由 Drew 来负责维护
    目前很多项目中都用到了 OGNL,其中不乏为大家所熟知的,例如几个流行的 web 应用框架：WebWork,Tapestry,Struts等
    
    OGNL是Object Graphic Navigation Language(对象图导航语言)的缩写,他是一个开源项目
    Struts框架使用OGNL作为默认的表达式语言
    OGNL有一个上下文（Context）概念,说白了上下文就是一个MAP结构,它实现了java.utils.Map 的接口
    Struts框架默认就支持Ognl表达式语言

OGNL的性能

    OGNL或者说表达式语言的性能主要两方面来决定
    一个就是对表达式的解析(Parser)
    另一个是表达式的执行
    OGNL采用javaCC来完成parser的实现
    在OGNL2.7中又对OGNL的执行部分进行了加强
    使用javasisit来JIT(Just-In-Time)的生成byte code来完成表达式的执行
    Ognl给这个功能的名字是 OGNL Expression Compilation

一些链接

    https://www.ibm.com/developerworks/cn/opensource/os-cn-ognl
    http://java12345678.iteye.com/blog/2031790

