package aspectj.targets;

import aspectj.annotations.Decorator;

public class Callee {

    @Decorator
    public void apiA() {
        System.out.println("apiA is called.");
    }

    @Decorator(executeAround = true)
    public void apiB() {
        System.out.println("apiB is called.");
    }

    @Decorator(executeBefore = true, executeAfter = true)
    public void apiC() {
        System.out.println("apiC is called.");
    }

    @Decorator(executeBefore = true)
    public void apiD() {
        System.out.println("apiD is called.");
    }

    public void apiE() {
        System.out.println("apiE is called.");
    }

}
