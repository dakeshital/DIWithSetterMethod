package SpringDIwithSetterMethod;

public class Car {

	private String carName;
	private String carModel;

	private Engine eng;

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public String getCarModel() {
		return carModel;
	}

	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}

	public Engine getEng() {
		return eng;
	}

	public void setEng(Engine eng) {
		this.eng = eng;
	}

	public void displayInfo() {
		System.out.println("Carname : " + carName);
		System.out.println("Carmodel : " + carModel);
		System.out.println("CarEngine Info : " + eng.getEngId() + " ," + eng.getEngName());
	}

}
