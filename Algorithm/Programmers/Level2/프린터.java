import java.util.*;

// 우선순위 큐를 사용해서 현재 문서가 출력될수있을지 뒤로 넘어갈지 체크한다.

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder()); // 우선순위큐 내림차순
        
        for(int i=0; i<priorities.length; i++) {
            q.offer(priorities[i]);
        }
        
        while (!q.isEmpty()) {
            for (int i = 0; i < priorities.length; i++) {
                if (priorities[i] == q.peek()) { // 인쇄될 수 있는 문서다
                    System.out.println(q);
                    if (location == i) { // 인쇄될 수 있는 문서고 원하는 문서면 인쇄수 리턴해준다
                        answer++;
                        return answer;
                    }
                    answer++; // 인쇄수 증가
                    q.poll(); // 인쇄시켰으니까 큐에서 제거
                }
            }
        }
        
        return answer;
    }
}
