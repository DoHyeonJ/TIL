# Uncaught SyntaxError: missing ) after argument list

### 원인 : 
```
a태그에서 url을 스크립트로 전송시에 에러가 발생하였다.

원인은 js 에서 url 을 문자로 받아들이지 않았기 때문에 발생하였다.
```

### 해결 : 
```
@item.st_url 에 작은 따옴표를 추가하여 문자열로 변경하여 주고 정상작동

'@item.st_url' 
```

### 정리 : 
- item 에 담겨있는 st_url은 url 형식이다. ex) https://github.com/DoHyeonJ
- 이 url을 js에선 나눠져 있는 문자열로 인식하였고 parameter를 제대로 받아오지 못했다.
- item.st_url = https://github.com/DoHyeonJ
- 'item.su_url' = 'ttps://github.com/DoHyeonJ' 
- 위와 같은 형식이 된 것 이다.
