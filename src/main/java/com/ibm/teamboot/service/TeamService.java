package com.ibm.teamboot.service;

import java.util.List;

import com.ibm.teamboot.entity.Team;

public interface TeamService {
    
    int save(Team team);

    Team find(int teamID);

    List<Team> findAll();

    //boolean remove(int teamID);
}
