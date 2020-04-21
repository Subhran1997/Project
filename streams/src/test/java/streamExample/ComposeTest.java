package streamExample;
    import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.hamcrest.Matcher;
import org.junit.Test;

import com.streams.main.Compose;

    public class ComposeTest {

        @SuppressWarnings("unchecked")
        @Test
        public void testPrivateConstructor() {
            assertThat(Compose.class, hasOnlyPrivateConstructors());
        }

        @SuppressWarnings("rawtypes")
        private Matcher hasOnlyPrivateConstructors() {
            // TODO Auto-generated method stub
            return null;
        }

        @Test
        public void testComposeRunnables() {
            final int[] counter = new int[] { 0 };
            final Runnable runnable = new Runnable() {
                @Override
                public void run() {
                    counter[0]++;
                }
            };

            Runnable composed = Compose.runnables(runnable, runnable);
            composed.run();
            assertThat(counter[0], is(2));
        }
}
