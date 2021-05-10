package org.example.spibug;

import io.trino.operator.scalar.AbstractTestFunctions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestDateFunctions extends AbstractTestFunctions {

    @BeforeClass
    public void setUp()
    {
        functionAssertions.installPlugin(new DateFunctionsPlugin());
    }

    @Test
    public void testToUnixtime() {
//        // ok
//        assertFunction("to_unixtime(cast('2020-01-06 21:10:04' as timestamp))", DOUBLE, 1578316204.0);

        // failed
        //assertFunction("my_to_unixtime(cast('2020-01-06 21:10:04' as timestamp))", DOUBLE, 1578316204.0);
    }
}
