import aspectj.targets.Callee;
import org.junit.Test;

public class AspectJTests {

    @Test
    public void aspectjAnnotationBaseExample() {
        Callee callee = new Callee();

        callee.apiA();
        System.out.println();

        callee.apiB();
        System.out.println();

        callee.apiC();
        System.out.println();

        callee.apiD();
        System.out.println();

        callee.apiE();
        System.out.println();
    }

}
