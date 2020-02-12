package org.persholas.reviewproject.week11;

public class Person {
	String name,company,job,hobby;
	int age;
	
	public void talkAboutYourself() {
		System.out.println("Hi,I'am "+name+".");
		System.out.println("I'm "+age+"years old.");
		System.out.println("I work at"+company+".");
	}

	public Person(String name, String company, String job, String hobby, int age) {
		super();
		this.name = name;
		this.company = company;
		this.job = job;
		this.hobby = hobby;
		this.age = age;
	}
	public Person(String name, String company) {
		this.name = name;
		this.company = company;
	}
}
