// Solution-3.scala

// 3. Use your new script on a file that does not exist. Do you need to
// make additional modifications? 

import com.atomicscala.AtomicTest._
import codelisting._
import scala.collection.IndexedSeq

class CodeListingPrintTester(makeList: String => IndexedSeq[String]) {
    val lines = makeList("DoesNotExist.scala")
    var i = 1
    for (l <- lines) {
        println(s"$i $l")
        i += 1
    }
}

new CodeListingPrintTester(CodeListing.apply)

// No additional modifications required, ouput is:
// 1 File Not Found: DoesNotExist.scala