// Solution-4.scala

// 4. Map keys must be distinct values. Create a Map with keys for the
// following languages: English, French, Spanish, German, and
// Chinese. What happens when you try to add Turkish? 

import com.atomicscala.AtomicTest._

val m = Map("English" -> "",
            "French" -> "",
            "Spanish" -> "",
            "German" -> "",
            "Chinese" -> "")

val m2 = m + ("Turkish" -> "")
m2.contains("Turkish") is true