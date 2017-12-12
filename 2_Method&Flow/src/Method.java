public class Method {
    public static void main(String[] args) {
        int score, level, bonus;
        boolean gameOver;
        String name;

        gameOver = true;
        score = 800;
        level = 5;
        bonus = 100;
        int result = score(gameOver,score, level,bonus);
        System.out.println("Your final score: " + result);

        // overload a method by defining them with same name
        // but different parameters
        name = "Adam";
        score = 300;
        level = level(score);
        evaluate(name,level);

        score = 600;
        evaluate(score);

        name = "Bill";
        evaluate(name);
        evaluate();
    }

    public static int score(boolean gameOver, int score, int level, int bonus) {
        if(gameOver) {
            int finalScore = score + level * bonus;
            finalScore += 1000;
            return finalScore;
        }
        else {
            return -1;
        }
    }

    public static void evaluate(String name, int level) {
        System.out.println(name + " is currently in level " + level + " among all players.");
    }

    public static void evaluate(int level) {
        System.out.println("The player under evaluate is in level " + level + " among all players.");
    }

    public static void evaluate(String name) {
        System.out.println("Provide the score to evaluate the player " + name + ".");
    }

    public static void evaluate() {
        System.out.println("Evaluating program is now ready to go!");
    }

    public static int level(int score) {
        if(score>1000){
            return 1;
        } else if(score > 500){
            return 2;
        } else if(score > 100){
            return 3;
        } else {
            return 4;
        }
    }
}
