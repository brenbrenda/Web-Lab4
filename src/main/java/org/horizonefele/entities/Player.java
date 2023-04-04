package org.horizonefele.entities;


import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Player implements Serializable {
    @Id
    @GeneratedValue
    private Long idPlayer;
    @Column(length = 100)
    private String name;
    @ManyToOne
    @JoinColumn(name = "idTeam")
    private Team myteam;

    public Long getIdPlayer() {
        return idPlayer;
    }

    public void setIdPlayer(Long idPlayer) {
        this.idPlayer = idPlayer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Team getMyteam() {
        return myteam;
    }

    public void setMyteam(Team myteam) {
        this.myteam = myteam;
    }
//constructors
//getters and setters

}