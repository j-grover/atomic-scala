// Solution-2.scala

// 2. Modify ExtensionMethodArguments.scala by adding an additional
// extension method in that has two arguments. Write tests. 

import com.atomicscala.AtomicTest._

case class Book(title: String)

object BookExtension {
	implicit class Ops(book: Book) {
		def categorize(category: String) =
			s"$book, category: $category"
		def published(month: String, year: String) = 
			s"$book, published: $month-$year"
	}
}
import BookExtension._

Book("Dracula") categorize "Vampire" is "Book(Dracula), category: Vampire"
Book("Cars").published("05", "2002") is "Book(Cars), published: 05-2002"