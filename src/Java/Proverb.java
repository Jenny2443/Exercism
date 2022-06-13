package src.Java;

public class Proverb {
    String[] words;
        Proverb(String[] words) { //Constructor
            this.words = words;
        }

        String recite() {
            StringBuilder sb = new StringBuilder(); //Strngbuilder vacio porq el resultado va a ser un String q va a ser modificado
            for (int i = 0; i < words.length; i++) {
                if(i == words.length - 1){ //Si estoy en el ultimo elemento del array tengo q coger la frase con el elemento 0
                    sb.append("And all for the want of a " + words[0] + ".");
                } else { //Si no estoy en el ultimo elemento del array tengo q coger la frase con el elemento i + 1
                    sb.append("For want of a " + words[i] + " the " + words[i + 1] + " was lost.\n");
                }

            }
            return sb.toString(); //Devuelvo el stringbuilder como string
        }

    public static void main(String[] args) {
        Proverb proverb = new Proverb(new String[]{"nail", "shoe", "horse"});
        System.out.println(proverb.recite());
    }
    }

