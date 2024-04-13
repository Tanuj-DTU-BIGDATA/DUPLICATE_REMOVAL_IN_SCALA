import scala.collection.mutable.ArrayBuffer

object April13 {
  def main(args: Array[String]): Unit = {
    var arr = Array(5,8,1,2,3,2,5,5,6,7,5,6,7,5,6,7,5,6,7)
    var distinct_arr = ArrayBuffer[Int]()


    for( i <- 0 to arr.length -1)
    {
      if( i == 0)
      {
        distinct_arr.append(arr(i))
      }
      else if ( i!=0)
      {
        var count: Int = 0
        for( j <- 0 to distinct_arr.length-1)
        {
          if(distinct_arr(j) == arr(i))
          {
            None
          }
          else if(distinct_arr(j) != arr(i))
          {
            count = count+1
          }

          if(count == distinct_arr.length)
          {
            distinct_arr.append(arr(i))
          }

        }
      }
    }
    for( i <- 0 to distinct_arr.length-1)
    {
      print(distinct_arr(i)+" ")
    }
  }
}





