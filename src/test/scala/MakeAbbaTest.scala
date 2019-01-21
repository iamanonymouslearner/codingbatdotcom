import Strings.MakeAbba
import org.scalatest.FunSuite

class MakeAbbaTest extends FunSuite
{
  test("makeAbba(\"Hi\", \"Bye\")")
  {
    assert(MakeAbba.makeabba("Hi", "Bye")=="HiByeByeHi")
  }
  test("makeAbba(\"Yo\", \"Alice\")")
  {
    assert(MakeAbba.makeabba("Yo", "Alice")=="YoAliceAliceYo")
  }
  test("makeAbba(\"What\", \"Up\")")
  {
    assert(MakeAbba.makeabba("What", "Up")=="WhatUpUpWhat")
  }
  test("makeAbba(\"aaa\", \"bbb\")")
  {
    assert(MakeAbba.makeabba("aaa", "bbb")=="aaabbbbbbaaa")
  }
  test("makeAbba(\"x\", \"y\")")
  {
    assert(MakeAbba.makeabba("x", "y")=="xyyx")
  }
  test("makeAbba(\"x\", \"\")")
  {
    assert(MakeAbba.makeabba("x", "")=="xx")
  }
  test("makeAbba(\"\", \"y\")")
  {
    assert(MakeAbba.makeabba("", "y")=="yy")
  }
  test("makeAbba(\"Bo\", \"Ya\")")
  {
    assert(MakeAbba.makeabba("Bo", "Ya")=="BoYaYaBo")
  }
  test("makeAbba(\"Ya\", \"Ya\")")
  {
    assert(MakeAbba.makeabba("Ya", "Ya")=="YaYaYaYa")
  }

}
