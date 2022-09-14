package com.learn.java.Defaults;

public class Client123 implements InterfaceA, InterfaceB, InterfaceC {

	public void methodA() {
		System.out.println("Inside Method A" + Client123.class);
	}

	public static void main(String[] args) {
		Client123 client = new Client123();
		client.methodA();
		client.mehtodB();
		client.methodC();
	}

}
