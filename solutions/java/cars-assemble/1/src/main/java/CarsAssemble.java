public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        double answer = 0;
        if(speed >= 1 && speed <= 4){
            answer = 221 * speed;
        }
        else if(speed >= 5 && speed <= 8){
            answer = (221 * speed) * 0.90;
        }
        else if(speed == 9){
            answer = (221 * speed) * 0.80;
        }
        else if(speed == 10){
            answer = (221 * speed) * 0.77;
        }

        return answer;
    }

    public int workingItemsPerMinute(int speed) {
        double answer = 0;
        if(speed >= 1 && speed <= 4){
            answer = 221 * speed;
        }
        else if(speed >= 5 && speed <= 8){
            answer = (221 * speed) * 0.90;
        }
        else if(speed == 9){
            answer = (221 * speed) * 0.80;
        }
        else if(speed == 10){
            answer = (221 * speed) * 0.77;
        }
        answer = answer / 60.0;
        return (int) answer;
    }
}
