import scala.io.StdIn.readInt

object  Question {
    class Rational(x: Int, y: Int) {

    // define a greatest common divisor method we can use to simplify rationals
    private def gcd(a: Int, b: Int): Int = Math.abs(if (b == 0) a else gcd(b, a % b))

    val g = gcd(x, y)

    val numer = x / g
    val denom = y / g


    def neg = new Rational(-numer, denom)
    def unary_- : Rational = neg

}
    def main(args: Array[String]): Unit = {

        val A = new Rational(1,3)
        println(A.numer + "/" + A.denom)

        val B = A.neg
        println(B.numer + "/" + B.denom)

        val C = -A
        println(C.numer + "/" + C.denom)

    }
}