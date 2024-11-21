package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Gamer[] boyGamers = new Gamer[5];
        boyGamers[0] = new Gamer("Dack", true);
        boyGamers[1] = new Gamer("Dick", true);
        boyGamers[2] = new Gamer("Duck", false);
        boyGamers[3] = new Gamer("Pack", false);
        boyGamers[4] = new Gamer("Mack", false);


        System.out.println(Arrays.toString(playGamers(boyGamers)));
    }

    public static Gamer[] playGamers(Gamer[] boyGamers) {
        int inGameLength = 0;
        for (int i = 0; i < boyGamers.length - 1; i++) {
            if (boyGamers[i].isActive() == true) {
            }
            inGameLength++;
        }
        Gamer[] inGame = new Gamer[inGameLength];
        inGameLength = 0;
        for (int i = 0; i < boyGamers.length - 1; i++) {
            if (boyGamers[i].isActive() == true) {
                inGame[inGameLength++] = boyGamers[i];
            }
        }
        return boyGamers;
    }

}

