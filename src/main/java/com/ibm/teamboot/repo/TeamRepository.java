package com.ibm.teamboot.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ibm.teamboot.entity.Team;

public interface TeamRepository extends JpaRepository<Team, Integer> {
    
}
