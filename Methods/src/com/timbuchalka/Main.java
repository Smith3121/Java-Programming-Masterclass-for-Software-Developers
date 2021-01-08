package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
	// write your code here

        boolean gameOver = true;


        calculateScore(true, 800, 5, 100);

        calculateScore(true, 10000, 8, 200);

    }
    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver == true) {
            int finalscore = score + (levelCompleted * bonus);
            finalscore += 2000;
            System.out.println("Your final score was " + finalscore);
        }

    }
}
