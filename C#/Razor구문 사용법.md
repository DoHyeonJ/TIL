# Razor
- ASP.NET 에서 view를 동적으로 생성할 수 있는 기술 또는 구문이다.
	( 확장자명이 .cshtml이다. )
    
## "@"문자를 사용한 방법
```
<!-- Single statement blocks  -->
@{ var total = 7; }
@{ var myMessage = "Hello World"; }

<!-- Inline expressions -->
<p>The value of your account is: @total </p>
<p>The value of myMessage is: @myMessage</p>

<!-- Multi-statement block -->
@{
    var greeting = "Welcome to our site!";
    var weekDay = DateTime.Now.DayOfWeek;
    var greetingMessage = greeting + " Today is: " + weekDay;
}
<p>The greeting is: @greetingMessage</p>
```

> The value of your account is: 7
The value of myMessage is: Hello World
The greeting is: Welcome to our site! Today 

## 코드 블록을 중괄호로 묶을 시
```
<!-- Single statement block.  -->
@{ var theMonth = DateTime.Now.Month; }
<p>The numeric value of the current month: @theMonth</p>

<!-- Multi-statement block. -->
@{
    var outsideTemp = 79;
    var weatherMessage = "Hello, it is " + outsideTemp + " degrees.";
}
<p>Today's weather: @weatherMessage</p>
```
> The nemeric value of the cuerrent month: 12
Today's wather: Hello, it is 79 degrees

## 변수를 사용하여 값 저장
```
<!-- Storing a string -->
@{ var welcomeMessage = "Welcome, new members!"; }
<p>@welcomeMessage</p>

<!-- Storing a date -->
@{ var year = DateTime.Now.Year; }

<!-- Displaying a variable -->
<p>Welcome to our new members who joined in @year!</p>
```
>Welcome, new members!
Welcome to our new members who joined in 2012!

출처 : https://docs.microsoft.com/ko-kr/aspnet/web-pages/overview/getting-started/introducing-razor-syntax-c#a-simple-code-example
