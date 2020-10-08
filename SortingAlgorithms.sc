val random = scala.util.Random

def quicksort (xs: Array[Int]): Array[Int] = {
    if(xs.length <= 1) xs
    else {
      val pivot = xs(random.nextInt(xs.length))
      Array.concat(
        quicksort(xs filter pivot.>),
        xs filter pivot.==,
        quicksort(xs filter pivot.<)
      )
    }
  }

def bubblesort(xs: Array[Int]): Array[Int] = {
  val wasChange =
    for{
      i <- 1 until xs.length
  } yield{
    if(xs(i-1) > xs(i)){
      val tmp = xs(i)
      xs(i) = xs(i - 1)
      xs(i - 1) = tmp
      true
    }
      else false
  }
  if(wasChange.reduce(_ || _)) bubblesort(xs)
  else xs
}



var lista0 = Array(5, 2, 4, 10, 20, 1, 8, 15, 7)
var lista1 = Array(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
var lista2 = Array(10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0)
var lista3 = Array(-10, 5, 4, 0, -20, 1)
var lista4 = Array(0, -1, -2, -3, -4, -5, -6)
var lista5 = Array(-6, -5, -4, -3, -2, -1, 0)
var lista6 = Array(2.2, 1.1, 0, 5.1, 6.3)
var lista7 = Array("4", "3", "2", "1")
var lista8 = Array()

val quickList0 = quicksort(lista0)
val quickList1 = quicksort(lista1)
val quickList2 = quicksort(lista2)
val quickList3 = quicksort(lista3)
val quickList4 = quicksort(lista4)
val quickList5 = quicksort(lista5)
// val quickList6 = quicksort(lista6) - nie kompiluje się
// val quickList7 = quicksort(lista7) - nie kompiluje się
// val quickList8 = quicksort(lista8) - nie kompiluje się

val bubbleList0 = bubblesort(lista0)
val bubbleList1 = bubblesort(lista1)
val bubbleList2 = bubblesort(lista2)
val bubbleList3 = bubblesort(lista3)
val bubbleList4 = bubblesort(lista4)
val bubbleList5 = bubblesort(lista5)
// val bubbleList6 = bubblesort(lista6) - nie kompiluje się
// val bubbleList7 = bubblesort(lista7) - nie kompiluje się
// val bubbleList8 = bubblesort(lista8) - nie kompiluje się
