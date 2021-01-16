class Solution {
    public long solution(int a, int b) {
        int answer = 0;

        if (a == b) {
            answer = a;
        }
        else if (a > b) {
            answer = ((a+b) * (a-b+1))/2;
        }
        else {
            answer = ((b+a) * (b-a+1))/2;
        }

        return answer;
    }
}
