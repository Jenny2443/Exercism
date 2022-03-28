public class CarsAssemble {

    //Rates dadas por el enunciado
    public double rates(int speed){
        if(speed>=1 && speed <=4){
            return 1;
        }else if(speed >=5 && speed<=8){
            return 0.9;
        }else if(speed == 9){
            return 0.8;
            }else{
        return 0.77;
    }
    }
    //formula de producción
    public double productionRatePerHour(int speed) {
        return (speed * 221) * rates(speed);
    }
    
    public int workingItemsPerMinute(int speed) {
        return (int)(productionRatePerHour(speed)/60);
    }
}