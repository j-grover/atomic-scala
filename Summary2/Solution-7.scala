// Solution-7.scala

// 7. Add a method to TicTacToe.scala that displays the game board
// (hint: use a for loop within a for loop). Call this method
// automatically for each move. 

// TicTacToe.scala
import com.atomicscala.AtomicTest._

class Cell {
  var entry = ' '
  def set(e:Char):String = {
    if(entry==' ' && (e=='X' || e=='O')) {
      entry = e
      "successful move"
    } else
      "invalid move"
  }
}

class Grid {
  val cells = Vector(
    Vector(new Cell, new Cell, new Cell),
    Vector(new Cell, new Cell, new Cell),
    Vector(new Cell, new Cell, new Cell)
  )
  def play(e:Char, x:Int, y:Int):String = {
    val res = {
      if(x < 0 || x > 2 || y < 0 || y > 2)
        "invalid move"
      else
        cells(x)(y).set(e)
    }
    display()
    res
  }
  def display():Unit = {
    for (i <- cells) {
      for (j <- i) {
        print(j.entry + " ")
      }
      println()
    }
  }
}

val grid = new Grid
grid.play('X', 1, 1) is "successful move"
grid.play('X', 1, 1) is "invalid move"
grid.play('O', 1, 3) is "invalid move"
grid.play('O', 0, 0) is "successful move"
grid.play('X', 2, 2) is "successful move"