import org.example.Calculator
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

/**
 * Place the caret inside the curly braces in the class, press ⌘Сmd N
 * Select Test Function from the menu, Select JUnit 5 as the test framework, and name it.
 */
class CalculatorTest {

    private val calculator = Calculator()

    /**
     * The first step in this cycle is to run the test and see it fail.
     * The next step is to make the tests pass, which means implementing the simplest thing that works.
     */
    @Test
    fun testMultiplyBy2() {
        val result = calculator.parse("2 * 2")
        assertEquals(4, result)
    }

    @Test
    fun testDivideBy2() {
        val result = calculator.parse("4 / 2")
        assertEquals(2, result)
    }
}