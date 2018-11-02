package com.dvilela.veerum.schedule.util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.io.IOUtils;

public final class Util {
	
	
	public static List<String> getLines(String fileName) {
		List<String> lines = new ArrayList<String>();
		ClassLoader classLoader = Util.class.getClassLoader();
		try { 
		   lines =  Arrays.asList(IOUtils.toString(classLoader.getResourceAsStream(fileName)).split("\n"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return lines;
	 }
	

}
