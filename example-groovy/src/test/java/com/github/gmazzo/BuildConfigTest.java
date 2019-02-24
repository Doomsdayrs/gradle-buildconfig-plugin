package com.github.gmazzo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BuildConfigTest {

    @Test
    void testBuildConfigProperties() {
        assertEquals("example-groovy", BuildConfig.APP_NAME);
        assertEquals("Z3JhZGxlLWphdmEtYnVpbGRjb25maWctcGx1Z2lu", BuildConfig.APP_SECRET);
        assertTrue(System.currentTimeMillis() >= BuildConfig.BUILD_TIME);
        assertTrue(BuildConfig.FEATURE_ENABLED);
        assertArrayEquals(new int[]{1, 2, 3, 4}, BuildConfig.MAGIC_NUMBERS);
    }

}
