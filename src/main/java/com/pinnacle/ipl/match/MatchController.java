package com.pinnacle.ipl.match;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MatchController {

    @Autowired
    private MatchService matchService;

    @RequestMapping(value = "/matches") 
	public List<Match> getAllMatches() { 
		return matchService.getAllMatches();	
	}
	
    @RequestMapping(value = "/matches/{id}") 
	public Match getMatch(@PathVariable String id) { 
	    return matchService.getMatch(id);
	}
	
    @RequestMapping(value = "/matches", method = RequestMethod.POST) 
	public void addMatch(@RequestBody Match match) { // Follow camelCase for variable names
		matchService.addMatch(match);
	}
	
    @RequestMapping(value = "/matches/{id}", method = RequestMethod.DELETE) 
	public void deleteMatch(@PathVariable String id) { // Follow camelCase for variable names
	    matchService.deleteMatch(id);
	}
	
    @RequestMapping(value = "/matches/{id}", method = RequestMethod.PUT) 
	public void updateMatch(@PathVariable String id, @RequestBody Match match) { // Follow camelCase for variable names
	    matchService.updateMatch(id, match);
	}
}
