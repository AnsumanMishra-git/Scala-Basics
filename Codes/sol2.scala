import scala.io.StdIn._

object w8_a2 {
  def main(args: Array[String]){
	    val ip = readLine.split(" ").map(_.toInt)
	    val N = ip(0)
	    val K = ip(1)
	    val nums = readLine.split(" ").map(_.toInt)
	    var count = 0
	    
	    for(num <- nums){
	      if(num<K){
	        count+=1
	      }
	    }
	    println(count)
	}                   
}
