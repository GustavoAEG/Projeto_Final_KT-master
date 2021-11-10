package service

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class CourseServiceTest {

    @Test
    fun showSummary() {
        var Sum = CourseService()

        Assertions.assertEquals(null, Sum.getCourse("INTRO-CS-666"))

    }
}