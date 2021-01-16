import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];

        ArrayList<String> list = new ArrayList<>(); // 정렬을 편하게 하기 위해 list 선언

        for (int i=0; i<strings.length; i++) { // 문자열에서 n번째 값을 함께 list에 담는다
            list.add(strings[i].charAt(n) + strings[i]);
        }

        Collections.sort(list); // 담은 list를 정렬하면 자연스레 문자열의 n번째 문자로 정렬되어 담긴다.

        for (int i=0; i<list.size(); i++) {
            answer[i] = list.get(i).substring(1); // list에 같이 담았던 n번째 문자를 자르고 나머지 문자열을 answer에 담는다.
        }

        return answer;
    }
}
