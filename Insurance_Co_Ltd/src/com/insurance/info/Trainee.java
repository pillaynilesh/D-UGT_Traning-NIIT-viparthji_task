package com.insurance.info;

public class Trainee {
	
	private String traineeName;

	public String getTraineeName() {
		return traineeName;
	}

	public void setTraineeName(String traineeName) {
		this.traineeName = traineeName;
	}

	@Override
	public String toString() {
		return "Trainee [traineeName=" + traineeName + "]";
	}
}
