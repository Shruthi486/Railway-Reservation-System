package MainClass;

import ClassesOfRailway.Passenger;
	import ClassesOfRailway.Train;
	import SynchronizedClass.IRCTCBooking;

	public class RailwayBookingMain {
		public static void main(String[] args) {
			Passenger p1=new Passenger("Shruthi",21,456);
			Passenger p2=new Passenger("Ramya",18,766);
			Passenger p3=new Passenger("Teju",20,356);
			
			Train t1=new Train(1120,"Kaveri Express",140,500);
			Train t2=new Train(1235,"Konark Express",70,800);
			
			IRCTCBooking ib =new IRCTCBooking(p1,t1);
			IRCTCBooking ib1 =new IRCTCBooking(p2,t1);
			IRCTCBooking ib2 =new IRCTCBooking(p3,t2);
			
			ib.start();
			ib1.start();
			ib2.start();
			
			
			
		}
	}


