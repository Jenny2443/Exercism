package src.Java;
/*Instructions
Given a word, compute the Scrabble score for that word.

Letter Values
You'll need these:

Letter                           Value
A, E, I, O, U, L, N, R, S, T       1
D, G                               2
B, C, M, P                         3
F, H, V, W, Y                      4
K                                  5
J, X                               8
Q, Z                               10
Examples
"cabbage" should be scored as worth 14 points:

3 points for C
1 point for A, twice
3 points for B, twice
2 points for G
1 point for E
And to total:

3 + 2*1 + 2*3 + 2 + 1
= 3 + 2 + 6 + 3
= 5 + 9
= 14 */

import java.util.Locale;

class Scrabble {
    String word;

    public Scrabble(String word) {
        this.word = word.toLowerCase(); //Paso a minuscula para evitar errores o tener q comprobar tambn con mayusc
    }

    //Funcion principal de calculo de puntos usando func aux
    int getScore() {
        int score = 0;
        for (int i = 0; i < word.length(); i++) {
            score += scores(word.charAt(i));
        }
        return score;
    }

    //Scores segun distintos casos
    public int scores(char c) {
        int score = 0;
        switch (c) {
            case 'a','e', 'i', 'o', 'u', 'l', 'n', 'r', 's', 't':
                return 1;
            case 'd', 'g':
                return 2;
            case 'b', 'c', 'm', 'p':
                return 3;
            case 'f', 'h', 'v', 'w', 'y':
                return 4;
            case 'k':
                return 5;
            case 'j', 'x':
                return 8;
            case 'q', 'z':
                return 10;
            default: return 0;
        }
    }

    public static void main(String[] args) {
        //TEST
        Scrabble s = new Scrabble("cabbage");
        System.out.println(s.getScore()); //14

        Scrabble s1 = new Scrabble("word");
        System.out.println(s1.getScore()); //8
    }
}