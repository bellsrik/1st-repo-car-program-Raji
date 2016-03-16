package no1.Experiment;

public class BMW {

	public static void main(String[] args) {
		
		Car BMW1 = new Car();
		BMW1.gear = 3;
		BMW1.speed = 35;
		BMW1.cadence = 100;
		BMW1.printStates();
		
		Car BMW5 = new Car();
		BMW5.changeGear(4);
		BMW5.speedUp(70);
		BMW5.changeCadence(140);
		BMW5.printStates();
		
	}

}
