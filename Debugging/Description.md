См. baeldung: Java Application Remote Debugging

0. В IDEA "Edit Configuration" -> "+" -> "Remote JVM Debug".. - создаём 
RDebugJVM конфигурацию


1. Скомпилированный класс запускай не через ИДЕЮ, а просто из коммандной строки*
 ```
 java -agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=8000 ru.example.OurApplication
```
*создай start.cmd, и в конце напиши "pause"

2. Структура исходников(src) проекта должна быть такой же как 
и в скомпилированной программе (классы-пакеты)


3. Запускаем скрипт


4. В IDEA выбираем RDebugJVM конфигурацию и нажимаем "букашку" - запускаем Debug**!

**Breakpoints можно ставить заранее или во время отладки.