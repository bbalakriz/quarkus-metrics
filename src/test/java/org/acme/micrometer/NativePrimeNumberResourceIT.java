package org.acme.micrometer;

import io.quarkus.test.junit.NativeImageTest;

@NativeImageTest
public class NativePrimeNumberResourceIT extends PrimeNumberResourceTest {

    // Execute the same tests but in native mode.
}