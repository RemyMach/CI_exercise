package fr.esgi.al2.data.model;

public class ImplTeam  implements Team{
    private String name;
    private int scoreGoals;
    private int concededGaols;

    public ImplTeam(String name, int scoreGoals, int concededGaols) {
        this.name = name;
        this.scoreGoals = scoreGoals;
        this.concededGaols = concededGaols;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getScoredGoals() {
        return this.scoreGoals;
    }

    @Override
    public int getConcededGoals() {
        return this.concededGaols;
    }
}
