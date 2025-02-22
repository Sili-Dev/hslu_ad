package org.hslu.ex_1

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SymmetricNumbersTest {

    @Test
    fun testSymmetricNumbers() {
        val symmetricNumbers = SymmetricNumbers()
        assertTrue(symmetricNumbers.isNumberSymmetric(1221))
        assertFalse(symmetricNumbers.isNumberSymmetric(1234))
        assertTrue(symmetricNumbers.isNumberSymmetric(123321))
        assertTrue(symmetricNumbers.isNumberSymmetric(12521))
    }
}