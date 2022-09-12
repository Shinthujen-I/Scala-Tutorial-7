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

    def add(r: Rational): Rational =
    new Rational(numer * r.denom + r.numer * denom, denom * r.denom)
    def +(r: Rational): Rational = add(r)

    def sub(r: Rational): Rational = add(r.neg)
    def -(r: Rational): Rational = sub(r)


}
    def main(args: Array[String]): Unit = {

        val x = new Rational(3,4)
        val y = new Rational(5,8)
        val z = new Rational(2,7)

        val hal = x-y
        val res = hal - z 
        println(res.numer + "/" + res.denom)


    }
}