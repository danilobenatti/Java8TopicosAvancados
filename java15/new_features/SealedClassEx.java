package new_features;

import java.io.PrintWriter;

public class SealedClassEx {
	
	public static void main(String[] args) {
		
		PrintWriter console = new PrintWriter(System.out, true);
		
		Car car = new Car();
		console.println(car.iCan());
		
		Helicopter helicopter = new Helicopter();
		console.println(helicopter.iCan());
		
	}
	
}

abstract sealed class LandVehicle permits Car {
	
	public String iCan() {
		return "I can raid on land!";
	}
	
}

final class Car extends LandVehicle {
	
	@Override
	public String iCan() {
		return super.iCan() + " And highways express.";
	}
}

abstract sealed class Aircraft permits Helicopter {
	
	public String iCan() {
		return "I can fly!";
	}
	
}

final class Helicopter extends Aircraft {
	
	@Override
	public String iCan() {
		return super.iCan() + " And land in many places.";
	}
}
