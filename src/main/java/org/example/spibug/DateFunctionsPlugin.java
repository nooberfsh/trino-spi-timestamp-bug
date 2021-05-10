package org.example.spibug;


import io.trino.spi.Plugin;
import com.google.common.collect.ImmutableSet;

import java.util.Set;

public class DateFunctionsPlugin implements Plugin {
    @Override
    public Set<Class<?>> getFunctions() {
        return ImmutableSet.<Class<?>>builder()
                .add(DateFunctions.class)
                .build();
    }
}
