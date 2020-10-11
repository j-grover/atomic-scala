// Solution-3.scala

// 3. Using the techniques shown in EitherMap.scala, start with the
// range ‘a’ to ‘z’ and divide it into vowels and consonants. Print the
// divided results. Satisfy the following test:
// letters is "Vector(Left(a), Right(b)," +
// "Right(c), Right(d), Left(e), Right(f)," +
// "Right(g), Right(h), Left(i), Right(j)," +
// "Right(k), Right(l), Right(m), Right(n)," +
// "Left(o), Right(p), Right(q), Right(r)," +
// "Right(s), Right(t), Left(u), Right(v)," +
// "Right(w), Right(x), Right(y), Right(z))"

import com.atomicscala.AtomicTest._

var letters = 'a' to 'z' map {
    case l if List('a', 'e', 'i', 'o', 'u').contains(l) => Left(l)
    case l => Right(l)
}

letters is "Vector(Left(a), Right(b)," +
" Right(c), Right(d), Left(e), Right(f)," +
" Right(g), Right(h), Left(i), Right(j)," +
" Right(k), Right(l), Right(m), Right(n)," +
" Left(o), Right(p), Right(q), Right(r)," +
" Right(s), Right(t), Left(u), Right(v)," +
" Right(w), Right(x), Right(y), Right(z))"