class IyteMutableSet(){ 
  case class node(var prev: node, var next:node,var x:Int)
  private var tail:node = null
  
  private var hashTable = new Array[node](100)
  
  private def init(x:Int): node ={
    tail = newNode(null,null,x)
    tail
  }
  
  private def newNode(node1:node , node2:node, x:Int): node = node(node1:node, node2:node ,x)
  
  private def connectNodes( current:node) = {
    tail.next = current
    current.prev = tail
    tail = current
  }
  
def hashFunc(num:Int):Int ={
    var res =  num  % 100
	res
}

def isThere(x:Int):Boolean = {
  var boo = false
  var temp3 = hashTable(hashFunc(x))  
  while(temp3 != null){
      if(x == temp3.x){
        boo = true
      }
      temp3 = temp3.next
    }   
  boo
}

def add(x:Int):Unit= {
  if(isThere(x) == false){
        if(hashTable(hashFunc(x)) == null){
       hashTable(hashFunc(x)) = init(x)     
    }    
    else{
    var temp = hashTable(hashFunc(x))  
    while(temp.next != null){
      temp = temp.next
    }   
    tail = temp    
    connectNodes(newNode(tail,null,x))
    }
  }
 }

def contains(x:Int):Boolean = {
  var boo2 = isThere(x)
  println(boo2)
  boo2
}
 
  override def toString: String = {
    var ctr:Int = 0
     var str = ""
     
    for(ctr <- 0 to 99){
      
      var temp2 = hashTable(hashFunc(i))
     
	  	while(temp2 != null){
		    str += temp2.x + ","
		  	temp2=temp2.next
	  	}	
	  
    }
    	str.toString() 
  }
}

object IyteMutableSet{
 def apply(): IyteMutableList = new IyteMutableList()
 }
