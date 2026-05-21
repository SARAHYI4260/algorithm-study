class AnnalynsInfiltration {
    public static boolean canFastAttack(boolean knightIsAwake) {
        return !knightIsAwake;
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        // '셋 중 하나라도 깨어있다면'의 논리합(||) 연산 조건 자체를 바로 반환합니다.
        return knightIsAwake || archerIsAwake || prisonerIsAwake;
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        // '죄수는 깨어있고(&&)' '아처는 자고 있다(!)'라는 조건 식을 바로 반환합니다.
        return prisonerIsAwake && !archerIsAwake;
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
        // 1. 강아지가 있고 아처가 자고 있는 경우
        boolean conditionWithDog = petDogIsPresent && !archerIsAwake;

        // 2. 강아지가 없고, 기사/아처는 자고 죄수는 깨어있는 경우
        boolean conditionWithoutDog = !petDogIsPresent && (!knightIsAwake && !archerIsAwake && prisonerIsAwake);

        // 두 시나리오 중 하나만 만족해도 구출 가능하므로 논리합(||)으로 묶어 반환합니다.
        return conditionWithDog || conditionWithoutDog;
    }
}