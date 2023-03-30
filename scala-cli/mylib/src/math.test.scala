//> using dep "org.scalameta::munit::1.0.0-M7"

package com.example.mylib

// For more information on writing tests, see
// https://scalameta.org/munit/docs/getting-started.html
class MathTest extends munit.FunSuite:
  test("adds function works on positive integers") {
    assertEquals(add(2, 2), 4)
  }
