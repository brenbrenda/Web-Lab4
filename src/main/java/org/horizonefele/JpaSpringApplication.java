package org.horizonefele;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.horizonefele.entities.Team;
import org.springframework.context.ApplicationContext;
import org.horizonefele.dao.ITeamDao;
import java.util.List;

import org.springframework.boot.SpringApplication;

//@ComponentScan(basePackages = "org.horizonefele.dao")
//@EntityScan( basePackages = "org.horizonefele.entities")


@SpringBootApplication
public class JpaSpringApplication {//JpaSpringApplication

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(JpaSpringApplication.class, args);
        ITeamDao teamDao = ctx.getBean(ITeamDao.class);
        teamDao.save(new Team("OM"));
        teamDao.save(new Team("OL"));
        teamDao.save(new Team("PSG"));
        List<Team> teams = teamDao.findByName("O");
        for (Team t : teams) {
            System.out.println("Team : " + t.getName());
        }
    }
}

