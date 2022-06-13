package src.Java;

public class ReverseString {
    static String reverse(String inputString) {
        String s = "";
        for(int i = inputString.length()-1; i >= 0;i--){ //Itero el string pero al reves, para q se vaya añadiendo desde atras, lo q no se es por q se incluye el 0
            s = s + inputString.charAt(i);
        }
        
        return s;
    }

    public static void main(String[] args) {
        System.out.println(reverse("hello"));
    }
}
