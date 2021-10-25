package fr.esgi.al2.data.extract;

import fr.esgi.al2.data.model.ImplTeam;
import fr.esgi.al2.data.model.Team;

public class ImplExtractor implements Extractor{

    public ImplExtractor(){};

    @Override
    public Team getFromRawData(String line) {
        String LineTrim = line.trim().replaceAll(" +|\\.+", " ");
        String finalLine = LineTrim.replaceAll(" +", " ");
        String[] result = finalLine.split(" ");
        return new ImplTeam(result[1],Integer.parseInt(result[6]), Integer.parseInt(result[8]));
    }
}
