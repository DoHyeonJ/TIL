class Solution {
    public String solution(String s, int n) { // A = 65~90 a = 97~122
        String answer = "";
        
        for (int i=0; i<s.length(); i++) {
                if (s.charAt(i) == ' ') { // 공백일때
                    answer += ' ';
                } else { // 공백이 아닐때
                    if ( s.charAt(i) <= 90 ) { // 대문자일때
                        int tmp = s.charAt(i) + n;
                        if ( tmp > 90 ) {
                            tmp = (tmp - 90) + 64;
                        } 
                        answer += (char)tmp;
                    } else { // 소문자일때
                        int tmp = s.charAt(i) + n;
                        if ( tmp > 122 ) {
                            tmp = (tmp - 122) + 96; 
                        } 
                        answer += (char)tmp;
                    }   
                }
            }
        
        return answer;   
    }
}
