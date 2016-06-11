package week01.assignment

object Recursion {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
    * Exercise 1
    */
  def pascal(c: Int, r: Int): Int = {
    if (c == 0 || r == c)
      1
    else
      pascal(c - 1, r - 1) + pascal(c, r - 1)
  }

  /**
    * Exercise 2
    */
  def balance(chars: List[Char]): Boolean = {

    def loop(chars: List[Char], counter: Int): Boolean =
      if (counter < 0)
        false
      else if (chars.isEmpty)
        counter == 0
      else if (chars.head == ')')
        loop(chars.tail, counter - 1)
      else if (chars.head == '(')
        loop(chars.tail, counter + 1)
      else
        loop(chars.tail, counter)

    loop(chars, 0)

  }

  /**
    * Exercise 3
    *
    * countChange(M, C): "Todas las posibles combinaciones, con posibles repeticiones, de los elementos de C ('coins')
    * que suman la cantidad dada M ('money')"
    *
    * Entonces, la solución puede plantearse recursivamente de la siguiente manera:
    *
    * countChange = countChange(M, C\{c1}) + countChange(M - c1, C)
    *
    * donde M = 'money' y C = 'coins'.
    *
    * Es decir, la solución es la suma de todas las combinaciones que no contengan la primera moneda de C ('C\{C.head}')
    * más todas las combinaciones que contengan al menos una vez dicha moneda. A su vez, esto último es igual a todas
    * las posibles combinaciones de los elementos de C que suman la cantidad 'M - C.head'
    */
  def countChange(money: Int, coins: List[Int]): Int = {
    if (money < 0 || coins.isEmpty) 0
    else if (money == coins.head) 1 + countChange(money, coins.tail)
    else countChange(money - coins.head, coins) + countChange(money, coins.tail)
  }
}