package com.learn.java.Defaults;

public class Client14 implements InterfaceA,InterfaceD{

	public static void main(String[] args) {
      Client14 client14=new Client14();
      client14.methodA();
	}

	@Override
	public void methodA() {
     System.out.println("nside Method A"+Client14.class);
	}

}
