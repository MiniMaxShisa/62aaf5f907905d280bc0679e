package ua.ithillel.homework_5;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Game {

    public static void main(String[] args) {
        playGame();
    }

    private static void playGame() {
        Scanner scanner = new Scanner(System.in);

        String[] words = {"apple", "orange", "lemon", "banana", "apricot",
                "avocado", "broccoli", "carrot", "cherry", "garlic",
                "grape", "melon", "leak", "kiwi", "mango",
                "mushroom", "nut", "olive", "pea", "peanut",
                "pear", "pepper", "pineapple", "pumpkin", "potato"};

        String selectedWord = selectWord(words);

        System.out.println("Guess a word:");
        System.out.println(Arrays.toString(words));

        String playerWord;
        StringBuilder correctLetters;

        do {
            System.out.println("Your word?");
            playerWord = scanner.nextLine();

            if (Objects.equals(playerWord, selectedWord)) {
                System.out.println("Yep!");
            } else {
                correctLetters = new StringBuilder("###############");

                for (int i = 0; i < Math.min(selectedWord.length(), playerWord.length()); i++){
                    if (playerWord.charAt(i) == selectedWord.charAt(i)) {
                        correctLetters.setCharAt(i, playerWord.charAt(i));
                    }
                }
                System.out.println("Wrong! Correct letters:");
                System.out.println(correctLetters);
            }
        } while (!Objects.equals(playerWord, selectedWord));
    }

    private static String selectWord(String[] words) {
        return words[(int)Math.floor(Math.random()*words.length)];
    }
}
