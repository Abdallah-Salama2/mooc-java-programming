/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Abdallah Fawzi
 */
public class Game {

    private String homeTeam, visitingTeam;
    private int homeTeamPoints, visitingTeamPoints;

    public Game(String homeTeam, String visitingTeam, int homeTeamPoints, int visitingTeamPoints) {
        this.homeTeam = homeTeam;
        this.visitingTeam = visitingTeam;
        this.homeTeamPoints = homeTeamPoints;
        this.visitingTeamPoints = visitingTeamPoints;
    }

    public String getHomeTeam() {
        return homeTeam;
    }

    public String getVisitingTeam() {
        return visitingTeam;
    }

    public int getHomeTeamPoints() {
        return homeTeamPoints;
    }

    public int getVisitingTeamPoints() {
        return visitingTeamPoints;
    }

    public boolean participated(String team) {
        return this.homeTeam.equals(team) || this.visitingTeam.equals(team);
    }

    @Override
    public String toString() {
        return this.homeTeam + " " + this.homeTeamPoints + " - "
                + this.visitingTeamPoints + " " + this.visitingTeam;
    }
}
