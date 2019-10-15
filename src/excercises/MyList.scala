package excercises

abstract class MyList {
  class Element()
  val element: Int
  val next: MyList
  def head() = this.element
  def tail() = next

}
