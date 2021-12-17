class Solution {
    public String solution(String s) { // A : 65, a : 97
        String answer = "";
        int cnt = 0;
        
        for(int i=0; i<s.length(); i++) {
            char tmp = s.charAt(i);
            if(tmp == ' ') { // 공백일경우
                answer += ' ';
                cnt = 0;
            }
            else { // 공백이 아닐경우
                if (cnt%2 == 0) { // 짝수일경우
                     answer += tmp > 96 ? (char)(tmp - 32) : tmp;
                    cnt++;
                }
                else { // 홀수일경우
                     answer += tmp < 96 ? (char)(tmp + 32) : tmp;
                    cnt++;
                }
            }
        }
        
        return answer;
    }
}
