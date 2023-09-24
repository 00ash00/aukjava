package Project9;

public class project9_part2 {

    public static class Hobby {
        private String name;
        private int age;
        private String team;
        private int num;
        private int scores;

        public Hobby(String name, int age, String team, int num, int scores) {
            this.name = name;
            this.age = age;
            this.team = team;
            this.num = num;
            this.scores = scores;
        }

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

        public int getNum() {
            return num;
        }

        public void setNum(int num) {
            this.num = num;
        }

        public int getScores() {
            return scores;
        }

        public void setScores(int scores) {
            this.scores = scores;
        }

        // Method to get the full description of the hobby
        public String getFullDescription() {
            return "Player: " + name + "\nAge: " + age + "\nTeam: " + team + "\nNumber in team: " + num
                    + "\nScores: " + scores;
        }
    }

    public static void main(String[] args) {
        System.out.println("Hobby: Basketball");


        Hobby hobby1 = new Hobby("Kobe Bryant", 41, "Los Angeles Lakers", 24, 33643);
        Hobby hobby2 = new Hobby("LeBron James", 38, "Los Angeles Lakers", 23, 38652);

        // Output full descriptions of the hobbies
        System.out.println("Favourite player 1:");
        System.out.println(hobby1.getFullDescription());

        System.out.println("\nFavourite player 2:");
        System.out.println(hobby2.getFullDescription());
    }
}