package org.horizonefele.dao;
import java.util.List;
import org.horizonefele.entities.Team;
public interface ITeamDao {
    public void save(Team t);
    public List<Team> findAll();
    public List<Team> findByName(String name);
    public Team findOne(Long idTeam);
    public void update(Team t);
    public void remove(Long idTeam);
}