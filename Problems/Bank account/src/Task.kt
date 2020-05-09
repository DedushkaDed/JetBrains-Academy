// write the BankAccount class here

class BankAccount {
    var deposited: Long
    var withdrawn: Long
    var balance: Long

    constructor(_deposited:Long,_withdrawn:Long){
        this.deposited = _deposited
        this.withdrawn = _withdrawn
        balance = _deposited - _withdrawn
    }
}