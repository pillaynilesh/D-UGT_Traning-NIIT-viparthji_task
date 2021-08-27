package com.insurance.info;

import java.util.ArrayList;
import java.util.List;

public class Module {
	
	String moduleName ;
	
	private List<Unit> unitList = new ArrayList<>();
	
	public List<Unit> getUnitList() {
		return unitList;
	}

	public void setUnitList(List<Unit> unitList) {
		this.unitList = unitList;
	}

	public int getUnit(int durationHrs)
	{
		return durationHrs;
	}

	public String getModuleName() {
		return moduleName;
	}

	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}

	@Override
	public String toString() {
		return "Module [moduleName=" + moduleName + ", unitList=" + unitList + "]";
	}
	
	
}
