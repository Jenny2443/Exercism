package src;

public class Squeaky2 {
    static String clean(String identifier) {
        StringBuilder res  = new StringBuilder(); // Creo un stringBuilder para guardar el resultado q sta al principio vacío
        StringBuilder toClean  = new StringBuilder(identifier); //Crea otro stringBuilder con el string que le pasamos
        char c = ' ';
        for(int i = 0; i < toClean.toString().length(); i++) {
            c = toClean.toString().charAt(i); // Guardo el char que estoy analizando proveniente del StringBuilder toClean q tiene el string inicial
            // Task 1
            if (c == ' ') {
                res.append('_');
                // Task 2
            } else if (Character.isISOControl(c)) {
                res.append("CTRL");
                // Task 3
            } else if (c == '-') {
                res.append(Character.toUpperCase(toClean.toString().charAt(i + 1))); // Convierto el char que estoy analizando a mayuscula y lo guardo en el stringBuilder res
                toClean.replace(i, i + 1, "");
                // Task 4
            } else if (Character.isLowerCase(c) && String.valueOf(c).matches("\\p{InGreek}")) { // Si el char es minuscula y es una letra griega, no lo guardo
                toClean.replace(i, i, ""); // Si el char es minuscula y es una letra griega, lo elimino del stringBuilder toClean
            } else if (Character.isLetter(c)) {
                res.append(c);
            }
        }
        return res.toString();
    }
}

