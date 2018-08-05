package in.co.capgemini;

public class Laptop {
	
	//Instance Variable
	private String company;
	private String model;
	private String operatingSystem;
	private String processor;
	
	//Parameterised Constructor
	public Laptop(String company, String model, String operatingSystem, String processor) {
		super();
		this.company = company;
		this.model = model;
		this.operatingSystem = operatingSystem;
		this.processor = processor;
	}
	
	//Getters and Setters
	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getOperatingSystem() {
		return operatingSystem;
	}

	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}

	public String getProcessor() {
		return processor;
	}

	public void setProcessor(String processor) {
		this.processor = processor;
	}

	@Override
	public String toString() {
		return "Laptop [company=" + getCompany() + ", model=" + getModel() + ", operatingSystem=" + getOperatingSystem()
				+ ", processor=" + getProcessor()   + "]";
	}
	

}
