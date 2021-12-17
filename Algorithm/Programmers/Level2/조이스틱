import java.util.*;
// 초기값은 전부다 A로 설정되어있다. 
// 앞으로 이동할건지 뒤로 이동할건지 판단해야한다.
// 위로 조작할지 밑으로 조작할지 판단한다.
// 아스키 A : 65 ~ Z : 90
class Solution {
    public int solution(String name) {
        int answer = 0;
        
        for(int i=0; i<name.length(); i++) {
            if(name.charAt(i) > 78) { // 78보다 크면 밑으로 조작하는게 빠르다
                answer += 91 - name.charAt(i); // Z+1에서부터 현재위치까지를 빼주면 값이 나온다
            } else { // 78보다 작으면 위로 조작하는게 빠르다 
                answer += name.charAt(i) - 65; // 현재위치에서부터 A를 빼주면 값이 나온다
            }
        }
        
        int moveCnt = 0;
        int aCnt = 0;
        boolean reverse = false; // 역순으로 돌았는지 판단
        for(int i=0; i<name.length(); i++) {
            if(aCnt > 0 && name.charAt(i) != 'A') { // A를 만난적이있고 지금은 A가 아닐때
                if(aCnt >= moveCnt) { // A가 앞의 알파벳 길이보다 길때 역순으로 돌아야 이득이다
                    answer += (moveCnt-1) + (moveCnt-1) + name.length() - i; // 역순으로 돌았을경우의 이동수
                    reverse = true;
                    break; // 역순으로 돈경우를 체크했으니 중단
                }
            }
            
            if(i > 0 && name.charAt(i) == 'A') { // A를 카운트한다
                aCnt++; 
            } else { // A가 아니면 정방향으로 카운트한다
                moveCnt++;
            }
        }
        
        if(!reverse) { // 정방향으로 돌았을경우 이동수
            answer += aCnt < moveCnt ? aCnt : 0; // A를 그냥 밟고 지나갔을수있다. 그걸 더해주자
            answer += moveCnt > 0 ? moveCnt-1 : 0; // 첫인덱스는 시작하는지점이니까 -1을 해줘야한다
        }
        
        return answer;
    }
}
