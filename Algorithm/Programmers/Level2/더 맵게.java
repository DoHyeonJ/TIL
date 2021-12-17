import java.util.*;
// 우선순위 큐로 작은 애부터 꺼내서 해본다.
// k를 넘어가는지 체크해준다.
class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();// 오름차순
        // PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());// 내림차순
            
        //큐에 값 담는다
        for(int num : scoville) {
            pq.offer(num);
        }
        
        // 스코빌 지수보다 낮으면 계속 돌린다
        while(pq.size() > 1) { // 큐에 한개의 값만 있으면 아래의 작업 수행 못하기떄문에 반복문 돌필요없다
            // 스코빌 지수 규칙에 맞춰서 값을 넣어주는데 poll을 사용해서 제거와 삽입을 동시에한다
            pq.offer((pq.poll() + (pq.poll() * 2)));
            answer++;
            if(pq.peek() >= K) {
                break;
            }
        }
        
        // 다 돌았는데 K보다 작으면 -1 리턴한다
        if(pq.peek() < K) {
            return -1;
        }
        
        return answer;
    }
}
