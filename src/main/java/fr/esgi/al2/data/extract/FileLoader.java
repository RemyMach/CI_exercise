package fr.esgi.al2.data.extract;

import fr.esgi.al2.data.model.Team;

import java.util.List;

public interface FileLoader {

  List<Team> load(String filename);
}
