package com.pinnacle.ipl.match;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class MatchService {

   private final List<Match> matches = new ArrayList<>(Arrays.asList(
       new Match("m1", "2025-04-01", "Wankhede Stadium", "T001", "T002", "CSK won by 5 wickets"),
       new Match("m2", "2025-04-02", "Eden Gardens", "T002", "T001", "MI won by 10 runs")
   ));

   public List<Match> getAllMatches() {
       return matches; 
   }
   
   public Match getMatch(String id) {
       return matches.stream()
           .filter(m -> id.equals(m.getMatchID()))
           .findFirst()
           .orElse(null); // Consider throwing an exception if not found
   }
   
   public void addMatch(Match match) {
       matches.add(match);
   }
   
   public void deleteMatch(String id) {
       matches.removeIf(m -> m.getMatchID().equals(id));		
   }
   
   public void updateMatch(String id, Match updatedMatch) {
       for (int i = 0; i < matches.size(); i++) {
           Match current = matches.get(i);
           if (current.getMatchID().equals(id)) {
               matches.set(i, updatedMatch);
               return; // Exit after updating
           }
       }
   }
}
