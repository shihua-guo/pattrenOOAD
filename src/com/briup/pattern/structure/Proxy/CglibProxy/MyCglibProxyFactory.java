package com.briup.pattern.structure.Proxy.CglibProxy;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

//产生代理对象的工厂类
public class MyCglibProxyFactory implements MethodInterceptor {  
  
	public Object getInstance(Class<?> c) {  
	    Enhancer enhancer = new Enhancer();
	    //c就是目标对象
	    enhancer.setSuperclass(c);  
	    enhancer.setCallback(this);  
	    return enhancer.create();  
	}  

	public Object intercept(Object obj, Method method, Object[] args,  
	        MethodProxy proxy) throws Throwable {  

	    System.out.println("开始执行方法");  
	    //这句代码最终会执行到我们目标对象中的方法
	    //o代表的是目标对象执行后返回类型
	    Object o=proxy.invokeSuper(obj, args);  
	    System.out.println(o+"******");
	    System.out.println("方法执行结束"); 

	    return o; 
	}  
}
