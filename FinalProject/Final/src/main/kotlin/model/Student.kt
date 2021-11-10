package model

import java.util.*

class Student(id: String?, name: String?, email: String?, birthDate: Date?) : Person(id, name, email, birthDate),
    Evaluation {
    private val average = 0.0

    private val courses: List<Course> = ArrayList()
    private val approvedCourses: MutableMap<String?, Course?> = HashMap()

    val addaluno = hashMapOf<String?, String?>()
    override fun getAverage(): Double {
        return average;
    }

    fun enrollToCourse(course: Course?) {
        addaluno.put(id.toString(), courses.toString())
    }

    fun registerApprovedCourse(course: Course) {
        approvedCourses[course.code] = course
    }

    fun isCourseApproved(courseCode: String?): Boolean {
        return approvedCourses.contains(id)
    }

    fun isAttendingCourse(courseCode: String?): Boolean {
        if(addaluno.contains(id)){
            println("Aluno está cursando")
            return true
        }else{
            println("Aluno não está frenquentando")
            return false
        }
    }

    override fun getApprovedCourses(): List<Course>? {
        var approved = mutableListOf<Course>()

        for (i in courses){
            approved.add(i)
        }

        return ArrayList(approved)
        return ArrayList()
    }

    override fun toString(): String {
        return "Student {" + super.toString() + "}"
    }
}
