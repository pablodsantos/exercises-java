package entities;

public final class OutsourceEmployee extends Employee{
	
	private Double additionalCharge;

	public OutsourceEmployee() {
		super();
	}

	public OutsourceEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
		super(name, hours, valuePerHour);
		this.additionalCharge = additionalCharge;
	}
	
	@Override
	public Double payment() {
		return super.payment() + additionalCharge * 1.1;
	}
}
