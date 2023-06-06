package com.ibm.teamboot.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Team {

    @Id
    @Column(name = "team_id")
    private int teamID;

    private String teamName;
    private String teamSport;

    /* @OneToMany(mappedBy = "team")
    @JsonManagedReference
    private List<Player> players;
 */

    public Team(int teamID, String teamName, String teamSport) {
        this.teamID = teamID;
        this.teamName = teamName;
        this.teamSport = teamSport;
    }

    public Team() {
    }

    public int getTeamID() {
        return teamID;
    }

    public void setTeamID(int teamID) {
        this.teamID = teamID;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamSport() {
        return teamSport;
    }

    public void setTeamSport(String teamSport) {
        this.teamSport = teamSport;
    }

    /* public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    } */
    
}
