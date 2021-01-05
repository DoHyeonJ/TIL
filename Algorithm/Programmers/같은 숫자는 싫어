import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int listCnt = 0; // list 가 담겨질 index 카운트
        ArrayList<Integer> list = new ArrayList<>(); // 비교할 값들을 담을 list
        list.add(arr[0]); // 초기에 arr 첫번째 인덱스의 값 넣어주기

        for(int i=1; i<arr.length; i++) { // for 문 사용하여 list 에 이미 들어있는 값과 현재 arr 값 비교
            if (list.get(listCnt) == arr[i]) {
                arr[i] = -1; // 중복되는 값일 경우 arr 배열값 -1로 바꿔주기
            }
            else if (arr[i] != -1) { // arr 값이 -1이 아니고 중복되는 숫자가 아닐경우 list 에 담기
                list.add(arr[i]);
                listCnt++; // list 에 값을 담아줬으니까 카운트
            }
        }

        int[] answer = new int[list.size()]; // answer 배열의 길이는 list의 사이즈

        for (int i=0; i<answer.length; i++) { //for 문 사용하여 list에 있는 값 answer 배열에 담기
            answer[i] = list.get(i);
        }

        return answer;
    }
}
