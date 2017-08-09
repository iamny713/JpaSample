package com.jpa.example1;

import com.querydsl.core.BooleanBuilder;
import com.querydsl.jpa.impl.JPAQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import java.util.List;

@Controller
@RequestMapping("/member")
public class MemberController {

    @Autowired
    MemberDao memberDao;
    @Autowired
    TeamDao teamDao;
    @Autowired
    EntityManagerFactory emf;

    @RequestMapping("/add")
    public @ResponseBody Member add(@RequestBody Member member) {

        Member addMember = memberDao.save(member);
        return addMember;
    }

    @RequestMapping("/find/{id}")
    public @ResponseBody Member find(@PathVariable int id) {
        Member findMember = memberDao.findOne(id);
        return findMember;
    }

    @RequestMapping("/list")
    public @ResponseBody Iterable<Member> list(@RequestBody Member member) {
        QMember qMember = QMember.member;
        BooleanBuilder builder = new BooleanBuilder().and(qMember.username.eq(member.getUsername()));
        Iterable<Member> list = memberDao.findAll(builder);
        return list;
    }

}
