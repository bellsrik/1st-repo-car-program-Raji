package no1.Experiment;

public class BMWX5 {

	public static void main(String[] args) {
		
		SUV BMWX5 = new SUV();		//declare BMWX5 as a new SUV
		
		BMWX5.cadence = 200;
		BMWX5.gear = 5;
		BMWX5.speed = 90;
		BMWX5.HorsePower(350);
		BMWX5.changeWheelsize(25);
		BMWX5.printStates();
		BMWX5.printSuvStates();
		
	}

}
