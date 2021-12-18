import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        
        Arrays.sort(phone_book); // 문자열을 사전순으로 정렬해준다
        
        for(int i=1; i<phone_book.length; i++) { // 앞의 문자열이랑 비교할거니까 i는 1부터
            if(phone_book[i].startsWith(phone_book[i-1])) { // 현재 문자열이 앞의 문자열로 시작되면 접두어인것이다
                return false;
            }
        }
        
        return answer;
    }
}
