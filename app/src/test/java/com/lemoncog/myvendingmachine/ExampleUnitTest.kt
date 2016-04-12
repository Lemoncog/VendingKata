package com.lemoncog.myvendingmachine

import org.junit.Test

import org.junit.Assert.*

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
class ExampleUnitTest {

    @Test
    fun canItVend() {
        val vendingMachine = MyVendingMachine();

        assertTrue("I expected ya to vend!", vendingMachine.doYaVend());
    }
}