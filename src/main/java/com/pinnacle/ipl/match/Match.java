package com.pinnacle.ipl.match;

public class Match {
    private String matchID;
    private String date;
    private String venue;
    private String team1ID; // ID for Team 1
    private String team2ID; // ID for Team 2
    private String result;   // Result of the match

    // Constructor
    public Match(String matchID, String date, String venue, String team1ID, String team2ID, String result) {
        this.matchID = matchID;
        this.date = date;
        this.venue = venue;
        this.team1ID = team1ID;
        this.team2ID = team2ID;
        this.result = result;
    }

    // Getters and Setters
    public String getMatchID() {
        return matchID;
    }

    public void setMatchID(String matchID) {
        this.matchID = matchID;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public String getTeam1ID() {
        return team1ID; 
    }

    public void setTeam1ID(String team1ID) {
        this.team1ID = team1ID; 
    }

    public String getTeam2ID() {
        return team2ID; 
    }

    public void setTeam2ID(String team2ID) {
        this.team2ID = team2ID; 
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
