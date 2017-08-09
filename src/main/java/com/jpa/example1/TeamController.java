package com.jpa.example1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/team")
public class TeamController {

    @Autowired
    private TeamDao teamDao;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public @ResponseBody Team add(@RequestBody Team team) {
        Team addMember = teamDao.save(team);

        return addMember;
    }
    @RequestMapping(value = "/list", method = RequestMethod.POST)
    public @ResponseBody List<Team> list() {
        List<Team> list = teamDao.findAll();
        return list;
    }
    @RequestMapping(value = "/find/{id}", method = RequestMethod.GET)
    public @ResponseBody Team find(@PathVariable String id) {
        Team findTeam = teamDao.findOne(id);
        return findTeam;
    }

}
