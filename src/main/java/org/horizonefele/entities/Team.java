package org.horizonefele.entities;



import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Entity
public class Team implements Serializable {
    @Id @GeneratedValue
    private Long idTeam;
    @Column(length=100)
    private String name;
    @OneToMany(mappedBy="myteam")
    private Collection<Player> players;
    public Team(String om) {
        name = om;
    }

    //Constructors
    //Getters and Setters
    public Long getIdTeam() {
        return idTeam;
    }

    public void setIdTeam(Long idTeam) {
        this.idTeam = idTeam;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}