package src;

class IsogramChecker {
    public static boolean isIsogram2(String p){
        p = p.toLowerCase(); // Paso a minuscula por si la frase tiene alguna mayuscula q luego no va a reconoceer con minusc
        boolean es = true; //Cortocircuito para evitar el bucle
        for (int i = 0; (i < p.length()) && es; i++) {
            if(p.charAt(i) == ' ' || p.charAt(i) == '-'){ //Si es un espacio o un guion, no se cuenta y paso al siguiente
                i++;
            }else{ //Si no es un espacio o un guion, se cuenta y voy al bucle para ver si hay alguno igual
                for (int j = i+1; (j < p.length()) && es; j++) {
                    if(p.charAt(i) == p.charAt(j)){ //Si el char de i cogiendo el primero y si se acaba el for de j entonces se actualiza es igual al de j, no es isograma
                        es = false;
                    }
                }
            }
        }
        return es;
    }

    public static void main(String[] args) {
        System.out.println(isIsogram2("paflst"));
        System.out.println(isIsogram2("Hola s Jeny"));
    }

}
