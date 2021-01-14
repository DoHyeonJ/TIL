# DATEADD

#### 현재(특정한) 날짜 및 시간에 원하는 만큼 더해줄수있다.

---
사용법)
```mysql
Select GETDATE() - 2020-12-23 18:37:35.012
```
---

```
Select'년', DATEADD(Year, 1, GETDATE())
```
> 결과 2021-12-23 18:37:35.012

```
Select'년', DATEADD(Day, 1, GETDATE())
```

> 결과 2020-12-24 18:37:35.012

---
