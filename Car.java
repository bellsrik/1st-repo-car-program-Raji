package no1.Experiment;

public class Car {
	
	int gear = 1;
	int speed = 0;
	int cadence = 0;
	
	void changeGear(int newValue){
		gear = newValue;
	}
	
	void speedUp (int newValue) {
		speed = speed + newValue;
	}
	
	void changeCadence (int newValue) {
		cadence = newValue;
	}
	
	void printStates() {
		System.out.println("Gear = " + gear + " Speed = " + speed + " Cadence = " + cadence);
	}
	
}
