package entities;

public class Employee {
	
	private String name;
	private Integer hours;
	private Double valuePerHour;
	
	public Employee() {
		
	}
	public Employee(String name, Integer hors, Double valuePerHour) {
		this.name = name;
		this.hours = hors;
		this.valuePerHour = valuePerHour;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getHors() {
		return hours;
	}
	public Double getValuePerHour() {
		return valuePerHour;
	}
	
	public Double payment() {
		return valuePerHour * hours;
	}
}
