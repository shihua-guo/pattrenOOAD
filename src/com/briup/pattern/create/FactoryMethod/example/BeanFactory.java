package com.briup.pattern.create.FactoryMethod.example;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import com.briup.pattern.create.AbstractFactory.Sender;

public class BeanFactory {
	public Sender getSender(String name){
		InputStream is=BeanFactory.class.getResourceAsStream("Pro.properties");
		Properties pro=new Properties();
		try {
			pro.load(is);
			if(pro.containsKey(name)){
				String className=
					pro.getProperty(name);
				Sender obj=
						(Sender) Class.forName(className).newInstance();
				return obj;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}




