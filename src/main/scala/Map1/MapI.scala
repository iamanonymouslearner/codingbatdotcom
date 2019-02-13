package Map1

import scala.collection.mutable


object MapI extends App
{
  def mapNully(map : mutable.Map[String,String]) : mutable.Map[String,String]  =
  {
    if(map.contains("a"))
    {
       map += ("b"->map("a"))
       map += ("a"->"")
    }
    map
  }

  def MapShare(map : mutable.Map[String,String]) : mutable.Map[String,String] =
  {
    if(map.contains("a"))
    {
       map +=("b"->map("a"))
       map -="c"
    }
    map
  }

  def Mapab(map : mutable.Map[String,String]) : mutable.Map[String,String] =
  {
    if(map.contains("a") && map.contains("b"))
      {
        map += ("ab"->(map("a")+map("b")))
      }
    map
  }

  def Topping1(map:mutable.Map[String,String]) : mutable.Map[String,String] =
  {
    map += ("bread"->"butter")
    if(map.contains("ice cream"))
    {
       map +=("ice cream"->"cherry")
    }
    map
  }

  def Topping2(map:mutable.Map[String,String]) : mutable.Map[String,String] =
  {
    if(map.contains("ice cream"))
    {
      map +=("yogurt"->map("ice cream"))
    }
    if(map.contains("spinach"))
    {
      map +=("spinach"->"nuts")
    }
    map
  }

  def Topping3(map:mutable.Map[String,String]) : mutable.Map[String,String] =
  {
    if(map.contains("potato"))
    {
      map +=("fries"->map("potato"))
    }
    if(map.contains("salad"))
    {
      map +=("spinach"->map("salad"))
    }
    map
  }

  def Mapab2(map:mutable.Map[String,String]) : mutable.Map[String,String] =
  {
    if(map.contains("a") && map.contains("b") && map("a")==map("b"))
    {
       map -= "a"
       map -= "b"
    }
    map
  }

  def Mapab3(map:mutable.Map[String,String]) : mutable.Map[String,String] =
  {
    if(map.contains("a") && !map.contains("b"))
      map += ("b"->map("a"))
    if(!map.contains("a") && map.contains("b"))
      map += ("a"->map("b"))
    map
  }

  def Mapab4(map:mutable.Map[String,String]) : mutable.Map[String,String] = {
    if (map.contains("a") && map.contains("b")) {
      if (map("a").length > map("b").length)
        map += ("c" -> map("a"))
      else if (map("b").length > map("a").length)
        map += ("c" -> map("b"))
      else
        map += ("a" -> "")
      map += ("b" -> "")

    }
    map
  }
}
