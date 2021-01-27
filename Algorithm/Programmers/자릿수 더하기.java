import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        int num = n; // num라는 변수를 생성해 n값으로 초기화 해준다.
        
        while(num > 0) {
            answer += num%10; // num를 10으로 나눈 나머지값을 answer에 더해준다.
            num /= 10; // num를 10씩 나눠서 num으로 저장한다.
        }
        
        return answer;
    }
}
