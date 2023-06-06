package com.ibm.teamboot.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.teamboot.entity.Team;
import com.ibm.teamboot.service.TeamService;

@CrossOrigin
@RestController
public class TeamController {
    
    @Autowired
    private TeamService service;

    @PostMapping(value = "team/create", consumes = "application/json")
    int createTeam(@RequestBody Team team){
        service.save(team);
        return team.getTeamID();
    }

    @GetMapping(value = "team/find/{teamID}", produces = "application/json")
    Team findTeamByID(@PathVariable int teamID){
        return service.find(teamID);
    }

    @GetMapping(value = "team/findAll", produces = "application/json")
    List<Team> findAllTeams(){
        return service.findAll();
    }
}
