// Solution-2.scala

// 2. Create a trait Connections that tells how many connected users
// there are and limits the number of connections to five. Satisfy the
// following tests:
// val c = new Object with Connections
// c.maxConnections is 5
// c.connect(true) is true
// c.connected is 1
// for(i <- 0 to 3)
//  c.connect(true) is true
// c.connect(true) is false
// c.connect(false) is true
// c.connected is 4
// for(i <- 0 to 3)
//  c.connect(false) is true
// c.connected is 0
// c.connect(false) is false

import com.atomicscala.AtomicTest._

trait Connections {
    val maxConnections = 5
    var connected = 0

    def connect(conn: Boolean) =
        conn match {
            case true =>
                if (connected < maxConnections) {
                    connected = connected + 1
                    true
                } else false
            case false =>
                if (connected > 0) {
                    connected = connected - 1
                    true
                } else false
        }
}

val c = new Object with Connections
c.maxConnections is 5
c.connect(true) is true
c.connected is 1

for(i <- 0 to 3)
 c.connect(true) is true

c.connect(true) is false
c.connect(false) is true
c.connected is 4

for(i <- 0 to 3)
 c.connect(false) is true

c.connected is 0
c.connect(false) is false