object Q2 extends App{
  val getWordLength = (word: String) => word.length

  val calculateSum = (a: Int, b: Int) => a + b

  println("Enter list of words, separated with comma: ")
  val words = scala.io.StdIn.readLine().split(",").toList

  /* list word lengths */
  val wordLengths = words.map(getWordLength);

  /* calculate sum */
  val sum = wordLengths.reduce(calculateSum)

  println("Total count of letter occurrences: " + sum)
}
