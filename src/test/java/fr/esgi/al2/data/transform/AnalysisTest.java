package fr.esgi.al2.data.transform;

import fr.esgi.al2.data.extract.FileLoader;
import fr.esgi.al2.data.extract.ImplFileLoader;
import fr.esgi.al2.data.model.Championship;
import fr.esgi.al2.data.model.ImplChampionship;
import fr.esgi.al2.data.model.Team;
import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class AnalysisTest {

  private List<Team> teams;
  private Championship championship;

  @Before
  public void setup(){
    // instantiate the teams here (you can reuse the loader written for the FileImporterTest)
    FileLoader fileLoader = new ImplFileLoader();
    teams = fileLoader.load("src/test/resources/football.dat");
    championship = new ImplChampionship();
    this.championship.importTeams(teams);
  }

  @Test
  public void checkTeamsResults() {
    System.out.println(this.championship.getHighestGoalsDifferenceTeam().getName());
    Assertions.assertThat(this.championship.getTeamWithName("Arsenal")).isEqualTo(this.championship.getHighestGoalsDifferenceTeam());
  }
}
