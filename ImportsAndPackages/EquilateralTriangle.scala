package com.atomicscala.pythagorean

import math.sqrt

class EquilateralTriangle {
    def area(side: Double): Double = {
        sqrt(3) / 4 * (side * side)
    }
} 