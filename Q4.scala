import scala.io.StdIn.readInt

object  Question {
    class Account(n: String,x: Double) {

    val name = n
    var balance = x

    def transfer(a: Account, x: Int) =
        this.balance = this.balance - x
        a.balance = a.balance + x


}
    def negativebalance(y: List[Account]) =
        println("\nAccounts with negative balance")
        for(element<-y) 
            if (element.balance < 0)
                println("Name:"+ element.name + " Balance:" + element.balance) 
            
            
        

    def sumofaccounts(y: List[Account]) =
        var sum = 0.0;
        for(element<-y) 
            sum = sum + element.balance

        println("\nTotal Balance is:" + sum) 

    def finalbalance(y: List[Account]) =
        println("\nAccounts and Balances after interest")
        for(element<-y) 
            element.balance = element.balance match {
                case x if element.balance > 0 => element.balance + element.balance*0.05
                case _ => element.balance - element.balance*0.1
            }
            println("Name:"+ element.name + " Balance:" + element.balance) 


    def main(args: Array[String]): Unit = {

        var A1 = new Account("A1",3000)
        var A2 = new Account("A2",-4000)
        var A3 = new Account("A3",2000)
        var A4 = new Account("A4",-1000)
        var A5 = new Account("A5",5000)
        var A6 = new Account("A6",10000)
        var A7 = new Account("A7",-2000)



        val bank = List(A1,A2,A3,A4,A5,A6,A7);

        negativebalance(bank)
        sumofaccounts(bank)
        finalbalance(bank)


    }
}