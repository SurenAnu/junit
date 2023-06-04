package org.program;

import org.junit.runner.JUnitCore;
import org.util.BaseClass;

public class Result {
	public static void main(String[] args) {
		
		org.junit.runner.Result r = JUnitCore.runClasses(BaseClass.class,Junitt.class);
		
System.out.println(r.getFailureCount());
System.out.println(r.getIgnoreCount());
		System.out.println(r.getRunCount());
		System.out.println(r.getRunTime());
		System.out.println(r.wasSuccessful()); 
		
	}

}
