// Solution-1.scala

// 1. Working from CodeListingTester.scala, write a script that uses
// CodeListing.scala to open a source-code file and print all the lines
// in the file.  
 
import com.atomicscala.AtomicTest._
import codelisting._
import scala.collection.IndexedSeq

class CodeListingPrintTester(makeList: String => IndexedSeq[String]) {
    val lines = makeList("CodeListingTester.scala")
    for (l <- lines)
        println(l)
}

new CodeListingPrintTester(CodeListing.apply)