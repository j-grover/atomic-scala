// Solution-8.scala

// 8. Create an anonymous function and assign it to the name pluralize.
// It should construct the (simple) plural form of a word by just
// adding an “s.” Satisfy the following tests:
// pluralize("cat") is "cats"
// pluralize("dog") is "dogs"
// pluralize("silly") is "sillys"

import com.atomicscala.AtomicTest._

val pluralize = (word: String) => word + "s"

pluralize("cat") is "cats"
pluralize("dog") is "dogs"
pluralize("silly") is "sillys"