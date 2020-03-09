package ua.lgs.lviv.task2;

public class Car {
	private int horsePower;
	private int year;
	Engine engine;
	Helm helm;
	
	

	public Car(int horsePower, int year, Engine engine, Helm helm) {
		super();
		this.horsePower = horsePower;
		this.year = year;
		this.engine = engine;
		this.helm = helm;
	}

	public int getHorsePower() {
		return horsePower;
	}

	public void setHorsePower(int horsePower) {
		this.horsePower = horsePower;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public Helm getHelm() {
		return helm;
	}

	public void setHelm(Helm helm) {
		this.helm = helm;
	}

	@Override
	public String toString() {
		return "Car [horsePower=" + horsePower + ", year=" + year +  ", \ngetEngine()=" + getEngine() + ", \ngetHelm()=" + getHelm() + "]";
	}

	

	
	
	
	
}
