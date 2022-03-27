import java.util.Scanner;

public class LogLevels {

    //trim elimina los espacio que haya delante del string
    //indexOf para empezar desde alli y quitarme lo de alante
    
    public static String message(String logLine) {
        String res = "";
        int indice = logLine.indexOf(':');
        for(int i = indice+1; i < logLine.length();i++){
            res = res + logLine.charAt(i);
        }
        return res.trim();
    }

    //toLoweCase para que este en minuscula

    public static String logLevel(String logLine) {
        String s = "";
        int indice1 = logLine.indexOf('[');
        int indice2 = logLine.indexOf(']');
        for(int i = indice1+1; i < indice2;i++){
            s = s + logLine.charAt(i);
        }
        return s.toLowerCase();
    }

    public static String reformat(String logLine) {
       String s;
        s = message(logLine) + " (" + logLevel(logLine) + ")";
        return s;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Dame la frase");
        String frase = scan.next();
        System.out.println(frase);
        System.out.println(message(frase));
    }
}
