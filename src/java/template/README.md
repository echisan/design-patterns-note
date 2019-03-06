# 模板方法

## 介绍

有点像spring security里的那个
[UsernamePasswordAuthenticationFilter](https://github.com/echisan/springboot-jwt-demo/blob/master/src/main/java/cn/echisan/springbootjwtdemo/filter/JWTAuthenticationFilter.java)
用起来大概是这个样子


比如部分方法如`attemptAuthentication(args..)`、`successfulAuthentication(args..)`是无法确定的，交由子类去实现

但主题流程是不变的
