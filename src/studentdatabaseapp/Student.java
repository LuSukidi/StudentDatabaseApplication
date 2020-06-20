package studentdatabaseapp;

import java.util.Scanner;

public class Student {

	private String firstName;
	private String lastName;
	private String year;
	private String studentId;
	private String coursesEnrolled = "";
	private int tuitionBalance = 0;
	private static int costOfCourse = 600;
	private static int id = 1000;
	
	public Student()
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter first name of Student: ");
		firstName = in.nextLine();
		System.out.print("Enter last name of Student: ");
		lastName = in.nextLine();
		System.out.println("1 - Freshman\n2 - Sophmore\n3 - Junior\n4 - Senior\nEnter year of Student: ");
		year = in.nextLine();
		
		setStudentId();
		
		
	}
	
	//Generate ID
	private void setStudentId() 
	{
		id++;
		studentId =  year + id;
	}
	//Enroll in course
	public void enroll() 
	{
		do
	    {
		System.out.print("ENTER course to enroll (Q to quit)");
		//Enter a loop. User exits when done enrolling
		Scanner in = new Scanner(System.in);
		String course = in.nextLine();
		if (!course.equals("Q")) 
		{
			coursesEnrolled = coursesEnrolled + "\n " + course;
			tuitionBalance = tuitionBalance + costOfCourse;
		}
		else { break; }
		
		} while (true);
		
	}
	//View balance
	public void viewBalance() { System.out.println("Your tuition balance is: $"+tuitionBalance); }
	//Pay tuition
	public void payTuition() 
	{
		viewBalance();
		Scanner in = new Scanner(System.in);
		System.out.print("Enter payment amount: $");
		int payment = in.nextInt();
		tuitionBalance -= payment;
		System.out.println("Thank you for your payment of $" +payment);
		viewBalance();
	}
	//Show status
	public void showInfo() 
	{
		System.out.println("NAME: "+firstName + " " + lastName);
		System.out.println("GRADE LEVEL: "+year);
		System.out.println("STUDENT ID: "+studentId);
		System.out.println("COURSES ENROLLED: "+coursesEnrolled);
		System.out.println("TUITION BALANCE: "+tuitionBalance);
	}
}
