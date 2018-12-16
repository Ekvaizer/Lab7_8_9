package labs;

import labs.Parking.CarType;

public class Main {

	public static void main(String[] args) {
		//7-лаба
		Parking parking1 = new Parking(101, "Vova 4ernii", CarType.BMW, true, true);
		Parking parking2 = new Parking(103, "San9", CarType.BMW, false, false);
		//System.out.println(parking1.toString());
		
		//8-лаба
		ParkingArrayList arrayList = new ParkingArrayList();
		arrayList.addParking(parking1);
		arrayList.addParking(parking2);
		//arrayList.showAll();
		//arrayList.isOnPlace();
		//arrayList.isParkingIsPaid();
		//arrayList.removeName("San9");
		//arrayList.showAll();
		
		//9-лаба
		arrayList.save("./parking.ser");
		arrayList.clearList();
		arrayList.load("./parking.ser");
		arrayList.showAll();
		
	}

}
