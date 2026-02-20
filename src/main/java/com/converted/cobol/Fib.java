}
```

```java
package com.converted.cobol;

public class FibApplicationService {

    private final FibonacciService fibonacciService;
    private final ConsoleUI consoleUI;

    public FibApplicationService() {
        this.fibonacciService = new FibonacciService();
        this.consoleUI