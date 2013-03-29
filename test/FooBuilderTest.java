import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class FooBuilderTest {

    @Test
    public void fooBuilderSetsAttributesOnFoo(){
        Foo builtFoo = new FooBuilder(new Starter(), new Stopper())
                .isFluffy(false)
                .build();
        assertFalse(builtFoo.isFluffy());
    }

    @Test
    public void fooBuilderCanHaveAttributesAdded(){
        FooBuilder fooBuilder = new FooBuilder(new Starter(), new Stopper())
                .city(new FooCity());

        Foo builtFoo = fooBuilder.isGreen(true).build();

        assertTrue(builtFoo.isGreen());
    }

    @Test
    public void fooBuilderCanModifyOriginal(){
        Starter starter = new Starter();
        Stopper stopper = new Stopper();

        Foo originalFoo = new Foo(starter, stopper);
        assertFalse(originalFoo.isGreen());

        Foo copiedAndModifiedFoo = new FooBuilder(originalFoo)
                .isGreen(true)
                .build();

        assertEquals(starter, copiedAndModifiedFoo.getStarter());
        assertEquals(stopper, copiedAndModifiedFoo.getStopper());
        assertTrue(copiedAndModifiedFoo.isGreen());
    }

    @Test
    public void fooBuilderHasAllAttributesOfOriginal(){
        Starter starter = new Starter();
        Stopper stopper = new Stopper();
        boolean green = true;
        boolean fluffy = true;
        FooCity fooCity = new FooCity();

        Foo originalFoo = new FooBuilder(starter, stopper)
                .isGreen(true)
                .isFluffy(true)
                .city(fooCity)
                .build();

        Foo copiedFoo = new FooBuilder(originalFoo).build();

        assertEquals(originalFoo.getStarter(), copiedFoo.getStarter());
        assertEquals(originalFoo.getStopper(), copiedFoo.getStopper());
        assertEquals(originalFoo.isGreen(), copiedFoo.isGreen());
        assertEquals(originalFoo.isFluffy(), copiedFoo.isFluffy());
        assertEquals(originalFoo.getCity(), copiedFoo.getCity());
    }
}
