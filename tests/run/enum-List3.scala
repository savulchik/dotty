enum List[+T] {
  case Cons[T](x: T, xs: List[T])
  case Nil
}
object Test {
  import List._
  val xs = Cons(1, Cons(2, Cons(3, Nil)))
  def main(args: Array[String]) = println(xs)
}

