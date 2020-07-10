// Solution-8.scala

// 8. Add a method to TicTacToe.scala that determines if there is a
// winner or if the game is a draw. Call this method automatically for
// each move. 

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
  var entryCount = 0
  def play(e:Char, x:Int, y:Int):String = {
    val res = {
      if(x < 0 || x > 2 || y < 0 || y > 2)
        "invalid move"
      else
        cells(x)(y).set(e)
    }
    display()
    if (winner()) {
      println("There is a winner")
    }
    else {
     println("No winner yet")
    }
    res
  }
  def display():Unit = {
    for(i <- cells) {
      for(j <- i) {
        print(j.entry + " ")
      }
      println()
    }
  }
  def winner():Boolean = {
    def win(c1: Cell, c2: Cell, c3: Cell):Boolean = {
        if ((c1.entry == c2.entry && c2.entry == c3.entry) && c1.entry != ' ')
            true
        else
            false
    }
    for (row <- cells)
      if (win(row(0), row(1), row(2))) return true
    for (col <- cells.transpose)
      if (win(col(0), col(1), col(2))) return true
    if (win(cells(0)(0), cells(1)(1), cells(2)(2))) return true
    if (win(cells(0)(2), cells(1)(1), cells(2)(0))) return true
    return false
  }
}

val grid = new Grid
grid.play('X', 0, 0)
grid.play('X', 0, 1)
grid.play('X', 0, 2)
grid.winner() is true

val grid2 = new Grid
grid2.play('X', 0, 1)
grid2.play('X', 1, 1)
grid2.play('X', 2, 1)
grid2.winner() is true

val grid3 = new Grid
grid3.play('X', 0, 0)
grid3.play('X', 1, 1)
grid3.play('X', 2, 2)
grid3.winner() is true

val grid4 = new Grid
grid4.play('X', 0, 2)
grid4.play('X', 1, 1)
grid4.play('X', 2, 0)
grid4.winner() is true

val grid5 = new Grid
grid5.play('X', 0, 2)
grid5.play('O', 1, 1)
grid5.play('X', 2, 0)
grid5.winner() is false

val grid6 = new Grid
grid6.play('O', 0, 0)
grid6.play('O', 0, 1)
grid6.play('O', 0, 2)
grid6.winner() is true