import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] solution(int[] array, int[][] commands) {

        int[] answer = new int[commands.length]; // commands 의 수 만큼 return 해줄 배열 선언
        ArrayList<Integer> list = new ArrayList<Integer>(); // 정렬 편하게 하기위한 list 생성

        for (int i=0; i<commands.length; i++) { // commands 의  수만큼 반복
            for (int j = commands[i][0]-1; j < commands[i][1]; j++) {
                    list.add(array[j]); // commands 의 첫번째 인덱스값 ~ 두번째 인덱스값 까지의 array 담기
            }
            Collections.sort(list); // 담아져있는 list 정렬하기
            answer[i] = list.get(commands[i][2]-1); // list 의 값 중 commands 의 세번째 인덱스값에 위치한 값 넣기
            list.clear(); // for 문을 또 돌아서 값을 넣어야 하기때문에 clear 해주기
        }
        return answer;
    }
}
