package src.Java;

import java.util.Locale;

//Sin terminar (31-8-22)
/*Instructions
Create an implementation of the rotational cipher, also sometimes called the Caesar cipher.

The Caesar cipher is a simple shift cipher that relies on transposing all the letters in the alphabet using an integer key between 0 and 26. Using a key of 0 or 26 will always yield the same output due to modular arithmetic. The letter is shifted for as many values as the value of the key.

The general notation for rotational ciphers is ROT + <key>. The most commonly used rotational cipher is ROT13.

A ROT13 on the Latin alphabet would be as follows:

Plain:  abcdefghijklmnopqrstuvwxyz
Cipher: nopqrstuvwxyzabcdefghijklm
It is stronger than the Atbash cipher because it has 27 possible keys, and 25 usable keys.

Ciphertext is written out in the same formatting as the input including spaces and punctuation.

Examples
ROT5 omg gives trl
ROT0 c gives c
ROT26 Cool gives Cool
ROT13 The quick brown fox jumps over the lazy dog. gives Gur dhvpx oebja sbk whzcf bire gur ynml qbt.
ROT13 Gur dhvpx oebja sbk whzcf bire gur ynml qbt. gives The quick brown fox jumps over the lazy dog.*/
public class RotationalCipher {
     int shiftKey;
     String[] ALPHABET = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","ñ","o","p","q","r","s","t","u","v","w","x","y","z"};

    public RotationalCipher(int shiftKey) {
        this.shiftKey = shiftKey;
    }


    public boolean isPunctuation(char c){
        return c == '?' || c == '¿' || c == '.' || c == '!' || c == '¡' || c == ',' || c == '\'';
    }


    /*String rotate2(String data){
        StringBuilder result = new StringBuilder(); //Mejor para manipular String
        //data = data.toLowerCase(); //Paso a minusc para evitar problemas con mayusc
        for (char character : data.toCharArray()) { //Paso el string data a tipo array para iterar
            if (character != ' ' && !Character.isDigit(character) && !isPunctuation(character) && !Character.isUpperCase(character)) {
                int originalAlphabetPosition = character - 'a'; //Saber posicion
                int newAlphabetPosition = (originalAlphabetPosition + shiftKey) % 26; //Posicion tras sumar -> %26 mod 26 para rotar
                char newCharacter = (char) ('a' + newAlphabetPosition); //Char correspondiente a al nueva posicion
                result.append(newCharacter);
            } else if(Character.isUpperCase(character)){
                int originalPosition = character - 'A';
                int newPosition = (originalPosition + shiftKey) % 26;
                char newChar = (char) ('A' + newPosition);
                result.append(newChar);
            }else{
                result.append(character);
            }
        }
        return result.toString(); //Hay q pasarlo a string
    }*/


    String rotate(String data){
        StringBuilder result = new StringBuilder(); //Uso de StringBuilder, más comodo para manipulacion de Strings
        for (char character: data.toCharArray()) { //Paso String a array para iterar
            if(Character.isUpperCase(character)){ //Si es mayusc, para mantenerlo mayusc
                int originalPosition = character - 'A'; //Busca de la pos original
                int newPosition = (originalPosition + shiftKey) % 26; //Calc de nueva pos
                char newChar = (char) ('A' + newPosition); //Asignacion segun posicion
                result.append(newChar); //Adicion
            }else if(Character.isDigit(character) || isPunctuation(character)){ //EN caso de ser puntuacion o nº se mantiene
                result.append(character);
            }else if(character != ' '){ //Si letra minusc
                int originalAlphabetPosition = character - 'a'; //Saber posicion
                int newAlphabetPosition = (originalAlphabetPosition + shiftKey) % 26; //Posicion tras sumar -> %26 mod 26 para rotar
                char newCharacter = (char) ('a' + newAlphabetPosition); //Char correspondiente a al nueva posicion
                result.append(newCharacter);
            }else{ //Cualquier otro caso
                result.append(character);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        RotationalCipher r = new RotationalCipher(2);
        //System.out.println(r.rotate2("Hola"));

        RotationalCipher r1 = new RotationalCipher(5);
        //System.out.println(r1.rotate("OMG"));

        RotationalCipher r2 = new RotationalCipher(4);
        //System.out.println(r2.rotate("Testing 1 2 3 testing"));

        RotationalCipher r3 = new RotationalCipher(13);
        System.out.println(r3.rotate("The quick brown fox jumps over the lazy dog."));
    }


}


