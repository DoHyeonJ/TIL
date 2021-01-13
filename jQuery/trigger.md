# trigger
- 준비된 이벤트를 조건이 맞춰지지않아도 강제로 실행시키는 명령코드
---

### 사용법
```javascript
$('selector').trigger('선택할 이벤트')
```

### 예제 )
```javascript
$('.btn').click(function () {
                var _this = $(this);
                _this.parent().find('input').trigger("focus");
            });
```
---

#### $('#btn').trigger("click"); <br>
: 보통 이런식으로 클릭이벤트를 강제로 실행할 때 주로 사용한다.
