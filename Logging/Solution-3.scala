// Solution-3.scala

// 3. Rewrite Logging.scala and LoggingTest.scala to produce an App
// (see Applications) that uses its command-line argument to set the
// logging level. Verify that it works with all logging levels. 

import com.atomicscala.AtomicTest._
import java.util.logging._

trait Logging {
	val log = Logger.getLogger(".")
	log.setUseParentHandlers(false)
	log.setLevel(Level.ALL)

	def addHandler(level: Level) = {
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

object LoggingTest extends App with Logging {
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

	for (arg <- args) {
		addHandler(
			arg match {
				case "ALL" => Level.ALL
				case "SEVERE" => Level.SEVERE
				case "WARNING" => Level.WARNING
				case "INFO" => Level.INFO
				case "FINE" => Level.FINE
				case "FINER" => Level.FINER
				case _ => throw new IllegalArgumentException("Not a valid debug level")
			}
		)
	}
	
	f
	g(0)
	g(-1)
	g(101)
}