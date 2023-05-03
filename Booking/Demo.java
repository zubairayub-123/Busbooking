package Booking;

import java.util.Scanner;
import java.util.Date;

interface Ticket{
	public void source();
	public void getDate();
	public void buses();
	public void seatType();
	public void details();
	public void show();
	String list[] = {"APSRTC","KSRTC","ARBCVR","ORANGE"};
	String seat[] = {"Normal Lower seat","Luxury Lower seat","upper bed"};
	int cost[] = {450,550,800};
}

class Bus implements Ticket{
	Scanner sc = new Scanner(System.in);
	String pick;
	String drop;
	Date date;
	int busNo;
	int seatNo;
	String name;
	int age;
	char gender;
	
	public void source() {
		System.out.println("Enter the pickup point");
		this.pick=sc.nextLine();
		System.out.println("Enter the drop point");
		this.drop=sc.nextLine();	
	}
	
	public void getDate() {
		System.out.println("Enter the travel date");
		
		try {
			this.date= new Date(sc.next());
		}
		catch(Exception e) {
			System.out.println("Enter date in correct format");
		}
	}
	
	public void buses() {
		for(int i=0;i<list.length;i++) {
			System.out.println((i+1) + " ." + list[i]);
		}
		
		System.out.println(" Which bus do you want to choose");
		this.busNo = sc.nextInt();
		
	}
	
	public void seatType() {
		System.out.println("There are 3 catogiries of seats");
		for(int i=0;i<seat.length;i++) {
			System.out.println((i+1) + " ." + seat[i] + " -> " + cost[i]);	
		}
		System.out.println(" Which type of seat do you want to choose");
		this.seatNo = sc.nextInt();
		
	}
	public void details() {
		System.out.println("Enter name:");
		this.name=sc.next();
		
		System.out.println("Enter age:");
		this.age=sc.nextInt();
		
		System.out.println("Enter Gender (m/f):");
		this.gender=sc.next().charAt(0);	
	}
	public void show() {
		System.out.println("Name:" + name);
		System.out.println("Age:" + age);
		System.out.println("Gender:" + gender);
		System.out.println("From:" + pick + " To " + drop);
		System.out.println("Date:" + date);
		System.out.println("BusNo:" + list[busNo-1]);
		System.out.println("Seat Type:" + seat[seatNo-1]);
		System.out.println("Seat cost:" + cost[seatNo-1]);
		System.out.println("Ticket Confirmed");
		System.out.println("Thank you");
	}
}
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bus b = new Bus();
		
		b.source();
		b.getDate();
		b.buses();
		b.seatType();
		b.details();
		b.show();

	}

}
