package com.insurance.info;

import java.util.ArrayList;
import java.util.List;

public class AppMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Orgnization orgnizationObj = new Orgnization();
	
		//Trainer trainerObj = new Trainer();
		
		//Trainee traineeObj = new Trainee();
		
		Training trainingObj = new Training();
		
		Course courseObj = new Course();
		
		Module moduleObj = new Module();
		
		//Unit unitObj = new Unit();
		
		//Topic topicobj =new Topic();
		
		List<Trainee> traineeList = new ArrayList<>();
		
		List<Module> moduleList = new ArrayList<>();
		
		List<Unit> unitList = new ArrayList<>();
		
		
		//-----------------------------------------
		
		System.out.println("------------------------------------");
		System.out.println("Name Your Orgnization :");
		String oragaizationName = Console.readLine();
		orgnizationObj.setName(oragaizationName);
		
		
		System.out.println("Number Of trainer : ");
		int numberofTrainer = Console.readInt();
		
		Trainer[] trainerArray = new Trainer [numberofTrainer];

		for (int i = 0; i < numberofTrainer; i++) 
		{
			System.out.println("Name Trainer "+(1+i)+" :");
			String trainerName = Console.readLine();
			trainerArray[i] = new Trainer();
			trainerArray[i].setTrainerName(trainerName);
		
			
		System.out.println("------------------------------------");
		System.out.println("Number of Trainee :");
		int numberOfTrainee = Console.readInt();
		
		Trainee[] traineeArray = new Trainee [numberOfTrainee];

		for (int c = 0; c < numberOfTrainee; c++) 
		{
			System.out.println("Name Trainee :");
			String traineeName = Console.readLine();
			traineeArray[c] = new Trainee();
			traineeArray[c].setTraineeName(traineeName);
		    traineeList.add(traineeArray[c]);
		}
		
		
		System.out.println("------------------------------------");
		System.out.println("Course Name :");
		String courseName = Console.readLine();
		courseObj.setCourseName(courseName);
		
		System.out.println("------------------------------------");
		System.out.println("Number of Module :");
		int numberOfModule = Console.readInt();
		
		Module[] moduleArray = new Module [numberOfModule];
		Unit[] unitsArray = new Unit [numberOfModule];

		for (int b = 0; b < numberOfModule; b++) 
		{
			System.out.println("Module Name "+(b+1)+" :");
			String moduleName = Console.readLine();
			moduleArray[b] = new Module();
			moduleArray[b].setModuleName(moduleName);
		    moduleList.add(moduleArray[b]);
		 
			System.out.println("Duration of "+moduleArray[b].getModuleName()+" : ");
			int durationHrs = Console.readInt();
			unitsArray[b] = new Unit();
			unitsArray[b].setDurationHrs(durationHrs);
			unitList.add(unitsArray[b]);
		}
		moduleObj.setUnitList(unitList);
			System.out.println("------------------------------------");
			System.out.println("Number of Topic :");
			int numberOfTopic = Console.readInt();
			
			Topic[] topicArray  = new Topic [numberOfTopic];

			for (int z = 0; z < numberOfTopic; z++) 
			{
				System.out.println("Topic Name "+(z+1)+":");
				String topicName = Console.readLine();
				topicArray[z] = new Topic();
				topicArray[z].setTopicName(topicName);
			}
		
	
		//if(trainerArray.length==(numberofTrainer+1))
		//{
		System.out.println();
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Orgnization Name : "+orgnizationObj.getName());
		System.out.println("Trainer Name : "+trainerArray[i].getTrainerName());
		System.out.println("Total Number of Trainees : "+trainingObj.getNumberOfTrainees(traineeList));
		System.out.println("Duration OF tarining in Hrs : "+trainingObj.getTrainingDurationInHrs(unitsArray)+" Hrs");
		
		//moduleObj.setUnitList(unitList);
		System.out.println("Module :-) ");
		for (int g =0;g<moduleArray.length;g++)
		{
			System.out.println("Module : "+moduleArray[g].getModuleName());
			System.out.println("Duration :"+unitsArray[g].getDurationHrs()+" Hrs");
		}
		
		//System.out.println(traineeObj.getTraineeName());
		System.out.println("Trainee :-) ");
		for (int w =0;w<traineeArray.length;w++)
		{
			System.out.println(traineeArray[w].toString());
		}
		
		//System.out.println("Name Of Topic : "+topicobj.getTopicName());
		System.out.println("Topic : ");
		for (int v =0;v<topicArray.length;v++)
		{
			System.out.println(topicArray[v].toString());
		}
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		//break;
		}
		//}
	}

}
