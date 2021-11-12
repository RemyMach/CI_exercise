package fr.esgi.al2.data.extract;

import fr.esgi.al2.data.extract.Extractor;
import fr.esgi.al2.data.model.Team;
import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

public class ContentExtractorTest {

  public final String DATA_SAMPLE = "    0. Paris-Saint-Germain         38    26   4   3    79  -  36    87";

  private Extractor extractor;
  private Team team;

  @Before
  public void setup() {
    extractor = new ImplExtractor();
    // init your extractor here with your implementation
  }

  @Test
  public void loadLine1() {
    team = extractor.getFromRawData(DATA_SAMPLE);
    Assertions.assertThat(team.getName()).isEqualTo("Paris-Saint-Germain");
    Assertions.assertThat(team.getScoredGoals()).isEqualTo(79);
    Assertions.assertThat(team.getConcededGoals()).isEqualTo(36);
    Assertions.assertThat(true).isEqualTo(2);
  }
}
