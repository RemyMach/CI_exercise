package fr.esgi.al2.data.model;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ImplChampionship implements Championship{

    List<Team> teams = new ArrayList<Team>();

    @Override
    public void importTeams(List<Team> teams) {
        this.teams = teams;
    }

    @Override
    public Team getTeamWithName(String name) {
        return this.teams.stream().filter(team -> team.getName().equals(name)).collect(Collectors.toList()).get(0);
    }

    @Override
    public Team getHighestGoalsDifferenceTeam() {
        return this.teams.stream().max(Comparator.comparingInt(team -> team.getScoredGoals() - team.getConcededGoals())).get();

    }
}
