class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int maxCount = 0;
        int mode = 0;
        
        int[] tempor = new int[1000];
        
        for(int i = 0; i < array.length; i++) {
            int num = array[i]; // 원본 배열에서 숫자 하나를 꺼낸다.
            tempor[num]++;      // 그 숫자의 방(tempor[3])에 가서 '나왔음!'이라고 1을 더한다.
}
        for (int i = 0; i < tempor.length; i++) {
            if(tempor[i]>maxCount){
                maxCount = tempor[i];
                answer = i;
            }else if (tempor[i] == maxCount) {
                answer = -1;
            }
        }
        return answer;
    }
}