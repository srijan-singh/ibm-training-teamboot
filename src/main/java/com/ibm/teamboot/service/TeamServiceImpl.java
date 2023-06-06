package com.ibm.teamboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ibm.teamboot.entity.Team;
import com.ibm.teamboot.repo.TeamRepository;

@Repository
public class TeamServiceImpl implements TeamService {

    @Autowired
    private TeamRepository teamRepository;

    @Override
    public int save(Team team) {
        teamRepository.save(team);
        return team.getTeamID();
    }

    @Override
    public Team find(int teamID) {
        return teamRepository.findById(teamID).orElse(null);
    }

    @Override
    public List<Team> findAll() {
        return teamRepository.findAll();
    }
    
}

