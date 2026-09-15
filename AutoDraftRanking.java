import java.util.Arrays;

class Player implements Comparable<Player> {

    // Encapsulated fields
    private String name;
    private int matchesPlayed;
    private double battingAverage;
    private boolean injured;

    // Constructor
    public Player(String name, int matchesPlayed,
                  double battingAverage, boolean injured) {
        this.name = name;
        this.matchesPlayed = matchesPlayed;
        this.battingAverage = battingAverage;
        this.injured = injured;
    }

    // Overloaded rule 1:
    // Established players qualify through experience alone
    static boolean isDraftable(int matchesPlayed) {
        return matchesPlayed >= 10;
    }

    // Overloaded rule 2:
    // Newer players must have enough experience and be fit
    static boolean isDraftable(int matchesPlayed, boolean injured) {
        return matchesPlayed >= 5 && !injured;
    }

    // Compare players by fantasy points (batting average),
    // highest first
    @Override
    public int compareTo(Player other) {
        return Double.compare(other.battingAverage, this.battingAverage);
    }

    // Draft and rank players
    static String draftAndRank(Player[] players) {

        Player[] draftable = new Player[players.length];
        int count = 0;

        for (Player player : players) {

            if (isDraftable(player.matchesPlayed) ||
                isDraftable(player.matchesPlayed, player.injured)) {

                draftable[count] = player;
                count++;
            }
        }

        // Keep only the draftable players
        Player[] result = Arrays.copyOf(draftable, count);

        // Sort using Player's compareTo()
        Arrays.sort(result);

        String output = "";

        for (int i = 0; i < result.length; i++) {
            output += (i + 1) + ". " + result[i].name;

            if (i < result.length - 1) {
                output += " | ";
            }
        }

        return output;
    }

    public static void main(String[] args) {

        Player[] players = {
            new Player("Virat", 15, 48.0, false),
            new Player("Rahul", 7, 55.0, false),
            new Player("Sameer", 3, 60.0, false),
            new Player("Dev", 12, 20.0, true)
        };

        System.out.println(draftAndRank(players));
    }
}
