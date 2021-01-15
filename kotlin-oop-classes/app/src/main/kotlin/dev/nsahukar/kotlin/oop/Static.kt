package dev.nsahukar.kotlin.oop

fun showFirstCharacter(input: String): Char {
	if (input.isEmpty()) throw IllegalArgumentException()
	return input.first()
}

object Singleton {
	private var count = 0
	fun doSomething(): Unit {
		println("Calling doSomething (${++count} call(s) in total)")
	}
}

open class SingletonParent(var x: Int) {
	fun something(): Unit {
		println("X=$x")
	}
}
object SingletonDerive : SingletonParent(10) {}

interface StudentFactory {
	fun create(name: String): Student
}
class Student private constructor(val name: String) {
	companion object : StudentFactory {
		override fun create(name: String): Student {
			return Student(name)
		}
	}
}
