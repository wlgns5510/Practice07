package com.javaex.ex02;

public abstract class Bird {
    //필드
	private String name;
	
	//생성자
	public Bird() {}
	public Bird(String name) {
		this.name = name;
	}
	
	//메소드 gs	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	//메소드 일반 
    public abstract void sing();               
	public abstract void fly();        
    public abstract void showName();
    
    



}
