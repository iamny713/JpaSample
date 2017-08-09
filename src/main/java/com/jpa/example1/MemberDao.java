package com.jpa.example1;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;

import javax.transaction.Transactional;

@Transactional
public interface MemberDao extends JpaRepository<Member, Integer>, QueryDslPredicateExecutor<Member> {
}
