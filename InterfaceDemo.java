package junePractice;

interface car{
	
	public void start();
}

class ElectricCar implements car{
	
	public void start() {
		System.out.println("Electric car start");
	}
}
class DieselCar implements car{
	public void start() {
		System.out.println("Diesel car start");
	}
}
public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		car tasla = new ElectricCar();
		car maruti = new DieselCar();
		tasla.start();
		maruti.start();

	}

}
