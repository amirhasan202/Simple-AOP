package com.in28minutes.learningAOP.business;

import java.util.Arrays;

import org.springframework.stereotype.Service;

import com.in28minutes.learningAOP.annotations.TrackTime;
import com.in28minutes.learningAOP.data.DataService1;

@Service
public class BusinessService
{
	private DataService1 ds;
	
	public BusinessService (DataService1 ds)
	{
		this.ds=ds;
	}
	
	@TrackTime
	public int calculateMax()
	{
		int data[] = ds.retrieveData();
		return Arrays.stream(data).max().orElse(0);
	}
}
