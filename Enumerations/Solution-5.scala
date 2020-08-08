// Solution-5.scala

// 5. Modify TicTacToe.scala from Summary 2 to use enumerations. 

import com.atomicscala.AtomicTest._

object Move extends Enumeration {
    type Move = Value
    val X, O, Empty = Value
}

import Move._

class Cell {
    var entry = Empty
    def set(e: Move): String = {
    if (entry == Empty && (e == X || e == O)) {
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
    def play(e: Move, x: Int, y: Int):String = {
    if (x < 0 || x > 2 || y < 0 || y > 2)
        "invalid move"
    else
        cells(x)(y).set(e)
    }
}

val grid = new Grid
grid.play(X, 1, 1) is "successful move"
grid.play(X, 1, 1) is "invalid move"
grid.play(O, 1, 3) is "invalid move"