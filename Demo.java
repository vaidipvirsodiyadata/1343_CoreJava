package com.jbk;

public class Demo {
	public  void name() {
		System.out.println("name :- vaidip");
	}
	public void age() {
		System.out.println("age:-"+20);
	}
	public void percentage() {
		System.out.println("percentage ="+90.55f);
	}
	public void temperature() {
		System.out.println("temperatur = "+31.5);
	}
	public void grade() {
		System.out.println("grade ="+'a');
	}
	public void eligible() {
		System.out.println("eligible:-"+true);
	}
	public void city() {
		System.out.println("city:-pune");
	}
	public void display(String name) {
		System.out.println(name);
	}
	public void age(int a) {
		System.out.println(a);
	}
	public void add(int a,int b) {
		System.out.println(a+b);
	}
	public void percentage(float a) {
		System.out.println(a);
	}
	public void display(char ch) {
		System.out.println(ch);
	}
	public void check(boolean b) {
		System.out.println(b);
	}
	public void salary(double d) {
		System.out.println(d);
	}
	public String name1() {
		System.out.println("name:-vaidip");
		return "vaidip";
	}
	public int age1() {
		System.out.println("age:-"+20);
		return 20;
	}
	public float percentage1() {
		System.out.println("percentage:-"+85.5f);
		return 85.5f;
				
	}
	public double temperature1() {
		System.out.println("temperature = "+36.6);
		return 36.6;
	}
	public char grade1() {
		System.out.println("grade:-"+'a');
		return 'a';
	}
	public boolean eligible1() {
		System.out.println("eligible :-"+true);
		return true;
	}
	public long number() {
		System.out.println("number:-"+1234567890l);
		return 1234567890l;
	}
	public String join(String a, String b) {
		System.out.println("a+b:-"+a+b);
		return a+b;
	}
	public double multiply(double a, double b) {
		System.err.println("multiplication:-"+a*b);
		return a*b;
	}
	public float interest(float a, float b, float i) {
		System.out.println("interest = "+a*b*i/100);
		return a*b*i/100;
	}
	public char upper(char ch) {
		System.out.println("upper:-"+ch);
		return ch;
	}
	public boolean vote(int age) {
		System.out.println("voter age:-"+age);
		return age >=18;
	}
	public long square(long n) {
		System.out.println("square ="+n);
		return n*n;
	}
	public double price(double a, double discount) {
		System.out.println("price = "+(a*discount/100));
		return a-(a*discount/100);
	}
	public boolean vowel(char ch) {
		System.out.println("vowel = "+ch);
		return ch =='a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
		
	}
	

}
