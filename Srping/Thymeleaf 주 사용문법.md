th:text

-   화면에 값 출력시 사용

```jsx
<p th:text="${name}"></p>
```

th:if

-   조건문

```jsx
<div th:if="${error}">
<p>error</p>
</div>
```

th:errors

-   해당 value에 error가 있는경우 출력

```jsx
<ul>
    <li th:errors="*{id}" />
    <li th:errors="*{name}" />
</ul>
```

th:action

-   form 태그 사용 시, 해당 경로로 요청을 보낼 떄 사용

th:object

-   form submit을 할때, form의 데이터가 th:object에 설정해준 객체로 받아짐

th:field

-   각각 필드들을 매핑을 해주는 역할, 설정해 준값으로 th:object에 설정해 준 객체의 내부와 매칭

```jsx
<form th:action="@{/sign-up}" th:object="${signUpForm}" method="post">
```
