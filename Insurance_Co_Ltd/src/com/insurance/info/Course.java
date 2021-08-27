package com.insurance.info;

import java.util.ArrayList;
import java.util.List;

public class Course {
		
	private String courseName;
	
	private List<Module> moduleList = new ArrayList<>();
	
	public List<Module> getModuleList() {
		return moduleList;
	}
	public void setModuleList(List<Module> moduleList) {
		this.moduleList = moduleList;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

}
