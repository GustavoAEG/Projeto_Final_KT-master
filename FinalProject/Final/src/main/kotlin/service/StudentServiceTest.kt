package service

import model.Student
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class StudentServiceTest {

    @Test
    fun findStudent() {
        val findStudent = StudentService()

        val estudante = Student("1001", "Cristhian Ruescas", "cristhian.ruescas@teste.com", null)

        findStudent.subscribeStudent(estudante)

        assertNotEquals(null, findStudent.findStudent("1001"))


    }
}