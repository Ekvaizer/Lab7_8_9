package labs;

import java.io.Serializable;

public class Parking implements Serializable{

	private int parkingNumber;
	private String fio;
	private CarType carType;
	private boolean isHere;
	private boolean isPaid;

	enum CarType {
		BMW, Lada, lexus, Citroen, Honda;
	}

	public Parking(int parkingNumber, String fio, CarType carType, boolean isHere, boolean isPaid) {
		this.setParkingNumber(parkingNumber);
		this.setFio(fio);
		this.setCarType(carType);
		this.setHere(isHere);
		this.setPaid(isPaid);
	}

	public int getParkingNumber() {
		return parkingNumber;
	}

	public void setParkingNumber(int parkingNumber) {
		this.parkingNumber = parkingNumber;
	}

	public String getFio() {
		return fio;
	}

	public void setFio(String fio) {
		this.fio = fio;
	}

	public CarType getCarType() {
		return carType;
	}

	public void setCarType(CarType carType) {
		this.carType = carType;
	}

	public boolean isHere() {
		return isHere;
	}

	public void setHere(boolean isHere) {
		this.isHere = isHere;
	}

	public boolean isPaid() {
		return isPaid;
	}

	public void setPaid(boolean isPaid) {
		this.isPaid = isPaid;
	}

	public String toString() {
		return "\nНомер парковки: " + parkingNumber + "\nФИО: " + fio + "\nТип машины: " + carType + "\nСтоит на месте: "
				+ isHere + "\nОплачен ли месяц: " + isPaid;
	}
}
