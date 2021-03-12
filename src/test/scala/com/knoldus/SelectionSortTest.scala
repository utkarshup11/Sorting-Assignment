// Copyright (C) 2011-2012 the original author or authors.
// See the LICENCE.txt file distributed with this work for additional
// information regarding copyright ownership.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at

// http://www.apache.org/licenses/LICENSE-2.0

// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
package com.knoldus

import org.scalatest.flatspec.AnyFlatSpec

class SelectionSortTest extends AnyFlatSpec {

  val selectionSortImpl = new SelectionSortImpl


  // scalastyle:off magic.number


  "input of list having negative numbers " should "be sorted correctly" in
  {
    assert(selectionSortImpl.selectionSort(List(-12,-23,-2 , -45 , -4 ,0)) == List(-45,-23,-12,-4,-2,0))
  }

  "input of list having all numbers are same " should "return same list after sorting " in
  {
    assert(selectionSortImpl.selectionSort(List(2,2,2,2,2,2)) == List(2,2,2,2,2,2))

  }

  "sorting of empty list " should "return empty list" in
  {
    assert(selectionSortImpl.selectionSort(List()) == List())
  }

  //negative test case
  "sorting of s list " should " not be incorrect or in reverse order " in
  {
    assert(selectionSortImpl.selectionSort(List(1,2,8,4)) != List(8,4,2,1))

  }

  "for nil list" should " be return empty list" in
  {
    assert(selectionSortImpl.selectionSort(Nil) == List())
  }


  "when input list already sorted " should "return  same list " in
  {
    assert(selectionSortImpl.selectionSort(List(1,2,3,4))==List(1,2,3,4))

  }

}
