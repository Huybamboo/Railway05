package Backend.Exercise_3;

public class CPU {
	int price;
	
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public CPU(int price) {
		this.price = price;
	}
	
	public class Processor {
		float coreAmount;
		String menufacturer;
		
		public Processor(float coreAmount, String menufacturer) {
			this.coreAmount= coreAmount;
			this.menufacturer = menufacturer;
		}
	
		
		public float getCoreAmount() {
			return coreAmount;
		}
		public void setCoreAmount(float coreAmount) {
			this.coreAmount = coreAmount;
		}
		public String getMenufacturer() {
			return menufacturer;
		}
		public void setMenufacturer(String menufacturer) {
			this.menufacturer = menufacturer;
		}

	public void getCache(float a) {
		return;
	}
	 @Override
	public String toString() {
	String result = "";
	result += "coreAmount " + coreAmount + "menufacturer " + menufacturer;
		return result;
	}
	}
	
	public class Ram {
		int memory;
		Processor menufacturer;
		
		public Ram (int memory, Processor menufacturer) {
			this.memory = memory;
			this.menufacturer = menufacturer;
		}
		
		public int getMemory() {
			return memory;
		}
		public void setMemory(int memory) {
			this.memory = memory;
		}
		public Processor getMenufacturer() {
			return menufacturer;
		}
		public void setMenufacturer(Processor menufacturer) {
			this.menufacturer = menufacturer;
		}
		
	public void getClockSpeed(float b) {
		return;
		
	}
	public String toString() {
		String result = "";
		result += "memory " + memory + "menufacturer " + menufacturer;
			return result;
		}
	}
	@Override
	public String toString() {
		String result = "";
		result += "price " + price;
		return result;
	}
}
