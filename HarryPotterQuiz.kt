package testGK

fun main(args: Array<String>) {
    var score : Int = 0
    println("1. What is the name of Head Master of Hogwarts? " +
            "\n\ta. Albus Dumbledore" +
            "\n\tb. Harry Potter")
    var ans = readLine()
    if (ans=="a"){
        println("Correct")
        score = score + 1
    }
    else { println("Wroing Input") }
    println("2. Who raised Harry after the Death of his parents? " +
            "\n\ta. Lily Potter's Sister" +
            "\n\tb. Sirius Black")
     ans = readLine()
    if (ans=="a"){
        println("Correct")
        score = score + 1
    }
    else { println("Wroing Input") }
    println("3. What for does Boggart Acquires in front of Harry? " +
            "\n\ta. Severus Snape" +
            "\n\tb. Dementors")
     ans = readLine()
    if (ans=="b"){
        println("Correct")
        score = score + 1
    }
    else { println("Wroing Input") }
    println("4. On which creature does Madeye uses Cruciatus Curse? " +
            "\n\ta. Spider" +
            "\n\tb. Mole")
     ans = readLine()
    if (ans=="a"){
        println("Correct")
        score = score + 1
    }
    else { println("Wroing Input") }
    println("5. In wich house does Luna Lovegood belongs to? " +
            "\n\ta. Hufflepuff" +
            "\n\tb. Ravenclaw")
     ans = readLine()
    if (ans=="b"){
        println("Correct")
        score = score + 1
    }
    else { println("Wroing Input") }
    println("you scored $score")
}