package com.jpa.example1;

import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

@Transactional
public interface TeamDao extends JpaRepository<Team, String> {
}


