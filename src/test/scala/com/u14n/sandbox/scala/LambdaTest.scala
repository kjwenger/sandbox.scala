package com.u14n.sandbox.scala

import org.junit.Test
import org.junit.Assert._
import java.util.ArrayList
import java.util.Arrays
import java.util.stream.Collectors

class LambdaTest {

  @Test
  def shouldStreamMap() {
    assertEquals(Arrays.asList(2, 4, 6, 8), Arrays.asList(1, 2, 3, 4)
        .stream()
//        .map((e: Int) => e * 2)
        .map(_ * 2)
        .collect(Collectors.toList())
      )
  }

  @Test
  def shouldStreamMapFilterFindFirst() {
    assertEquals(4, Arrays.asList(1, 2, 3, 4)
        .stream()
//        .filter((e: Int) => e == 4)
        .filter(_ == 4)
        .findFirst()
        .get()
      )
  }

//  @Test
//  def shouldStreamMapReduce() {
//    assertEquals(20, Arrays.asList(1, 2, 3, 4)
//        .stream()
//        .map((e: Int) => e * 2)
////        .reduce(0, (c, e: Int) => e)
////        .reduce(0, (c, e: Int) => c + e))
//        .reduce(0, {(c, e: Int) => c + e})
////        .reduce(0, _ + _)
////        .reduce(0, _)
//      )
//  }

}