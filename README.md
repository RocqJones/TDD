# TDD
When following a TDD approach, typically you go through a cycle of Red-Green-Refactor. You’ll run a test, see it fail (go red), implement the simplest code to make the test pass (go green), and then refactor the code so your test stays green and your code is sufficiently clean.
* The first step in this cycle is to run the test and see it fail.
```kotlin
class CalculatorTest {
    @Test
    fun testMultiplyBy2() {
        val calculator = Calculator()
        val result = calculator.parse("2 * 2")
        assertEquals(4, result)
    }
}

class Calculator {
    fun parse(s: String): Int {
        return 0
    }
}
```

* The next step is to make the tests pass, which means implementing the simplest thing that works.
```kotlin
class Calculator {
    fun parse(s: String): Int {
        val (a, op, b) = s.split(" ")
        return when (op) {
            "*" -> a.toInt() * b.toInt()
            else -> throw IllegalArgumentException("Invalid Operation")
        }
    }
}
```

## Iterate
When following a TDD-style approach, this is even more true. In order to drive out more complex behaviour, we add tests for other cases.

## Shortcuts
- In your test class, use "⌘Сmd N" to create a new test function.
- From inside the test, press "⌃ Ctrl ⇧ Shift R" to run this individual test `CalculatorTest`.
- 