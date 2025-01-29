package com.pinnacle.ipl.team;

public class Team {
    private String teamID;
    private String teamName;
    private String ownerName;

    // Constructor
    public Team(String teamID, String teamName, String ownerName) {
        this.teamID = teamID;
        this.teamName = teamName;
        this.ownerName = ownerName;
    }

    // Getters and Setters
    public String getTeamID() {
        return teamID;
    }

    public void setTeamID(String teamID) {
        this.teamID = teamID;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
}
