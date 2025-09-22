public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven(){
        return 40;
    }

    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int x){
        Lasagna lasagna = new Lasagna();
        return (lasagna.expectedMinutesInOven() - x);
    }

    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int x){
        return x*2;
    }

    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int x, int y){
        return (x*2 + y);
    }
}
