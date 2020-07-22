package com.gbd.mykttestapp;

class DispatchTest {

    static abstract class Human {
    }

    static class Women extends Human {
    }

    static class Men extends Human {
    }

    public void sayHello(Human guy) {
        TestPrint.INSTANCE.println("hello guy");
    }

    public void sayHello(Women guy) {
        TestPrint.INSTANCE.println("hello women");
    }

    public void sayHello(Men guy) {
        TestPrint.INSTANCE.println("hello men");
    }

    public void test()
    {
        Human h1 = new Women();
        Human h2 = new Men();

        DispatchTest test = new DispatchTest();
        test.sayHello(h1);
        test.sayHello(h2);
        test.sayHello((Men)h2);
    }
}
