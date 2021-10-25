package fr.esgi.al2.data.extract;

import fr.esgi.al2.data.model.ImplTeam;
import fr.esgi.al2.data.model.Team;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ImplFileLoader implements FileLoader{
    @Override
    public List<Team> load(String filename) {
        List<Team> teams = new ArrayList<Team>();
        try {
            File file = new File(filename);
            Scanner scanner = new Scanner(file);

            while(scanner.hasNextLine()) {
                scanner.nextLine();
                break;
            }

            while(scanner.hasNextLine()) {
                String line = scanner.nextLine();
                Extractor extractor = new ImplExtractor();
                teams.add(extractor.getFromRawData(line));
            }
            return teams;
        }catch (Exception e) {
            e.printStackTrace();
        }

        return teams;
    }
}
