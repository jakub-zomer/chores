package cz.zomer.chores

fun main(){
    val matous = ChoresService()
    val matousDuties = matous.kidsWork(8)
    println("Matous`s duties are:")
    println("$matousDuties")

    val krystof = ChoresService()
    val krystofDuties = krystof.kidsWork(5)
    println("Krystof`s dutis are:")
    println("$krystofDuties")

    val dad = ChoresService()
    val dadDuties = dad.kidsWork(40 )
    println("Dad`s duties are:")
    println("$dadDuties")

}