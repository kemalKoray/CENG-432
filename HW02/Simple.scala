

object Simple extends App {
val numbers = Array(10, 25,30);

numbers.foreach((number : Int) => 
	if(number % 2 == 0)
		println(number * 2)
	else
		println(number*3))
}
