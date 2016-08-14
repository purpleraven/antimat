# antimat

Java library for detect/replace/delete russian swears 

Based on http://www.tcen.ru/antimat/

Code examles:

```java
...
MatMatcher matMatcher = new MatMatcher()
matMatcher.detect(message)
...
String cleand = matMatcher.replace(text, ":bip:")
```

https://bintray.com/purpleraven/libs/antimat


