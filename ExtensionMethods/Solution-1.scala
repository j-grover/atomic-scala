// Solution-1.scala

// 1. Rewrite ExtensionMethodArguments.scala so you get the same
// results without using extension methods. 
 
import com.atomicscala.AtomicTest._

case class Book(title: String)

def categorize(book: Book, category: String) =
    s"$book, category: $category"

categorize(Book("Dracula"), "Vampire") is "Book(Dracula), category: Vampire" 