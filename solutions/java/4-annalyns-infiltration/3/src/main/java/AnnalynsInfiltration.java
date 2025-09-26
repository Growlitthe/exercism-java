class AnnalynsInfiltration {
    public static boolean canFastAttack(boolean knightIsAwake) {
        //şovalye uyuyorsa hızlı bir saldırı yapabilir uyumuyorsa yapamaz başarısız olur.
        boolean answer = true;
        if(knightIsAwake){
            answer = false;
        }
        return answer;
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        //gruptan en az 1i uyanık olmalı
        boolean answer = false;
        if(knightIsAwake || archerIsAwake){
            answer = true;
        }
        else if(!knightIsAwake && !archerIsAwake && prisonerIsAwake){
            answer = true;
        }
        
        return answer;
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        boolean answer = true;
        if(!archerIsAwake && prisonerIsAwake){
            answer = true;
        }
        else answer = false;

        return answer;
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
        boolean answer = false;
        if(!archerIsAwake){
            if(!archerIsAwake && prisonerIsAwake && petDogIsPresent){
                return true;
            }
        }
        if(!knightIsAwake && !archerIsAwake && !prisonerIsAwake && !petDogIsPresent){
            answer = false;
        }
        else if(knightIsAwake && petDogIsPresent){
            if(!archerIsAwake && !prisonerIsAwake){
                answer = true;
            }
        }
        else if(!knightIsAwake && !archerIsAwake){
            answer = true;
        }

        return answer;
    }
}
