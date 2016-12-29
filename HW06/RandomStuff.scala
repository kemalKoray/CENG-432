trait RandomStuffTrait {

def transform(list: List[Int], op: (Int) => Int) : List[Int]

def allValid(list: List[Int], op: (Int) => Boolean) : Boolean

def executeWithRetry(retryCount: Int, op: => Int) : Option[Int]

}

object RandomStuff extends RandomStuffTrait {

  def transform(list: List[Int], op: (Int) => Int) : List[Int]={

    var transformList = List[Int]()   
       list.foreach(x => transformList = transformList :+ op(x))
     transformList
  }

  

  def allValid(list: List[Int], op: (Int) => Boolean) : Boolean={
    for (x<- list) {
        if(!op(x)){
          return false
     }
   }
    true
  }

    def executeWithRetry(retryCount: Int, op: => Int): Option[Int] = {
     var i = 1;
    for(i <- 1 to retryCount){
      try{
        var x: Int = op;
        return (Option(x));
     }
      catch{
        case e: Exception => ;
      }
    }

    return None;

    }

}
