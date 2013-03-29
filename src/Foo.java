public class Foo {
    private Starter starter;
    private Stopper stopper;
    private boolean green;
    private boolean fluffy;
    private FooCity city;

    public Foo(Starter starter, Stopper stopper, boolean green, boolean fluffy, FooCity city) {
        this.starter = starter;
        this.stopper = stopper;
        this.green = green;
        this.fluffy = fluffy;
        this.city = city;
    }

    public Foo(Starter starter, Stopper stopper) {
        this.starter = starter;
        this.stopper = stopper;
    }

    public Starter getStarter() {
        return starter;
    }

    public Stopper getStopper() {
        return stopper;
    }

    public boolean isGreen() {
        return green;
    }

    public boolean isFluffy() {
        return fluffy;
    }
}
