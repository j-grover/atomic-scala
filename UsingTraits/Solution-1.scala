// Solution-1.scala

// 1. Create a trait WIFI that reports a status and has an address. Create
// a class Camera, and then another class WIFICamera that uses both
// the Camera class and WIFI trait. Satisfy the following tests:
// val webcam = new WIFICamera
// webcam.showImage is "Showing video"
// webcam.address is "192.168.0.200"
// webcam.reportStatus is "working"
 
import com.atomicscala.AtomicTest._

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

val webcam = new WIFICamera
webcam.showImage is "Showing video"
webcam.address is "192.168.0.200"
webcam.reportStatus is "working"