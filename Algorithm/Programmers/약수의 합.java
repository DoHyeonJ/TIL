class Solution {
    public int solution(int n) {
        int answer = 0;
       
        for (int i=1; i<=n; i++) { // 입력값과 i를 나눠서 0이 나오면 약수 이므로 answer에 더하기
            if(n%i == 0) {
                answer += i;
            }
        }
        
        return answer;
    }
}
