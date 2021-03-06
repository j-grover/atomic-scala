// Solution-2.scala

// 2. Continue the previous exercise by adding a FileHandler and
// ConsoleHandler for each logging level, and set the level of each
// handler appropriately. Verify that each handler only captures the
// output for its level.

import com.atomicscala.AtomicTest._
import java.util.logging._

trait Logging {
	val log = Logger.getLogger(".")
	log.setUseParentHandlers(false)
	log.setLevel(Level.ALL)

	val levels = List(Level.ALL, Level.SEVERE, Level.WARNING, Level.INFO,
					  Level.FINE, Level.FINER)
	for (level <- levels) {
		val fh = new FileHandler(s"AtomicLog$level.txt")
		val ch = new ConsoleHandler
		fh.setLevel(level)
		ch.setLevel(level)
		log.addHandler(fh)
		log.addHandler(ch)
	}

	def error(msg: String) = log.severe(msg)
	def warn(msg: String) = log.warning(msg)
	def info(msg: String) = log.info(msg)
	def debug(msg: String) = log.fine(msg)
	def trace(msg: String) = log.finer(msg)
}

class LoggingTest extends Logging {
	info("Constructing a LoggingTest")
	def f = {
		trace("entering f")
		// ...
		trace("leaving f")
	}
	def g(i: Int) = {
		debug(s"inside g with i: $i")
		if(i < 0)
			error("i less than 0")
		if(i > 100)
			warn(s"i getting high: $i")
	}
}

val lt = new LoggingTest
lt.f
lt.g(0)
lt.g(-1)
lt.g(101)