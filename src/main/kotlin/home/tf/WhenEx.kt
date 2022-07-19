package home.tf

fun main(){
    lateinit var someText: String
    fun prt(){
        someText = "abc"
        println(someText.length)
    }
    prt()
}