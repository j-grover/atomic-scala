// Solution-3.scala

// 3. Modify ShowListingTry.scala to include line numbers. Were you
// able to use the CodeListingTester from your solution in
// Constructors and Exceptions?  

import com.atomicscala.AtomicTest._
import codelisting._

import util.Try
import java.io.FileNotFoundException
import scala.collection.IndexedSeq

def listing(name: String) =
    Try(new CodeListing(name)).recover {
        case _: FileNotFoundException =>
            Vector(s"File Not Found: $name")
        case _: NullPointerException =>
            Vector("Error: Null file name")
        case e: ExtensionException =>
            Vector(e.getMessage)
    }.get

class CodeListingPrintTester(makeList: String => IndexedSeq[String]) {
    val lines = makeList("CodeListingTester.scala")
    var i = 1
    for (l <- lines) {
        println(s"$i $l")
        i += 1
    }
}

new CodeListingPrintTester(listing)

// CodeListingTester was able to be reused without any modifications