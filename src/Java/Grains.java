package src.Java;

import java.math.BigInteger;

/*
* Instructions
Calculate the number of grains of wheat on a chessboard given that the number on each square doubles.

There once was a wise servant who saved the life of a prince. The king promised to pay whatever the servant could dream up. Knowing that the king loved chess, the servant told the king he would like to have grains of wheat.
* One grain on the first square of a chess board, with the number of grains doubling on each successive square.

There are 64 squares on a chessboard (where square 1 has one grain, square 2 has two grains, and so on).

Write code that shows:

how many grains were on a given square, and
the total number of grains on the chessboard
* */

//Uso de clase BigInteger para numeros grandes
public class Grains {
    static BigInteger grainsOnSquare(final int square) throws IllegalArgumentException {
        if(square < 1 || square > 64){ //Tiene q estar en el rango del board
            throw new IllegalArgumentException("square must be between 1 and 64");
        }
        return BigInteger.valueOf(2).pow(square - 1); //valueof para tenerlo en forma numerica y pow (elevado)
    }

    static BigInteger grainsOnBoard() {
        return BigInteger.valueOf(2).pow(64).subtract(BigInteger.ONE);
        //2 ^64 -1
    }

    public static int grains(){
        int res = 0;
        for (int i = 1; i <= 64; i++) {
            res += Math.pow(2,i);
        }
        return res;
    }

    public static void main(String[] args) throws Exception {
        System.out.println(grainsOnBoard());
        System.out.println(grainsOnSquare(2));
    }
}
