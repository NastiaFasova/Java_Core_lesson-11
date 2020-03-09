
package ua.lgs.lviv.task2;

public class Engine {

	private int radius;
	private String material;

	public Engine(int radius, String material) {
		super();
		this.radius = radius;
		this.material = material;
	}

	@Override
	public String toString() {
		return "Engine [radius=" + radius + ", material=" + material + "]";
	}

}
