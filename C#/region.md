# region
- #region으로 시작하여 #endregion으로 끝낼 수 있는 코드를 확대 또는 축소할 수 있는 지시문이다.

- 긴 코드 블록들을 작은 블록으로 만들어 한눈에 보기쉽게 표현할 수 있으며, 다른작업에 집중할 수 있다.
---
### 사용법

```c#
#region 변수생성
int num =0;
int idx = 0;
#endregion

#region 변수사용
num = 10;
idx = 10;
#endregion
```

#### 위의 region이 접히면 아래의 모습이 된다.
---
```
변수생성
변수사용
```

#### region을 접었을때의 모습

---
