package com.pinnacle.ipl.performance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class PerformanceService {

   private final List<Performance> performances = new ArrayList<>(Arrays.asList(
       new Performance("p1", "50", "30", "2", "5", "p1", "m1"),
       new Performance("p2", "30", "20", "1", "4", "p2", "m2")
   ));

   public List<Performance> getAllPerformances() {
       return performances; 
   }
   
   public Performance getPerformance(String id) {
       return performances.stream()
           .filter(p -> id.equals(p.getPerformanceID()))
           .findFirst()
           .orElse(null); // Consider throwing an exception if not found
   }
   
   public void addPerformance(Performance performance) {
       performances.add(performance);
   }
   
   public void deletePerformance(String id) {
       performances.removeIf(p -> p.getPerformanceID().equals(id));		
   }
   
   public void updatePerformance(String id, Performance updatedPerformance) {
       for (int i = 0; i < performances.size(); i++) {
           Performance current = performances.get(i);
           if (current.getPerformanceID().equals(id)) {
               performances.set(i, updatedPerformance);
               return; // Exit after updating
           }
       }
   }
}
