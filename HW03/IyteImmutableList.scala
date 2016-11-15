trait IyteImmutableList{
	def add(x : Int) :IyteImmutableList
}

case object Nul extends IyteImmutableList{
	override def add(x : Int) : IyteImmutableList = Immutable(x,Nul)
	override def toString = ""
}

case class Immutable(head: Int, tail: IyteImmutableList) extends IyteImmutableList{
	override def add(x : Int) : IyteImmutableList =  Immutable(x,this)
	override def toString : String= {
		def write(l : IyteImmutableList) : String= l match {
			case Nul => Nul.toString
			case Immutable(x,xs) => x.toString + "," + write(xs)
		}
		 val result=write(this)
		 result.substring(0,result.length-1)
	}
}

object IyteImmutableList{
	def apply() = Nul
}


