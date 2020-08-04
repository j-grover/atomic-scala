// Solution-4.scala

// 4. Modify VacationHouse by including a class to represent months
// rented (pattern matching can help here). Satisfy the following: 
// val v = new VacationHouse("MI","49431",6,8)
// v is "Rented house in MI for months of " +
//  "June through August."

import com.atomicscala.AtomicTest._

class House(val address: String, val state: String, val zip: String) {
    def this(state: String, zip: String) =
        this("address?", state, zip)
    
    def this(zip: String) =
        this("address?", "state?", zip)
} 

class VacationHouse(
    state: String, 
    zip: String, 
    val startMonth: Int, 
    val endMonth: Int
) extends House(state, zip) {
    override def toString =
        s"Rented house in $state for months of ${month(startMonth)} through ${month(endMonth)}."

    def month(monthNum: Int) = {
        monthNum match {
            case 1      => "January"
            case 2      => "February"
            case 3      => "March"
            case 4      => "April"
            case 5      => "May"
            case 6      => "June"
            case 7      => "July"
            case 8      => "August"
            case 9      => "September"
            case 10     => "October"
            case 11     => "November"
            case 12     => "December"
        }
    }
}

val v = new VacationHouse("MI", "49431", 6, 8)
v is "Rented house in MI for months of June through August."