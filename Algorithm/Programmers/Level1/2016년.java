class Solution {
    public String solution(int a, int b) {
        int[] month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int day = 0;
        String[] week ={"FRI","SAT","SUN","MON","TUE","WED","THU"};
        String answer = "";

        for (int i=0; i<a-1; i++) {
            day += month[i];
        }

        answer = week[(day + b - 1) % 7];

        return answer;
    }
}
