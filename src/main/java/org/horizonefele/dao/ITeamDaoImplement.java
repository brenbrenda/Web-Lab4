package org.horizonefele.dao;

//bean
import org.horizonefele.entities.Team;


//resource
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import jakarta.persistence.Query;
import java.util.List;
@Repository
@Transactional
public class ITeamDaoImplement implements ITeamDao {
    @PersistenceContext
    private EntityManager entityManager;
    @Override
    public void save(Team t) {
        entityManager.persist(t);
    }
    public Team findOne(Long idTeam) {
        Team t = entityManager.find(Team.class,  idTeam);
        return t; }
    public List<Team> findAll() {
        Query query = entityManager.createQuery("select t from Team t");
        return query.getResultList();
    }
    public List<Team> findByName(String name) {
        Query query = entityManager.createQuery("select t from Team t where t.name like :x ");
        query.setParameter("x", "%"+ name +"%");
        return query.getResultList();
    }
    public void remove(Long idTeam) {
        Team t = entityManager.find(Team.class, idTeam);
        entityManager.remove(t);
    }
    public void update(Team t) {
        entityManager.merge(t);
    }
}
//similar to classes with JPA and Hibernate BUT without transactions
// spring takes care of this; one of the practical use of IoC