package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        //      if (score < 5000 && score >1000 ) {
        //          System.out.println("Your score was less than 5000 but greater than 1000");
        //      } else if (score < 1000) {
        //          System.out.println("Your score is less than 1000");
        //      } else {
        //          System.out.println("Got here");

        //      }
        // write your code here
        if (gameOver == true) {
            int finalscore = score + (levelCompleted * bonus);
            finalscore += 1000;
            System.out.println("Your final score was " + finalscore);
        }

//        boolean secondgameOver = true;
//        int secondscore = 10000;
//        int secondLevelCompleted = 8;
//        int secondBonusSet = 200;
//        if (secondgameOver) {
//            int secondfinalscore = secondscore + (secondLevelCompleted * secondBonusSet);
//           System.out.println("Your second final score was " + secondfinalscore);
//        }
        score = 10000;
        levelCompleted = 8;
        bonus = 200;
        if (gameOver == true) {
            int finalscore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalscore);
        }
    }
}
