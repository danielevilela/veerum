package com.dvilela.veerum.schedule.controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.dvilela.veerum.schedule.model.Seed;
import com.dvilela.veerum.schedule.repository.SeedRepository;
import com.dvilela.veerum.schedule.util.Constants;
import com.dvilela.veerum.schedule.util.Util;
import com.google.gson.Gson;

@Controller
public class SeedController {
	
	@Autowired
	private SeedRepository iSeed;

	@GetMapping("/")
	public ModelAndView getMatches() {
		ModelAndView modelAndViewMatches = new ModelAndView("index");
		loadFile("financial.txt");
		List<Seed> schedule = iSeed.findAll();
		modelAndViewMatches.addObject("schedule",schedule);		
		return modelAndViewMatches;
	}
	public void loadFile(String fileName) {
		Gson gson = new Gson();
		Util.getLines(fileName).forEach(line -> {			
			Seed seed = gson.fromJson(line, Seed.class);
			System.out.println(line);
			saveData(seed);
		});
	}
	
	public void saveData(Seed seed) {
		this.iSeed.save(seed);		
	}
	  
}
