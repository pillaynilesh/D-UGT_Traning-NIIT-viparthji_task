package com.insurance.info;

import java.util.List;

public class Training {
	
	public int getNumberOfTrainees(List<Trainee> traineeList)
	{
		return traineeList.size();
	}

	public String getTrainingOrgnizationName(Orgnization orgnization)
	{
		return orgnization.getName();
	}
	
	public int getTrainingDurationInHrs(Unit[] unitArray)
	{
		//return unit.getDurationHrs();
		int temp=0 ;
		for(int i=0 ; i<unitArray.length;i++)
		{
			 temp=temp + unitArray[i].getDurationHrs();
		}
		return temp;
	}
}
