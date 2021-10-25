package fr.esgi.al2.data.extract;

import fr.esgi.al2.data.model.Team;
import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class FileImporterTest {

  public static final String DATA_FILENAME = "src/test/resources/football.dat";


  private FileLoader fileLoader;
  private List<Team> teams;

  @Before
  public void setup(){
    fileLoader = new ImplFileLoader();
    // instantiate your dedicated file loader here

  }

  @Test
  public void loadDataFile() {
    teams = this.fileLoader.load(DATA_FILENAME);
    Assertions.assertThat(teams.size()).isEqualTo(20);
    Assertions.assertThat(teams.stream().anyMatch(t -> t.getName().equalsIgnoreCase("Fulham"))).isTrue();
  }
}
