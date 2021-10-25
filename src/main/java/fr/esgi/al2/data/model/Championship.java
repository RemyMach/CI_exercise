package fr.esgi.al2.data.model;

import java.util.List;

public interface Championship {

  public void importTeams(List<Team> teams);

  public Team getTeamWithName(String name);

  public Team getHighestGoalsDifferenceTeam();

}
