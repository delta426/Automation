package com.Java;

class Test
{
	public void test()
	{
		System.out.println("Test class Method");
	}
	public static int add(int a,int b)
	{
		return a+b;
	}
	public static double add(double a,double b)
	{
		return a+b;
	}
}
public class PolyMorphism extends Test{
	public void test()
	{
		System.out.println("Polymorphism Class");
	}
	public static void main(String[] args) {
		Test t=new PolyMorphism();
		t.test();
		System.out.println(add(10,20));
		System.out.println(add(10.0,20.0));
		
	}

}
