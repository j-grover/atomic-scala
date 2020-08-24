// Solution-3.scala

// 3. Using the Connections trait from Exercise 2, create a WIFICamera
// class that limits connections to five. Did you have to create any
// additional classes or methods? Satisfy the following tests:
// val c2 = new WIFICamera with Connections
// c2.maxConnections is 5
// c2.connect(true) is true
// c2.connected is 1
// c2.connect(false) is true
// c2.connected is 0
// c2.connect(false) is false

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

trait WIFI {
    val reportStatus: String
    val address: String
}

class Camera {
    val showImage = "Showing video"
}

class WIFICamera extends Camera with WIFI {
    val reportStatus = "working"
    val address = "192.168.0.200"
}

val c2 = new WIFICamera with Connections
c2.maxConnections is 5
c2.connect(true) is true
c2.connected is 1
c2.connect(false) is true
c2.connected is 0
c2.connect(false) is false

// No additional classes or methods were required