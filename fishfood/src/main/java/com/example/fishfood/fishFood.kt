package com.example.fishfood



import java.util.*;

fun randomDay():String{
    var day:String=""
    var arr = arrayOf("Monday","Tuesday","Wednesday","Thrusday","Friday","Saturday","Sunday")
    day = arr[Random().nextInt(arr.size)]
    return day
}


fun main(){
    feedingManualForFish()
    randomDay()
}
fun feedingManualForFish(){
    var day:String=randomDay()
    var food=fishfood(day)
    var isChangeWaterNeeded=shouldChangeWater(day)
    println("Today is $day, you need to feed $food")
    println("Change Water : ${if(isChangeWaterNeeded)"is Needed" else "not Needed"}")

}
fun fishfood(day:String):String{
    var food:String=""
    when(day){
        "Monday" -> food="flakes"
        "Tuesday" -> food="redworms"
        "Wednesday" -> food="granuels"
        "Thrusday" -> food="pellets"
        "Friday" -> food="mosquitoes"
        "Saturday" -> food="lettuce"
        "Sunday" -> food="plankton"
    }
    return food
}

fun isHot(temp:Int) = temp>30

fun isDirt(dirt:Int) = dirt > 30

fun isSunday(day:String) = day== "Sunday"


fun shouldChangeWater(day:String ,temp:Int = 22,dirt:Int = 20):Boolean{
    return when{
        isHot(temp) -> true
        isDirt(dirt) -> true
        isSunday(day) -> true
        else -> false

    }
}