package OOP

class BankAccount(){
    private var balance = 0.00
    fun deposit(amount: Double){
        this.balance += amount
    }
    fun withdraw(amount : Double){
        if (balance>amount) balance-=amount
        else println("Amount is greater than balance")
    }
    fun checkBal(): Double {
        return this.balance
    }
}

fun main() {
    val Shanu = BankAccount()
    val Pratyusha = BankAccount()
    Shanu.deposit(20000.7899)
    Pratyusha.deposit(70000.897)
    println(Shanu.checkBal())
    println(Pratyusha.checkBal())
    Pratyusha.withdraw(200.9)
    Shanu.withdraw(30000.0)
    println(Pratyusha.checkBal())
    println(Shanu.checkBal())
}