package com.pinnacle.ipl.performance;

public class Performance {
    private String performanceID;
    private String runs;
    private String balls;
    private String wickets;
    private String overs;
    private String playerID;
    private String matchID;

    // Constructor
    public Performance(String performanceID, String runs, String balls, String wickets, String overs, String playerID, String matchID) {
        this.performanceID = performanceID;
        this.runs = runs;
        this.balls = balls;
        this.wickets = wickets;
        this.overs = overs;
        this.playerID = playerID;
        this.matchID = matchID;
    }

    // Getters and Setters
    public String getPerformanceID() {
        return performanceID;
    }

    public void setPerformanceID(String performanceID) {
        this.performanceID = performanceID;
    }

    public String getRuns() {
        return runs;
    }

    public void setRuns(String runs) {
        this.runs = runs;
    }

    public String getBalls() {
        return balls;
    }

    public void setBalls(String balls) {
        this.balls = balls;
    }

    public String getWickets() {
        return wickets;
    }

    public void setWickets(String wickets) {
        this.wickets = wickets;
    }

    public String getOvers() {
        return overs;
    }

    public void setOvers(String overs) {
        this.overs = overs;
    }

    public String getPlayerID() {
        return playerID;
    }

    public void setPlayerID(String playerID) {
        this.playerID = playerID;
    }

    public String getMatchID() {
        return matchID;
    }

    public void setMatchID(String matchID) {
        this.matchID = matchID;
    }
}
