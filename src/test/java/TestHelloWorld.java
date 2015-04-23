/**
 * Created by jolyma on 23.04.2015.
 */

import org.junit.Test.*;
import static org.junit.Assert.*;

public class TestHelloWorld {
    public void testHello(){
        HelloWorld test = new HelloWorld();

       assertEquals("Must return Hello World !", "Hello World !", test.hello());
    }
}
