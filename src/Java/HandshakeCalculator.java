package src.Java;
 //Funciona pero en exercism no compila
import java.util.*;

import static java.util.Collections.*;

/*
* Instructions
There are 10 types of people in the world: Those who understand binary, and those who don't.

You and your fellow cohort of those in the "know" when it comes to binary decide to come up with a secret "handshake".

1 = wink
10 = double blink
100 = close your eyes
1000 = jump


10000 = Reverse the order of the operations in the secret handshake.
Given a decimal number, convert it to the appropriate sequence of events for a secret handshake.

Here's a couple of examples:

Given the input 3, the function would return the array ["wink", "double blink"] because 3 is 11 in binary.

Given the input 19, the function would return the array ["double blink", "wink"] because 19 is 10011 in binary.  -> 10.000 + 10 + 1
* Notice that the addition of 16 (10000 in binary) has caused the array to be reversed.
* */
public class HandshakeCalculator {
    enum Signal {
        WINK,
        DOUBLE_BLINK,
        CLOSE_YOUR_EYES,
        JUMP
    }

    public static List<Signal> calculateHandshake(int number){
        List<Signal> signals = new LinkedList<>();
        if((number & 1) == 1){
            signals.add(Signal.WINK);
        }
        if((number & 2) == 2){
            signals.add(Signal.DOUBLE_BLINK);
        }
        if((number & 4) == 4){
            signals.add(Signal.CLOSE_YOUR_EYES);
        }
        if((number & 8) == 8){
            signals.add(Signal.JUMP);
        }
        if((number & 16) == 16){
            reverse(signals);
        }
        return signals;
    }

    public static void main(String[] args) {
        System.out.println(calculateHandshake(3));
        System.out.println(calculateHandshake(19));
        System.out.println(calculateHandshake(20));
    }
}
