# for each 문 형식
- for(변수타입 변수이름 : 배열이름)
  실행부분;
  
- for each(향상된 for문) 에서는 배열의 항목 수 만큼 실행부분을 반복한다.
- 반복이 이루어질 때마다 배열의 항목을 순서대로 거내어 변수(number)에 자동으로 대입해 준다.

- 따로 반복 변수(int i)를 선언하거나 배열의 값을 가져오는 부분(array[i])없이 실행부분에서는 하고자 하는 작업에 집중할 수 있다.

### 오직 배열의 값을 가져다 사용할 수만 있고, 수정할 수는 없다.
```java
public class Arr {
    
    public static void main(String[] args) {
//        String [] arData = {"안녕", "반가워", "이름이", "뭐니?"};
//        
//        for(String i : arData) {
//            System.out.println(i);
//        }
        
        int [][] arrScore = {
                {10, 20, 30},//1번
                {11, 25, 39},//2번
                {12, 26, 38},//3번
                {13, 27, 37},//4번
                {14, 28, 36}//5번
        };
        int total = 0;
        double avg = 0.0;
        //각 학생별 총점과 평균 출력하기
        //빠른 for문으로
        int cnt = 0;
        for(int[] arScore : arrScore) {
            total = 0;
            cnt++;
            for(int score : arScore) {
                total += score;
            }
            System.out.println(cnt+"번 총점 : "+total+"점");
            avg = Double.parseDouble(String.format("%.2f", (double)total/arScore.length));
            System.out.println(cnt+"번 평균 : "+avg+"점");
        }
    }
}

```
  
