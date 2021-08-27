package com.insurance.info;

import java.util.ArrayList;
import java.util.List;

public class Trainer {
	
	private String trainerName;

	private List<Trainee> traineeList = new ArrayList<>();
	
	public List<Trainee> getTraineeList() {
		return traineeList;
	}

	public void setTraineeList(List<Trainee> traineeList) {
		this.traineeList = traineeList;
	}

	public String getOrgnization(Orgnization orgnization)
	{
		return orgnization.toString();
	}

	public String getTrainerName() {
		return trainerName;
	}

	public void setTrainerName(String trainerName) {
		this.trainerName = trainerName;
	}
}
