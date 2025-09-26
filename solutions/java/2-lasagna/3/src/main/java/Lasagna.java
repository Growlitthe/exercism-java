public class Lasagna {
    public int expectedMinutesInOven(){
        return 40;
    }

    public int remainingMinutesInOven(int x){
        Lasagna lasagna = new Lasagna();
        return (lasagna.expectedMinutesInOven() - x);
    }

    public int preparationTimeInMinutes(int x){
        return x*2;
    }

    public int totalTimeInMinutes(int x, int y){
        Lasagna lasagna = new Lasagna();
        return (lasagna.preparationTimeInMinutes(x) + y);
    }
}
