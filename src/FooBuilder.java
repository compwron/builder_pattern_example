public class FooBuilder {

    private Starter starter;
    private Stopper stopper;
    private boolean isGreen;
    private boolean isFluffy;
    private FooCity city;

    public FooBuilder(Starter starter, Stopper stopper) {
        this.starter = starter;
        this.stopper = stopper;
    }

    public FooBuilder(Foo original) {
        this.starter = original.getStarter();
        this.stopper = original.getStopper();
    }

    public FooBuilder isGreen(boolean isGreen) {
        this.isGreen = isGreen;
        return this;
    }

    public FooBuilder isFluffy(boolean isFluffy) {
        this.isFluffy = isFluffy;
        return this;
    }

    public FooBuilder city(FooCity city) {
        this.city = city;
        return this;
    }

    public Foo build() {
        return new Foo(starter, stopper, isGreen, isFluffy, city);
    }
}