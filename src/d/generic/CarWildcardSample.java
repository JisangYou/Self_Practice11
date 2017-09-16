package d.generic;

public class CarWildcardSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CarWildcardSample sample = new CarWildcardSample();
		sample.callBoundedWildcardMethod();
		sample.callBoundedBusWildcardMethod();
	}

	public void callBoundedWildcardMethod() {
		WildcardGeneric<Car> wildcard = new WildcardGeneric<Car>();
		wildcard.setWildcard(new Car("Mustang"));
		boundedWildcardMethod(wildcard);
	}
	
	public void callBoundedBusWildcardMethod() {
		WildcardGeneric<Bus> wildcard = new WildcardGeneric<Bus>();
		wildcard.setWildcard(new Bus("6900"));
		boundedWildcardMethod(wildcard);
	}
	
	public void boundedWildcardMethod(WildcardGeneric<? extends Car>c){
		Car value = c.getWildcard();
		System.out.println(value);
	}

}
