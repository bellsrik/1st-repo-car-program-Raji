package no1.Experiment;

public class SUV extends Car {
	
	int horsepower = 300;
	int wheelsize = 20;
	
	void HorsePower(int newValue){
		horsepower = newValue;
	}
	void changeWheelsize(int newValue){
		wheelsize = newValue;
	}
	void printSuvStates(){
		System.out.println("HorsePower = " + horsepower + " WheelSize = " + wheelsize);
	}
}
