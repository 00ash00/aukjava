package Project10;

public class project10_part2 {
    public static class BasketballPlayer {
        private String name;
        private int age;
        private String team;
        private int number;
        private int scores;

        public BasketballPlayer(String name, int age, String team, int number, int scores) {
            this.name = name;
            this.age = age;
            this.team = team;
            this.number = number;
            this.scores = scores;
        }

        // getter and setter methods
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getTeam() {
            return team;
        }

        public void setTeam(String team) {
            this.team = team;
        }

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }

        public int getScores() {
            return scores;
        }

        public void setScores(int scores) {
            this.scores = scores;
        }

        // description
        public String getDescription() {
            return "Player: " + name + "\nAge: " + age + "\nTeam: " + team + "" +
                    "\nJersey Number: " + number + "\nScores: " + scores;
        }
    }

    public static class PlayerCollection {
        private int count;
        private BasketballPlayer[] players; // // 2.2

        // constructor
        public PlayerCollection() {
            count = 0;
            players = new BasketballPlayer[3]; // 2.1
        }

        // method to add a new player
        public void addPlayer(BasketballPlayer newPlayer) { // 2.3
            if (count == players.length) {
                BasketballPlayer[] newPlayers = new BasketballPlayer[players.length * 2]; // it will multiply collection by 2
                for (int i = 0; i <= count; i++) {
                    newPlayers[i] = players[i];
                }
                players = newPlayers;
            }
            players[count] = newPlayer;
            count++;
        }

        // print detailed information about a player by spec. index
        public void printPlayer(int index) { // 2.4
            if (index >= 0 && index < count) {
                BasketballPlayer player = players[index];
                System.out.println(player.getDescription());
            } else {
                System.out.println("Index error.");
            }
        }

        // print detailed information about all players
        public void print_allPlayers() { //2.4
            for (int i = 0; i < count; i++) {
                BasketballPlayer player = players[i];
                System.out.println("Player " + (i + 1) + ":");
                System.out.println(player.getDescription());
                System.out.println();
            }
        }

        // print players with the same team
        public void find(String search) { //2.5
            boolean match = false;
            for (int i = 0; i < count; i++) {
                BasketballPlayer player = players[i];
                if (player.getTeam().equals(search)) { // 2.7
                    System.out.println("Matching player found:");
                    System.out.println(player.getDescription());
                    System.out.println();
                    match = true;
                }
            }
            if (!match) {
                System.out.println("No matching players found.");
            }
        }

        // 2.6
        public void sort() {
            for (int i = 0; i < count - 1; i++) {
                for (int j = i + 1; j < count; j++) {
                    BasketballPlayer player1 = players[i];
                    BasketballPlayer player2 = players[j];
                    if (player2.getScores() > player1.getScores()) {
                        BasketballPlayer temp = players[i];
                        players[i] = players[j];
                        players[j] = temp;
                    }
                }
            }
        }

        public static void main(String[] args) {
            System.out.print("____________________________\n");
            System.out.println("\nHobby: Basketball\n");
            System.out.print("____________________________");

            PlayerCollection playerCollection = new PlayerCollection();

            BasketballPlayer player1 = new BasketballPlayer("Kobe Bryant", 41,
                    "Los Angeles Lakers", 24, 33643);
            BasketballPlayer player2 = new BasketballPlayer("LeBron James", 38,
                    "Los Angeles Lakers", 23, 38652);

            BasketballPlayer player3 = new BasketballPlayer("Jimmy Butler", 34,
                    "Miami Heat", 22, 13688);

            // add to collection
            playerCollection.addPlayer(player1);
            playerCollection.addPlayer(player2);
            playerCollection.addPlayer(player3);

            System.out.println("\nPlayer 1:");
            playerCollection.printPlayer(0);

            System.out.println("\nPlayer 2:");
            playerCollection.printPlayer(1);

            System.out.println("\nPlayer 3:");
            playerCollection.printPlayer(2);

            System.out.print("____________________________");

            System.out.println("\nAll players:");
            playerCollection.print_allPlayers();

            System.out.print("____________________________");

            System.out.println("\nPlayers from LA Lakers:");
            playerCollection.find("Los Angeles Lakers");

            System.out.print("____________________________");

            System.out.println("\nSorted players (based on scores):");
            playerCollection.sort();
            playerCollection.print_allPlayers();

            System.out.print("____________________________");

            // Change player 2's information
            player2.setName("Kevin Durant");
            player2.setAge(33);
            player2.setTeam("Brooklyn Nets");
            player2.setNumber(7);
            player2.setScores(25000);

            // Retrieve the updated player object from PlayerCollection

            System.out.println("\nChanged Player 2:");
            System.out.println(player2.getDescription());
        }
    }
}