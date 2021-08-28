package org.example.droidjar.lib

import org.junit.Assert.assertEquals
import org.junit.Test

class DroidJarLibTest {

    @Test
    fun testCountUnique_whenEmpty_thenZero() {
        val lib = DroidJarLib()
        assertEquals(0, lib.countUniqueCharacters(""))
    }

    @Test
    fun testCountUnique_whenAllTheSame_thenOne() {
        val lib = DroidJarLib()
        assertEquals(1, lib.countUniqueCharacters("AAA"))
    }

    @Test
    fun testCountUnique_whenHello_thenFour() {
        val lib = DroidJarLib()
        assertEquals(4, lib.countUniqueCharacters("Hello"))
    }
}
