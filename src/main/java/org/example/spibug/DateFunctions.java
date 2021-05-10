package org.example.spibug;

import io.trino.spi.function.ScalarFunction;
import io.trino.spi.function.SqlNullable;
import io.trino.spi.function.SqlType;
import io.trino.spi.type.StandardTypes;

public final class DateFunctions {
    @ScalarFunction("my_to_unixtime")
    @SqlType(StandardTypes.DOUBLE)
    @SqlNullable
    public static Double date(@SqlNullable @SqlType("timestamp(3)") Long dt) {
        if (dt == null) {
            return null;
        }
        return dt / 1000000.0;
    }
}