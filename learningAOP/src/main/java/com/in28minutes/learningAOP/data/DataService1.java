package com.in28minutes.learningAOP.data;

import org.springframework.stereotype.Repository;

import com.in28minutes.learningAOP.annotations.TrackTime;

@Repository
public class DataService1 
{
	@TrackTime
	public int[] retrieveData()
	{
		return new int[] {11 , 22 , 33 , 45};
	}
}
