// ClassBodies.scala

package com.atomicscala.ClassBodies

class NoBody {
    def name(): String = "No one"
}

class SomeBody {
    def name(): String = "Janet Doe"
    println(name + " is SomeBody")
}

class EveryBody {
    def all(): Vector[SomeBody] = Vector(new SomeBody, new SomeBody, new SomeBody)
}