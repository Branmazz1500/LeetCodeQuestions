package easyAugust7th;

public class HowLongHours {
	public static int hours(double x) {
		int hours = 0;
		double distance = 0.0;
		while(distance < 100) {
			distance+= 60.0/x;
			if(x<15) {
				x+= 0.5;
			}
			hours++;
		}
		return hours;
	}
	public static void main(String[] args) {
		System.out.println("It would take: " + hours(10.0) + " hours.");
	}
}
