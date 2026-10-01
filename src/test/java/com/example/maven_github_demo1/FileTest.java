package com.example.maven_github_demo1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class FileTest {

    @Test
    void testTotal() {
        assertEquals(225, GradeCalculator1.calculateTotal(75, 68, 82));
    }

    @Test
    void testAverage() {
        assertEquals(75.0, GradeCalculator1.calculateAverage(75, 68, 82));
    }

    @Test
    void testPass() {
        assertTrue(GradeCalculator1.isPass(75.0));
    }

    @Test
    void testFail() {
        assertFalse(GradeCalculator1.isPass(35.0));
    
}
}