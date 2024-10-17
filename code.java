package erty;

import java.util.Scanner;
public class teacher {
	String name;
	byte age;
	long salary;
	String gender;
	public void enterDetails() {
		Scanner pc=new Scanner(System.in);
		System.out.println("name? : ");
		this.name=pc.next();
		System.out.println("age? : ");
		this.age=pc.nextByte();
		System.out.println("salary? : ");
		this.salary=pc.nextLong();
		System.out.println("gender? : ");
		this.gender=pc.next();
	}
	public void displayDetails() {
		System.out.println("name: " + this.name);
		System.out.println("age: " +  this.age);
		System.out.println("salary: " + this.salary);
		System.out.println("gender: " + this.gender);
	}
}

package erty;

public class start {
	public static void main(String[] args) {
		teacher t = new teacher();
		t.enterDetails();
		t.displayDetails();
	}
}
