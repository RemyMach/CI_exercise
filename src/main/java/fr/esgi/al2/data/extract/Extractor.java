package fr.esgi.al2.data.extract;

import fr.esgi.al2.data.model.Team;

public interface Extractor {

  Team getFromRawData(String line);
}
