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

class Scrabble {
    String word;

    Scrabble(String word) {
        this.word = word.toLowerCase();
    }

    int getScore() {
        int score = 0;
        for (int i = 0; i < word.length(); i++) {
            score += scores(word.charAt(i));
        }
        return score;
    }

    public int scores(char c) {
        int score = 0;
        switch (c) {
            case 'a', 'e', 'i', 'o', 'u', 'l', 'n', 'r', 's', 't':
                score = 1;
            case 'd', 'g':
                score = 2;
            case 'b', 'c', 'm', 'p':
                score = 3;
            case 'f', 'h', 'v', 'w', 'y':
                score = 4;
            case 'k':
                score = 5;
            case 'j', 'x':
                score = 8;
            case 'q', 'z':
                score = 10;
        }
        return score;
    }

    public static void main(String[] args) {
        Scrabble s = new Scrabble("a");
        System.out.println(s.getScore());
    }
}