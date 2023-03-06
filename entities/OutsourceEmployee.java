package entities;

public final class OutsourceEmployee extends Employee{
	
	private Double additionalCharge;
	
	public OutsourceEmployee() {
		super();
	}

	public OutsourceEmployee(String name, Integer hors, Double valuePerHour, Double additionalCharge) {
		super(name, hors, valuePerHour);
		this.additionalCharge = additionalCharge;
	}

	public Double getAdditionalCharge() {
		return additionalCharge;
	}
	
	@Override
	public Double payment() {
		return super.payment() + additionalCharge * 1.1;
	}
	

}
