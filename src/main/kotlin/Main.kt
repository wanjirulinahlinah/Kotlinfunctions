fun main(args: Array<String>) {
    // Strings concatenation are  concatenated usind addition but you can use dolar sign
 var age = 35
    println("Hello my age is $age")

    //string indexing
  var text = "Banana"
    println(text[0])
    println(text[1])
    println(text[2])
    println(text[3])
      println(text[5])

    //Strings Interporation
    //To find the length of string you need to put youur strings in callibraces

    var firstname = "Linah"
    var surname =  "Wainaina"
    println("Hello $firstname $surname ,How are you .")
    println(" ${firstname.length}")

    //when you have more than two  numbers put them in callibraces
    var s=30
    var r=60
    println("sum is ${30+60}")
    //string comparison

    var str1:String="Linah"
    var str2:String="Agnes"

    if(str1==str2)
        println("same")
    else
            println("not same")



}