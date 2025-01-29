package com.pinnacle.ipl.team;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class TeamController {

    @Autowired
    private TeamService teamService; // Follow camelCase for variable names

	@RequestMapping(value="/teams")
	public List<Team> getAllTeams() { // Corrected method name to follow camelCase
		return teamService.getAllTeams();	
	}
	
	@RequestMapping(value="/teams/{id}")
	public Team getTeam(@PathVariable String id) {
	    return teamService.getTeam(id);
	}
	
	@RequestMapping(value="/teams", method = RequestMethod.POST)
	public void addTeam(@RequestBody Team team) { // Follow camelCase for variable names
		teamService.addTeam(team);
	}
	
	@RequestMapping(value = "/teams/{id}", method = RequestMethod.DELETE)
	public void deleteTeam(@PathVariable String id) {
	    teamService.deleteTeam(id);
	}
	
	@RequestMapping(value="/teams/{id}", method = RequestMethod.PUT)
	public void updateTeam(@PathVariable String id, @RequestBody Team team) { // Follow camelCase for variable names
	    teamService.updateTeam(id, team);
	}
}
