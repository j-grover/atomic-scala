// Solution-1.scala

// 1. Rewrite ShowListingEither.scala (and other code as necessary) to
// use Success and Fail. 
 
import com.atomicscala.AtomicTest._
import codelisting._
import com.atomicscala.reporterr.Fail
import util.{Success, Failure}
import java.io.FileNotFoundException
import scala.collection.IndexedSeq

class CodeListingTester(
    makeList: String => IndexedSeq[java.io.Serializable]) {

    makeList("CodeListingTester.scala")(4) is
    "class CodeListingTester("

    makeList("NotAFile.scala")(0) is
    "File Not Found: NotAFile.scala"

    makeList("NotAScalaFile.txt")(0) is
    "NotAScalaFile.txt " +
    "doesn't end with '.scala'"

    makeList(null)(0) is
    "Error: Null file name"
}

object CodeListingEither {
    def apply(name: String) =
        try {
            Success(new CodeListing(name))
        } catch {
            case _: FileNotFoundException =>
                Fail(s"File Not Found: $name")
            case _: NullPointerException =>
                Fail("Error: Null file name")
            case e: ExtensionException =>
                Fail(e.getMessage)
        }
}

def listing(name: String) = {
    CodeListingEither(name) match {
        case Success(lines) => lines
        case Failure(error) => Vector(error)
    }
}

new CodeListingTester(listing)