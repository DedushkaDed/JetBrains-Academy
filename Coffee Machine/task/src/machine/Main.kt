package machine

import java.util.*

var actualMoney = 550
var actualWater = 400
var actualMilk = 540
var actualBeans = 120
var actualCups = 9

fun main() {
    val scanner = Scanner(System.`in`)

    print("Write action (buy, fill, take, remaining, exit): > ")
    var operation = scanner.next()

    while (operation != "exit") {
        when(operation) {
            "buy" -> buy(scanner)
            "fill" -> fill(scanner)
            "take" -> take()
            "remaining" -> printActual()
        }

        print("Write action (buy, fill, take, remaining, exit): > ")
        operation = scanner.next()
    }
}

fun buy(scanner: Scanner) {
    print("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: > ")
    val operation = scanner.next()
    if (operation != "back") {
        when(operation) {
            "1" -> buyEspresso()
            "2" -> buyLatte()
            "3" -> buyCappuccino()
        }
    }
}

fun buyEspresso() {
    val neededMoney = 4
    val neededWater = 250
    val neededMilk = 0
    val neededBeans = 16
    val neededCups = 1
    checkAndExcecuteBuy(neededMoney, neededWater, neededMilk, neededBeans, neededCups)
}

fun buyLatte() {
    val neededMoney = 7
    val neededWater = 350
    val neededMilk = 75
    val neededBeans = 20
    val neededCups = 1
    checkAndExcecuteBuy(neededMoney, neededWater, neededMilk, neededBeans, neededCups)
}

fun buyCappuccino() {
    val neededMoney = 6
    val neededWater = 200
    val neededMilk = 100
    val neededBeans = 12
    val neededCups = 1
    checkAndExcecuteBuy(neededMoney, neededWater, neededMilk, neededBeans, neededCups)
}

fun checkAndExcecuteBuy(neededMoney: Int, neededWater: Int, neededMilk: Int, neededBeans: Int, neededCups: Int) {
    if (checkBuy(neededWater, neededMilk, neededBeans)) {
        executeBuy(neededMoney, neededWater, neededMilk, neededBeans, neededCups)
    }
}

fun checkBuy(neededWater: Int, neededMilk: Int, neededBeans: Int): Boolean {

    if (actualWater < neededWater) {
        println("Sorry, not enough water!")
        return false
    }

    if (actualMilk < neededMilk) {
        println("Sorry, not enough milk!")
        return false
    }

    if (actualBeans < neededBeans) {
        println("Sorry, not enough coffee beans!")
        return false
    }

    if (actualCups == 0) {
        println("Sorry, not enough disposable cups!")
        return false
    }

    return true
}

fun executeBuy(neededMoney: Int, neededWater: Int, neededMilk: Int, neededBeans: Int, neededCups: Int) {
    actualMoney += neededMoney
    actualWater -= neededWater
    actualMilk -= neededMilk
    actualBeans -= neededBeans
    actualCups -= neededCups
    println("I have enough resources, making you a coffee!")
}

fun fill(scanner: Scanner) {
    print("Write how many ml of water do you want to add: > ")
    actualWater += scanner.nextInt()
    print("Write how many ml of milk do you want to add: > ")
    actualMilk += scanner.nextInt()
    print("Write how many grams of coffee beans do you want to add: > ")
    actualBeans += scanner.nextInt()
    print("Write how many disposable cups of coffee do you want to add: > ")
    actualCups += scanner.nextInt()
}

fun take() {
    println("I gave you $$actualMoney")
    actualMoney = 0
}

fun printActual() {
    println("The coffee machine has:")
    println("$actualWater of water")
    println("$actualMilk of milk")
    println("$actualBeans of coffee beans")
    println("$actualCups of disposable cups")
    println("$$actualMoney of money")
}