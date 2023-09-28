package Project11;

import java.util.Arrays;

public class project11 {

    public static class BasketballTeam { // basketball class
        private String teamName;
        private int foundedYear;
        private double rating;

        public BasketballTeam(String teamName, int foundedYear, double rating) {
            this.teamName = teamName;
            this.foundedYear = foundedYear;
            this.rating = rating; //init svoistva
        }
        // get set
        public String getTeamName() {
            return teamName;
        }

        public void setTeamName(String teamName) {
            this.teamName = teamName;
        }

        public int getFoundedYear() {
            return foundedYear;
        }

        public void setFoundedYear(int foundedYear) {
            this.foundedYear = foundedYear;
        }

        public double getRating() {
            return rating;
        }

        public void setRating(double rating) {
            this.rating = rating;
        }

        public String getDescription() { //full description method
            return "Team Name: " + teamName + "\nFounded Year: " + foundedYear + "\nRating: " + rating;
        }

        public String getTitle() { //short description method
            return teamName + " (" + foundedYear + ")";
        }
    }

    public static class BasketballTeamCollection { //collection class
        private BasketballTeam[] teams;
        private int size;

        public BasketballTeamCollection() {
            this.teams = new BasketballTeam[10];
            this.size = 0; //set the size
        }

        public void addTeam(BasketballTeam team) {
            if (size == teams.length) {
                teams = Arrays.copyOf(teams, size + 1); //copyof to copy array
            }
            teams[size++] = team;
        }

        public void remove(int i) {
            if (i >= 0 && i < size) {
                BasketballTeam[] newTeams = new BasketballTeam[size];
                for (int j = 0, k = 0; j < size; j++) {
                    if (j == i);
                    newTeams[k++] = teams[j];
                }
                teams = newTeams;
                size--;
            }
        }

        public void printOne(int i) {
            if (i >= 0 && i < size) {
                System.out.println(teams[i].getDescription());
            }
        }

        public void printAll() {
            for (int i = 0; i < size; i++) {
                printOne(i);
                System.out.println("///////////////");
            }
        }

        public void printList() {
            for (int i = 0; i < size; i++) {
                System.out.println((i + 1) + ". " + teams[i].getTitle());
            }
        }

        public void sort() {
            for (int i = 0; i < size - 1; i++) {
                for (int j = 1; j < size - i - 1; j++) {
                    if (teams[j].getRating() < teams[j + 1].getRating()) {
                        BasketballTeam temp = teams[j];
                        teams[j] = teams[j + 1];
                        teams[j + 1] = temp;
                    }
                }
            }
        }

        public void search(String phrase) {
            for (int i = 0; i < size; i++) {
                if (teams[i].getTeamName().toLowerCase().contains(phrase.toLowerCase())) {
                    System.out.println("Index: " + i + ", " + teams[i].getTitle());
                }
            }
        }

        public void searchByYear(int year) {
            for (int i = 0; i < size; i++) {
                if (teams[i].getFoundedYear() == year) {
                    System.out.println("Index: " + i + ", " + teams[i].getTitle());
                    break;
                } else {
                    System.out.println("Invalid year.");
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        BasketballTeamCollection collection = new BasketballTeamCollection();
        collection.addTeam(new BasketballTeam("LA Lakers", 1947, 9.5));
        collection.addTeam(new BasketballTeam("Chicago Bulls", 1966, 9.0));
        collection.addTeam(new BasketballTeam("Golden State Warriors", 1946, 9.2));


        collection.sort();
        collection.printAll();
        System.out.println("_______________");
        collection.printList();
        System.out.println("_______________");
        collection.search("Ker");
        System.out.println("_______________");
        collection.search("ul");
        System.out.println("_______________");
        collection.searchByYear(1947);
        System.out.println("_______________");
        collection.searchByYear(1443);
        System.out.println("_______________");
        collection.remove(1);
        collection.printList();

    }
}