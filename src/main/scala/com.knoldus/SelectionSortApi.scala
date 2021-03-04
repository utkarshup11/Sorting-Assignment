package com.knoldus

import scala.io.StdIn.readInt
import scala.collection.immutable.List

object SelectionSortApi
{
  def main(args: Array[String]): Unit = {

    println("Enter all the 6 elements of list ")
    val inputList = List.fill(6)
    {
      readInt()
    }

    println("List after sorting using selection sort ...")
    val sort =new  SelectionSortImpl()
    println(sort.selectionSort(inputList))
  }

}
