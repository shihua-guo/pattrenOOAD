package com.briup.pattern.structure.Bridge.example3;

public class Test {
	public static void main(String[] args){
        ITV tv = new SonyTV();
        MyRemoteControl mrc = new MyRemoteControl(tv);
        
        mrc.setChannelKeyboard(100);    
    }
}
