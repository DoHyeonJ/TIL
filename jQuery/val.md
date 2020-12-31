# val
- 양식(form)의 값을 가져오거나 설정하는 메소드

#### 사용법

``` 
var val = $('input#valInput').val();
```

- ID가 valInput인 input요소의 값을 val 변수에 저장

```
$('input#valInput').val('value');
```

- ID가 valInput인 input 요소의 값을 value로 저장

#### HTML
```
<!doctype html>
<html lang="ko">
	<head>
		<meta charset="utf-8">
		<title>val</title>
	</head>
	<body>
		<p><input type="text" id="valInput"> <button>Click</button></p>
	</body>
</html>
```
