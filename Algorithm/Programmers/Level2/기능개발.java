import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> q = new LinkedList<>();
        ArrayList<Integer> result = new ArrayList<>();
        int dayCnt = 0; // 작업 일수
        int proCnt = 0; // 배포중인 기능 idx
        
        for(int i=0; i<progresses.length; i++) {
            q.offer(progresses[i]); // 큐에 작업진도 담기
        }
        
        int answerCnt = 0;
        while(!q.isEmpty()) {
            if((dayCnt * speeds[proCnt]) + q.peek() < 100) { // 아직 배포하지 못할때
                dayCnt++; // 일수 증가
            } else { // 배포가 가능할때
                int cnt = 0;
                while(proCnt < speeds.length) { // 프로그램 길이 넘어가면 반복문 못돈다
                    if((dayCnt * speeds[proCnt]) + q.peek() >= 100) { // 그뒤에 배포가능한게 또 있는지 확인
                        q.poll(); // 배포완료한것 꺼내줌
                        proCnt++; // 다음프로그램 속도로 인덱스 넘김
                        cnt++;
                    } else {
                        break;
                    }
                }
                result.add(cnt); // 증가시켜준 cnt값 리스트에 담아줌
            }
        }
        
        int[] answer = new int[result.size()];
        for(int i=0; i<result.size(); i++) {
            answer[i] = result.get(i);
        }
        
        return answer;
    }
}
