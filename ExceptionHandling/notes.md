# Errors vs Exceptions in Java

| Aspect                | Errors                                   | Exceptions                                 |
|-----------------------|------------------------------------------|--------------------------------------------|
| Definition            | Serious problems, usually not recoverable| Issues that can be handled in code         |
| Base Class            | `java.lang.Error`                        | `java.lang.Exception`                      |
| Recoverable?          | No                                       | Yes                                        |
| Examples              | `OutOfMemoryError`, `StackOverflowError` | `NullPointerException`, `IOException`      |
| When Occur            | Mostly at runtime                        | Mostly at runtime                          |
| Should be Caught?     | No (not recommended)                     | Yes (should be handled)                    |
| Subclass of           | `Throwable`                              | `Throwable`                                |

**Summary:**  
- **Errors** are serious issues beyond the application's control (e.g., JVM crash, memory issues, assertion error).  
- **Exceptions** are conditions that a program can handle (e.g., invalid input, file not found).
