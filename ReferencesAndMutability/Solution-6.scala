// Solution-6.scala

// 6. Create a class containing a var field. Write a method that takes an
// argument of this class. Inside the method, modify the var field to
// see if your method has side effects. 

import com.atomicscala.AtomicTest._

class Person(var name: String)

def test(person: Person) = person.name = "Bob"

val p = new Person("Sam")
p.name is "Sam"

test(p)
p.name is "Bob"