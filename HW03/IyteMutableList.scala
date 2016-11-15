class IyteMutableList{
	class Node(var data: Int, var next: Node, var prev: Node)
	private var head:Node = null
	private var tail:Node = null

	def add(x:Int):Unit = {
		if(head == null){
			head = new Node(x, null, null)
			tail = head
		}
		else{
			tail.next = new Node(x, null, tail)
			
			tail = tail.next
		}
	}

	override def toString(): String = {
	var temp:Node = head
    var result:String = ""
    
    	while(temp != null){
    		result += temp.data + ","
			temp = temp.next
    	}
    	result.substring(0, result.length-1)
  	}

}

object IyteMutableList{
	def apply() = new IyteMutableList()
}
