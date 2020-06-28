// Solution-4.scala

// 4. Create a compound expression that determines whether to do an
// activity. For example, do the running activity if the distance is less
// than 6 miles, the biking activity if the distance is less than 20
// miles, and the swimming activity if the distance is less than 1
// mile. You choose, and set up the compound expression. Test
// against various distances and various activities, and print your
// results. Here’s some code to get you started.
// val distance = 9
// val activity = "running"
// val willDo = // fill this in
// /* Output
// (run 3 times, once for each activity):
// running: true
// walking: false
// biking: true
// */ 

val activity = "running"
// val activity = "biking"
// val activity = "swimming"

val distance = 9

val willDo = {
    if((activity == "running" && distance < 6) ||
       (activity == "biking" && distance < 20) ||
       (activity == "swimming" && distance < 1)) {
           true
       } else false
}

println(activity + ": " + willDo)