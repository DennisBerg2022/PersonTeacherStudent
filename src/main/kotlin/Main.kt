fun main(args: Array<String>) {
    val s1 = Student("Lois", 30, "G")
    val t1 = Teacher("Susan", 34, 100.0)
    val p1 = Person( "David", 44)
    val schoolList = mutableListOf<Person>()
    schoolList.add(s1)
    schoolList.add(t1)
    schoolList.add(p1)

    println("${t1.name} tjänar ${t1.salary}")
    val teacher = schoolList[1]
    //println("${teacher.name} tjänar ${teacher.salary}")
    for(p in schoolList){       //p - new variable within loop to print all in the list one by one
        println("namn: ${p.name}")
    }

}
open class Person(var name : String, var age : Int){}

class Student(name : String, age : Int, var grade : String ) : Person(name, age )

class Teacher(name : String, age : Int, var salary : Double) : Person (name, age)

