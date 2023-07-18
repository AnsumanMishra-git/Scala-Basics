
import scala.io.StdIn._

object w8_a3 {
  def main(args: Array[String]){
	    val str:String = readLine()
	    val arr = str.split(" ").map(s=>s.reverse)
	    val s1 = str.reverse
	    val s2 = arr.mkString(" ")
	    val temp=str.split(" ").reverse
	    val s3 = temp.mkString(" ")
	    println(s1)
	    println(s2)
      println(s3)
	}                   
}
