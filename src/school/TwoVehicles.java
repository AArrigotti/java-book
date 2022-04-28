package school;

class VehicleDemo {
	 {
		Vehicle minivan = new Vehicle();
		int range;
		
		// assegna valori ai campi in minivan
		minivan.passengers = 7;
		minivan.fuelcap = 16;
		minivan.mpg = 21;
		
		// calcola il range assumendo una tanica full
		range = minivan.fuelcap * minivan.mpg;
		System.out.println("Minivan can carry " + minivan.passengers + " with a range of " + range);
	}

}


class TwoVehicles {
	public static void main(String[] args) {
		Vehicle minivan = new Vehicle();
		Vehicle sportscar = new Vehicle();
		int range1, range2;
		
		// assegna valori ai campi in minivan
		minivan.passengers = 7;
		minivan.fuelcap = 16;
		minivan.mpg = 21;
		
		sportscar.passengers = 2;
		sportscar.fuelcap = 14;
		sportscar.mpg = 12;
		
		
		// calcola il range assumendo una tanica full
		range1 = minivan.fuelcap * minivan.mpg;
		range2 = sportscar.fuelcap * sportscar.mpg;
		System.out.println("Minivan can carry " + minivan.passengers + " with a range of " + range1);
		System.out.println("Minivan can carry " + sportscar.passengers + " with a range of " + range2);
	}

}
