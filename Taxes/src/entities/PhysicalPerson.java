package entities;

public class PhysicalPerson extends Person {
	
	private Double cheers;
	
	public PhysicalPerson() {
	}

	public PhysicalPerson(String name, Double annualIncome, Double cheers) {
		super(name, annualIncome);
		this.cheers = cheers;
	}

	public Double getCheers() {
		return cheers;
	}

	public void setCheers(Double cheers) {
		this.cheers = cheers;
	}
	
	@Override
	public Double totalTax() {
		if (getAnnualIncome() < 20.000) {
			return getAnnualIncome() * 0.15 - 0.5 * cheers;
		}else{
			return getAnnualIncome() * 0.25 - 0.5 * cheers;
		}
	}
}
