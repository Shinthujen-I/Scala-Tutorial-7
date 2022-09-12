import scala.io.StdIn.readInt

object  Question {
    class Account(x: Int) {

    var balance = x

    def transfer(a: Account, x: Int) =
        this.balance = this.balance - x
        a.balance = a.balance + x


}
    def main(args: Array[String]): Unit = {

        var x = new Account(3000)
        var y = new Account(4000)

        x.transfer(y,1000);
        println(x.balance)


    }
}