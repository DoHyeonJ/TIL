import java.util.*;

class Solution {
    public int romanToInt(String s) {
        int answer = 0;
        Map<Character, Integer> roman = new HashMap<Character, Integer>();

        roman.put('I',1);
        roman.put('V',5);
        roman.put('X',10);
        roman.put('L',50);
        roman.put('C',100);
        roman.put('D',500);
        roman.put('M',1000);
        
        for(int i=0; i<s.length(); i++) {
            int pre = roman.get(s.charAt(i));
            
            // 마지막 인덱스까지 도달했다면, 현재값 더해주고 return 한다
            if(i == s.length()-1) {
                answer += pre;
                return answer;
            }
                
            int nxt = roman.get(s.charAt(i+1));
            // 앞의수가 더 작을경우 빼줘야한다
            if(pre < nxt) {
                answer += nxt - pre;
                i++; // 두개의 문자를 모두 검사했으니 인덱스 한칸 점프
            } else {
                answer += pre;
            }
        }

        return answer;
    }
}
