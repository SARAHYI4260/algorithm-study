class AnnalynsInfiltration {
    public static boolean canFastAttack(boolean knightIsAwake) {
        return !knightIsAwake;
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        boolean[] spy = { knightIsAwake, archerIsAwake, prisonerIsAwake };
        for(boolean awake : spy) {
            if(awake) {
                return true;
            }
        }
        return false;
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        if(prisonerIsAwake) {
            return !archerIsAwake;
        }else {
            return false;
        }
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
        if(petDogIsPresent) {
            if(!archerIsAwake) {
                return true;
            }else {
                return false;
            }
        }else {
            if(!knightIsAwake && !archerIsAwake && prisonerIsAwake) {
                return true;
            }else {
                return false;
            }
        }
    }
}
