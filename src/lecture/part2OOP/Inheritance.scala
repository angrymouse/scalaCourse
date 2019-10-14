package lecture.part2OOP

object Inheritance extends App {
  class Animal(name: String, age: Int) {
    def eat() = println("glup")

    def this(name: String) = this(name, 0)
  }

  class Cat(name: String, age: Int) extends Animal(name) {
    override def eat() = println("chomp chomp")
  }

  val cat = new Cat("lilith", 3);
  cat.eat();
}
