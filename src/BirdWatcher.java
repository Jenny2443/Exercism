class BirdWatcher {
    private static int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public  int[] getLastWeek() {
        return birdsPerDay;
    }

    public static int getToday() {
        if(birdsPerDay.length == 0){
            return 0;
        }else{
            return birdsPerDay[birdsPerDay.length-1];
        }
    }

    public static void incrementTodaysCount() { //2 condicines por si la longitud es 0
        if(birdsPerDay.length == 0){
            birdsPerDay[birdsPerDay.length] = 1;
        }else{
            birdsPerDay[birdsPerDay.length-1] = getToday() + 1;
        }
    
    }

    public boolean hasDayWithoutBirds() {
        boolean hay = false;
        int i = 0;
        while(i < birdsPerDay.length && !hay){
            if(birdsPerDay[i] == 0){
                hay = true;
            }else
            i++;
        }
        return hay;
    }

    public int getCountForFirstDays(int numberOfDays) {  //2 condiciones para q en caso de q los dias sean mayores q la longitud o al reves siga sumando
        int sum = 0;
        for(int i = 0; i < numberOfDays && i < birdsPerDay.length;i++){
            sum = sum + birdsPerDay[i];
        }
        return sum;
    }

    public int getBusyDays() {
        int days = 0;
        for(int i = 0; i<birdsPerDay.length;i++){
            if(birdsPerDay[i]>=5){
                days++;
            }
        }
        return days;
    }

    public static int getBusyDaysEach(){
        int diasOcupados = 0;
        for(int days:birdsPerDay){ //Itera por cada "dia" de birdsPerDay y comprobamos si el elemento es mayor q 5
            if(days >=5)            //Si es mayor o igual q 5 a la variable q qremos le sumamos 1
            diasOcupados++;
        }
        return diasOcupados;
    }

    public static void main(String[] args) {
        int[] pajaros = {1,5,5,7};
        BirdWatcher b1 = new BirdWatcher(pajaros);
        System.out.println(b1.getBusyDaysEach());
    }
}
