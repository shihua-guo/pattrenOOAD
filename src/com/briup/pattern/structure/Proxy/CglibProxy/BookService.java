package com.briup.pattern.structure.Proxy.CglibProxy;

//目标的对象 没有实现接口
public class BookService {
    public void addBook() {  
        System.out.println("添加书籍成功");  
    } 
    public void addBook1() {  
    	System.out.println("添加书籍成功1");  
    } 
    public void addBook2() {  
    	System.out.println("添加书籍成功2");  
    } 
}
