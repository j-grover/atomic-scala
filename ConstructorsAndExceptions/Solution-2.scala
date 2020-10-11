// Solution-2.scala

// 2. Add line numbering to your solution for the previous exercise. 

import com.atomicscala.AtomicTest._
import codelisting._
import scala.collection.IndexedSeq

class CodeListingPrintTester(makeList: String => IndexedSeq[String]) {
    val lines = makeList("CodeListingTester.scala")
    var i = 1
    for (l <- lines) {
        println(s"$i $l")
        i += 1
    }
}

new CodeListingPrintTester(CodeListing.apply)