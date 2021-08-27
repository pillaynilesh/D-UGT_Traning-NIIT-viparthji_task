package com.insurance.info;

import java.util.ArrayList;
import java.util.List;

public class Unit {
	
	public int durationHrs;
	
	private List<Topic> topicList = new ArrayList<>();

	public List<Topic> getTopicList() {
		return topicList;
	}

	public void setTopicList(List<Topic> topicList) {
		this.topicList = topicList;
	}

	public int getDurationHrs() {
		return durationHrs;
	}

	public void setDurationHrs(int durationHrs) {
		this.durationHrs = durationHrs;
	}
}
