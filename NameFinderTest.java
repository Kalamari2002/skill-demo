import static org.junit.Assert.*;
import org.junit.*;

public class NameFinderTest{
    String[] names = new String[]{"Jose", "Mateus", "Ryo"};
    NameFinder finder;

    @Before
    public void setUp() throws Exception{
        finder = new NameFinder();
    }

    @Test
    public void testFindName(){
        assertTrue(finder.FindName(names, "Joao"));
    }
}