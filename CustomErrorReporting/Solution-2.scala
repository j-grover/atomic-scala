// Solution-2.scala

// 2. Modify TicTacToe.scala from Summary 2 to use Success and Fail.   

import com.atomicscala.AtomicTest._
import com.atomicscala.reporterr.Fail
import util.{Success, Failure}

class Cell {
  var entry = ' '
  def set(e:Char) = {
    if(entry==' ' && (e=='X' || e=='O')) {
      entry = e
      Success("successful move")
    } else
      Fail("invalid move")
  }
}

class Grid {
  val cells = Vector(
    Vector(new Cell, new Cell, new Cell),
    Vector(new Cell, new Cell, new Cell),
    Vector(new Cell, new Cell, new Cell)
  )
  def play(e:Char, x:Int, y:Int) = {
    if(x < 0 || x > 2 || y < 0 || y > 2)
      Fail("invalid move")
    else
      cells(x)(y).set(e)
  }
}

val grid = new Grid
grid.play('X', 1, 1) is "Success(successful move)"
grid.play('X', 1, 1) is "Failure(invalid move)"
grid.play('O', 1, 3) is "Failure(invalid move)"