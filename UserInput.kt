fun main() {
    println("Please type your name and hit Enter.")
    // Write your code below
    
    var myName = readLine()
    println("Your name is $myName!")
  
  kotlinc MyFile.kt -include-runtime -d MyFile.jar
  }