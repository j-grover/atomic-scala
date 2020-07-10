// Solution-6.scala

// 6. Add Kelvin temperature units to Temperature.scala (Kelvin is
// Celsius + 273.15). When writing the new code, call the existing
// methods whenever possible.

// Temperature.scala
import com.atomicscala.AtomicTest._

class Temperature {
  var current = 0.0
  var scale = "f"
  def setFahrenheit(now:Double):Unit = {
    current = now
    scale = "f"
  }
  def setCelsius(now:Double):Unit = {
    current = now
    scale = "c"
  }
  def setKelvin(now:Double):Unit = {
    current = now
    scale = "k"
  }
  def getFahrenheit():Double = {
    if(scale == "f")
      current
    else if(scale == "c" || scale == "k")
      getCelsius() * 9.0/5.0 + 32.0
    else
      -1.0
  }
  def getCelsius():Double = {
    if(scale == "c") 
      current
    else if(scale == "f")
      (current - 32.0) * 5.0/9.0
    else
      current - 273.15
  }
  def getKelvin():Double = {
    if(scale == "k")
      current
    else if(scale == "c" || scale == "f")
      getCelsius() + 273.15
    else 
      -1.0
  }
}

val temp = new Temperature

temp.setFahrenheit(98.6)
temp.getFahrenheit() is 98.6
temp.getCelsius is 37.0
temp.getKelvin is 310.15

temp.setCelsius(100.0)
temp.getFahrenheit is 212.0
temp.getKelvin is 373.15

temp.setKelvin(0)
temp.getCelsius is -273.15
temp.getFahrenheit is -459.66999999999996