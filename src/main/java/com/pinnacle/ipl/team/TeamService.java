package com.pinnacle.ipl.team;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TeamService {

    private final List<Team> teams = new ArrayList<>(Arrays.asList(
        new Team("u1", "CSK", "Sharma"),
        new Team("u2", "MI", "Kapoor")
    ));

   public List<Team> getAllTeams() {
       return teams;
   }
   
   public Team getTeam(String id) {
       return teams.stream()
           .filter(t -> id.equals(t.getTeamID()))
           .findFirst()
           .orElse(null); // Consider throwing an exception if not found
   }
   
   public void addTeam(Team team) {
       teams.add(team);
   }
   
   public void deleteTeam(String id) {
       teams.removeIf(t -> t.getTeamID().equals(id));		
   }
   
   public void updateTeam(String id, Team updatedTeam) {
       for (int i = 0; i < teams.size(); i++) {
           Team current = teams.get(i);
           if (current.getTeamID().equals(id)) {
               teams.set(i, updatedTeam);
               return; // Exit after updating
           }
       }
   }
}
