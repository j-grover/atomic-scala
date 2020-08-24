// Solution-5.scala

// 5. Create a class Painting by adding in the trait ArtPeriod, passing the
// year into the Painting constructor. Satisfy the following test:
// val painting =
//  new Painting("The Starry Night", 1889)
// painting.period is "Modern"
  
import com.atomicscala.AtomicTest._

trait ArtPeriod {
    def period(year: Int) = 
        year match {
            case _ if (year < 1300) => "Pre-Renaissance"
            case _ if (year >= 1300 && year <= 1599) => "Renaissance"
            case _ if (year >= 1600 && year <= 1699) => "Baroque"
            case _ if (year >= 1700 && year <= 1789) => "Late Baroque"
            case _ if (year >= 1790 && year <= 1880) => "Romanticism"
            case _ if (year >= 1881 && year <= 1970) => "Modern"
            case _ => "Contemporary"
        }
}

class Painting(name: String, year: Int) extends ArtPeriod {
    def period: String = period(year)
}

val painting = new Painting("The Starry Night", 1889)
painting.period is "Modern"