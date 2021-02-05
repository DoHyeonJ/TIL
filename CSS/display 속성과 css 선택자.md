# display 속성과 css 선택자**

---

**\==display 속성==**  
  
**div = 기본적으로 block 요소임.**  
**span = 기본적으로 inline 요소임.**  
  
**block : 한줄을 다차지함. **

ㄴ display: block;

: ex) 1

      2

      3

  
**none : 아예 표시하지않음.**

ㄴ display: none;

: ex) 

  
**inline-block : 엘리먼트를 글자화 한다.**

ㄴ display: block;

: ex)  1 2 3

---

**\==css선택자==**  
  
**div section : div 안에 들어있는 section 선택**  
ㄴ 후손선택자 == 내 안에 들어있는 것 중에서 선택  
  
**div > section : div의 자식인 section 선택**  
ㄴ 자식선택자 == 바로 아래 행렬에 있는 녀석들 중에서 선택  
  
**.a1 : 클래스 속성이 a1인 녀석들 선택**  
**div.a1 : div 이면서 클래스 속성이 a1인 녀석들 선택**  
(여러 엘리먼트가 같은 클래스를 가질 수 있다.)  
  
**#a1 : id 속성이 a1인 녀석을 선택**  
**div#a1 응용가능**  
(오직 하나의 요소만 선택이 가능하다.  
다른말로 id의 속성 값은 유니크 해야한다.)

---
