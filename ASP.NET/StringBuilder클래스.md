# StringBuilder 
>String 개체는 변경할 수 없기 때문에, System.String 클래스에서 메서드 중 하나를 사용할 때마다 메모리에 새 문자열 개체가 생성되며, 새 개체에 대한 공간을 새로 할당해야 한다.
문자열을 반복적으로 수정해야 하는경우 새로운 String 개체 생성과 관련된 오버헤드로 인해 비용이 증가할 수 있다. 새 개체를 만들지 않고 문자열을 수정하려는 경우 System.Text.StringBuilder 클래스를 사용할 수 있다.

```
        //
        // 요약:
        //     유니코드 문자에 대한 문자열 표현의 지정된 복사본 수를 이 인스턴스의 끝에 추가합니다.
        //
        // 매개 변수:
        //   value:
        //     추가할 문자입니다.
        //
        //   repeatCount:
        //     value를 추가할 횟수입니다.
        //
        // 반환 값:
        //     추가 작업이 완료된 후 이 인스턴스에 대한 참조입니다.
        //
        // 예외:
        //   T:System.ArgumentOutOfRangeException:
        //     repeatCount가 0보다 작은 경우 또는 이 인스턴스의 값이 커지면 System.Text.StringBuilder.MaxCapacity를
        //     초과할 수 있는 경우
        //
        //   T:System.OutOfMemoryException:
        //     메모리가 부족합니다.
        public StringBuilder Append(char value, int repeatCount);
```
