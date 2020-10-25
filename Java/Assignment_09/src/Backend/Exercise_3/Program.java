package Backend.Exercise_3;

import entity.Car;

public class Program {
	public static void main(String[] args) {
		CPU cpu = new CPU(5000);
		
		CPU.Processor processor = cpu.new Processor(4.3f, "unknows");
		System.out.println(cpu);
		System.out.println(processor);
		
		
		Car car = new Car("Mazda" , "8WD");
		Car.Engine engine = car.new Engine("Crysler");
		System.out.println(car);
		System.out.println(engine);
		
	}

}
