package labs;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;

public class ParkingArrayList {
	private ArrayList<Parking> paArrayList = new ArrayList<Parking>();
	
	public ParkingArrayList() {
		
	}
	
	public void save(String fileName) {
		try {
			FileOutputStream fileOut = new FileOutputStream(fileName);
			ObjectOutputStream outStream = new ObjectOutputStream(fileOut);
			outStream.writeObject(paArrayList);
			outStream.flush();
			outStream.close();
			fileOut.flush();
			fileOut.close();
			System.out.println("Внесенные данные сохранены в файле: " + fileName);
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
	//backup
	@SuppressWarnings("unchecked")
	public void load(String fileName) {
		try {
			FileInputStream fileIn = new FileInputStream(fileName);
			ObjectInputStream inStream = new ObjectInputStream(fileIn);
			this.paArrayList = (ArrayList<Parking>) inStream.readObject();
			inStream.close();
			fileIn.close();
			
			FileOutputStream fileOutCopy = new FileOutputStream("./backup/copyFile" + (new Date().getTime()) + ".ser");
			ObjectOutputStream outStreamCopy = new ObjectOutputStream(fileOutCopy);
			outStreamCopy.writeObject(paArrayList);
			outStreamCopy.flush();
			outStreamCopy.close();
			fileOutCopy.flush();
			fileOutCopy.close();
			System.out.println("Данные загружены из файла - " + fileName);
		} catch (IOException ex) {
			ex.printStackTrace();
			return;
		} catch (ClassNotFoundException c) {
			System.out.println("Класс с таким именем не найден.");
			c.printStackTrace();
			return;
		}
	}
	
	public void clearList() {
		this.paArrayList.clear();
		System.out.println("Список очищен...");
	}
	
	public void isOnPlace() {
		for (Parking parking : paArrayList) {
			if (parking.isHere() == false) {
				System.out.println(parking.toString());
			}
		}
	}
	
	public void isParkingIsPaid() {
		for (Parking parking : paArrayList) {
			if (parking.isPaid() == false) {
				System.out.println(parking.toString());
			}
		}
	}
	
	public void removeName(String name) {
		for(int i=0; i<paArrayList.size(); i++) {
			if(paArrayList.get(i).toString().contains(name)) {
				paArrayList.remove(paArrayList.get(i));
			}
		}
	}
	
	public void showAll() {
		for (Parking parking : paArrayList) {
			System.out.println(parking.toString());
		}
	}
	
	public void addParking(Parking parking) {
		this.paArrayList.add(parking);
	}
}
