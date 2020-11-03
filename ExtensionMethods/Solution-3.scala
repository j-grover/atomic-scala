// Solution-3.scala

// 3. Rewrite ExtensionMethodArguments.scala to turn Ops into a value
// class. 

import com.atomicscala.AtomicTest._

case class Book(title: String)

object BookExtension {
	implicit class Ops(val book: Book) extends AnyVal {
		def categorize(category:String) =
			s"$book, category: $category"
	}
}
import BookExtension._

object Main extends App {
	Book("Dracula") categorize "Vampire" is "Book(Dracula), category: Vampire"
}