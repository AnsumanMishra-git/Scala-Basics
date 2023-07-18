import scala.io.StdIn._

object w8_a1 {
  def main(args: Array[String]){
	    val N:Int = readInt()
	    val bills = readLine.split(" ").map(_.toDouble)
	    var count = 0
	    
	    for(bill <- bills){
	      if(Math.floor(Math.sqrt(bill))==Math.sqrt(bill)){
	        count=count+1
	      }
	    }
	    println(count)
	}                   
}
