package org.example.droidjar.app

import org.example.droidjar.lib.DroidJarLib
import org.junit.Assert
import org.junit.Test

import org.junit.Assert.*

/**
 * Test that library is properly called by host-run unit tests
 */
class DroidJarLibIntegrationTest {

    @Test
    fun testCountUnique_whenHello_thenFour() {
        val lib = DroidJarLib()
        assertEquals(4, lib.countUniqueCharacters("Hello"))
    }
}
