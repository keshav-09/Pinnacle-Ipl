package com.pinnacle.ipl.player;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PlayerController {
    
    @Autowired
    private PlayerService playerService; // Follow camelCase for variable names

    @RequestMapping(value = "/players") 
    public List<Player> getAllPlayers() {
        return playerService.getAllPlayers();	
    }
	
    @RequestMapping(value = "/players/{id}") 
    public Player getPlayer(@PathVariable String id) {
        return playerService.getPlayer(id);
    }
	
    @RequestMapping(value = "/players", method = RequestMethod.POST) 
    public void addPlayer(@RequestBody Player player) { // Follow camelCase for variable names
        playerService.addPlayer(player);
    }
	
    @RequestMapping(value = "/players/{id}", method = RequestMethod.DELETE) 
    public void deletePlayer(@PathVariable String id) {
        playerService.deletePlayer(id);
	}
	
    @RequestMapping(value = "/players/{id}", method = RequestMethod.PUT) 
	public void updatePlayer(@PathVariable String id, @RequestBody Player player) { // Follow camelCase for variable names
	    playerService.updatePlayer(id, player);
	}
}
