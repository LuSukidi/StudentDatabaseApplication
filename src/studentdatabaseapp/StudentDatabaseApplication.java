package studentdatabaseapp;

import java.util.Scanner;

public class StudentDatabaseApplication {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("How many new students will be added to the database?");
		System.out.println("----------------------------------------------------");
		int numberOfNewStudents = in.nextInt();
		Student[] students = new Student[numberOfNewStudents];
		
		for (int i = 0;i<numberOfNewStudents;i++)
		{
			students[i] = new Student();
			students[i].enroll();
			students[i].payTuition();
			students[i].showInfo();
	
		}

	}

}
