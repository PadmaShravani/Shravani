
public class Carpool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cars=100,drivers = 30,passengers= 90,cars_not_driven,cars_driven;
		double space_in_a_car=4.0,carpool_capacity,average_passengers_per_car,
		average_miles_driven= 29.2,average_miles_per_gallon= 23.6,gas_cost_per_gallon= 2.517,
		money_saved,gas_cost_per_trip;
		cars_not_driven=cars-drivers;
		cars_driven=drivers;
		carpool_capacity=cars_driven*space_in_a_car;
		average_passengers_per_car=passengers/cars_driven;
		gas_cost_per_trip= (average_miles_driven * gas_cost_per_gallon)/average_miles_per_gallon;
		money_saved=(gas_cost_per_trip*cars)-(gas_cost_per_trip*cars_driven);
		
		System.out.println("There are "+cars+" cars available.\nThere are only "+drivers+
				" drivers available.\nThat means there will be "+cars_not_driven+" empty cars today!We can transport "
				+carpool_capacity+" people today.\nOut of that, we're transporting "+passengers+
				" today.\nSo we'll need to put about "+average_passengers_per_car+
				" in each car.\nLong story short, today, we'll be saving about $"+money_saved+"!");
		
	}

}
