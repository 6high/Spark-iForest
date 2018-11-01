object Test {
  def main(args: Array[String]): Unit = {
    val arr = Array.tabulate(10)(i => i*2);
    arr.foreach(println)
  }
}
