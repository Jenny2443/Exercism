package src.Java;

public class Darts {
    double x;
    double y;

    Darts(double x, double y){
        this.x = x;
        this.y = y;
    }

    double radio(){ //Calculo del radio para posterior uso en comparacion
        return Math.sqrt(x*x+y*y);
    }


     int score(){
         int score = 0;
        if(radio() >= 0 && radio() <=1){
            score = 10;
        }else if(radio() > 10){
            score = 0;
        }else if(radio()>5 && radio()<=10){
            score = 1;
        }else if(radio()>1 && radio()<=5){
            score = 5;
        }
        return score;
    }
}
