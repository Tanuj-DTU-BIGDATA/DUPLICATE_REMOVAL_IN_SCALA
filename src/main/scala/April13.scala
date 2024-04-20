import scala.collection.mutable.ArrayBuffer
import scala.runtime.Nothing$

object April13 {
  def main(args: Array[String]): Unit = {
    var count = 0
    for( i <- 1 to 100)
      {
        if(i ==2) {
          count = count + 2
          if (count % 2 == 0) {
            print(" " + i + " ")
          }
        }
        else if( i >2 && i%2 == 0)
        {
                count = count+1
                if(count%2 == 0)
                {
                  print(" "+i+" ")
                }
        }


      }
  }
}





