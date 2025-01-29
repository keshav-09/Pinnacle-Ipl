package com.pinnacle.ipl.player;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service // Add this annotation
public class PlayerService {
    
    private final List<Player> players = new ArrayList<>(Arrays.asList(
        new Player("p1", "Virat Kohli", "India", Player.PlayerRole.BATSMAN, "T001"),
        new Player("p2", "Jasprit Bumrah", "India", Player.PlayerRole.BOWLER, "T002")
    ));

    public List<Player> getAllPlayers() {
        return players;
    }

    public Player getPlayer(String id) {
        return players.stream()
            .filter(p -> id.equals(p.getPlayerID()))
            .findFirst()
            .orElse(null); // Consider throwing an exception if not found
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public void deletePlayer(String id) {
        players.removeIf(p -> p.getPlayerID().equals(id));
    }

    public void updatePlayer(String id, Player updatedPlayer) {
        for (int i = 0; i < players.size(); i++) {
            Player current = players.get(i);
            if (current.getPlayerID().equals(id)) {
                players.set(i, updatedPlayer);
                return; // Exit after updating
            }
        }
    }
}
