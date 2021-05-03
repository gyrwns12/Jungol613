package structure;

import java.util.Scanner;

public class Ex613 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		String school = sc.next();
		int grade = sc.nextInt();
		sc.close();
		
//		System.out.println(name);
//		System.out.println(school);
//		System.out.println(grade);
		
		Person p = new Person(name, school, grade);
		p.print();
	}
}

class Person {
	private String name;
	private String school;
	private int grade;
	
	public Person(String name, String school, int grade) {
		this.name = name;
		this.school = school;
		this.grade = grade;
	}
	
	public void print() {
		System.out.println("Name : " + name);
		System.out.println("School : " + school);
		System.out.println("Grade : " + grade);
	}
}
