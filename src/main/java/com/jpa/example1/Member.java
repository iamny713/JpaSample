package com.jpa.example1;

import javax.persistence.*;

@Entity
@TableGenerator(
        name = "BOARD_SEQ_GENERATOR",
        table = "MY_SEQUENCES",
        pkColumnValue = "BOARD_SEQ", allocationSize = 1
)
@Table(name="MEMBER_TEST_NY")
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE,
        generator = "BOARD_SEQ_GENERATOR")
    @Column(name = "ID")
    private int id;
    @Column(name="NAME")
    private String username;
    @ManyToOne
    @JoinColumn(name="TEAM_ID")
    private Team team;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }
}
