package com.example.classparticipation

public abstract class Subject {
    abstract fun SubjectAge() :Double
}
public class Animal() : Subject() {
    override fun SubjectAge(): Double {
        return 12.0

    }
}
class Human() : Subject() {
        override fun SubjectAge(): Double {
            return 30.9
        }
    }
class Plant() : Subject() {
    override fun SubjectAge(): Double {
        return 70.0
    }
}
