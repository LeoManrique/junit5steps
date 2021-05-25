import org.junit.*;

import static org.junit.Assert.*;

public class MyMathTest {

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Before Class");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("After Class");
    }

    @Before
    public void before() {
        System.out.println("Before");
    }

    @Test
    public void sum_with3numbers() {
        MyMath myMath = new MyMath();
        int result = myMath.sum(new int[] {1, 2, 3});
        assertEquals(6, result);
    }

    @After
    public void after() {
        System.out.println("After");
    }
}