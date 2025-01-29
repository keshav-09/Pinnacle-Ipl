package com.pinnacle.ipl.performance;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/performances") 
public class PerformanceController {

    @Autowired
    private PerformanceService performanceService; // Follow camelCase for variable names

    @RequestMapping(value = "/performances") 
	public List<Performance> getAllPerformances() { 
		return performanceService.getAllPerformances();	
	}
	
    @RequestMapping(value = "/performances/{id}") 
	public Performance getPerformance(@PathVariable String id) {
	    return performanceService.getPerformance(id);
	}
	
    @RequestMapping(value = "/performances",method = RequestMethod.POST) 
	public void addPerformance(@RequestBody Performance performance) { // Follow camelCase for variable names
		performanceService.addPerformance(performance);
	}
	
    @RequestMapping(value = "/performances/{id}", method = RequestMethod.DELETE) 
	public void deletePerformance(@PathVariable String id) {
	    performanceService.deletePerformance(id);
	}
	
    @RequestMapping(value = "/performances/{id}", method = RequestMethod.PUT) 
	public void updatePerformance(@PathVariable String id, @RequestBody Performance performance) { // Follow camelCase for variable names
	    performanceService.updatePerformance(id, performance);
	}
}
