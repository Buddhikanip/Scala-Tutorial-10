object Q1 extends App{
  val toFahrenheit = (cel: Double) => (cel * 9 / 5) + 32

  val calculateAvg = (sum: Double, count: Double) => sum / count


  println("Enter list of temperatures, separated with comma (Celsius): ")
  val temps = scala.io.StdIn.readLine().split(",").map(_.toDouble).toList

  /* celsius to fahrenheit */
  val inFahrenheit = temps.map((cel) => toFahrenheit(cel));
  println(inFahrenheit)

  /* calculate sum */
  val sum = inFahrenheit.reduce((a: Double, b: Double) => a + b)

  println("Average Fahrenheit temperature: " + calculateAvg(sum, temps.length))

}
