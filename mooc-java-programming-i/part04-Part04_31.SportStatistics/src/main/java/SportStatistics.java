
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        String input = scan.nextLine();
        ArrayList<Game> games = readRecordsOfGames("data.csv");
        // 2. Prepare parallel lists to track every team's stats
        ArrayList<String> teamNames = new ArrayList<>();
        ArrayList<Integer> wins = new ArrayList<>();
        ArrayList<Integer> losses = new ArrayList<>();

        for (Game game : games) {
            System.out.println(game);
            updateStats(teamNames, wins, losses, game.getHomeTeam(), game.getHomeTeamPoints(), game.getVisitingTeamPoints());
            updateStats(teamNames, wins, losses, game.getVisitingTeam(), game.getVisitingTeamPoints(), game.getHomeTeamPoints());
        }
            // 4. Print the final results for all teams
   
        System.out.println("Final Statistics:");     
        for (int i = 0; i < teamNames.size(); i++) {           
            int totalGames = wins.get(i) + losses.get(i);       
            System.out.println(teamNames.get(i) + ": " + totalGames + " games, " + wins.get(i) + " wins, " + losses.get(i) + " losses");
        }
    }

    public static void updateStats(ArrayList<String> names, ArrayList<Integer> wins,
            ArrayList<Integer> losses, String team, int teamPoints, int opponentPoints) {
        for (String name : names) {
            System.out.println(name);
        }
        if (!names.contains(team)) {
            names.add(team);
            wins.add(0);
            losses.add(0);
        }
        int index = names.indexOf(team);
        if (teamPoints > opponentPoints) {
            wins.set(index, wins.get(index) + 1);
        } else {
            losses.set(index, losses.get(index) + 1);

        }
    }

    public static ArrayList<Game> readRecordsOfGames(String file) {
        ArrayList<Game> games = new ArrayList<>();
        try (Scanner fileReader = new Scanner(Paths.get(file))) {
            while (fileReader.hasNextLine()) {
                String[] parts = fileReader.nextLine().split(",");
                games.add(new Game(parts[0], parts[1], Integer.valueOf(parts[2]), Integer.valueOf(parts[3])));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return games;
    }
}
