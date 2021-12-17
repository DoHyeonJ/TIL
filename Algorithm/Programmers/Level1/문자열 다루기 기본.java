class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        
        if(s.length() != 4 && s.length() != 6) { // 길이가 4도 아니고 6도 아닌경우 false
            answer = false;
            return answer;
        }
        
        for(int i=0; i<s.length(); i++) { 
            if(Character.isDigit(s.charAt(i)) == false) { //문자열에 숫자가 아닌문자 포함되어있는지 확인
                answer = false;
            }
        }
        
        return answer;
    }
}
