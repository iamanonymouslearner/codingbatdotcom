package Strings

object EndsLy extends App
{
   def endsLy(a:String):Boolean=
   {
    // if(a.endsWith("ly")) true
    // else false
     if(a.length > 1) s"${a.init.last}${a.last}".equals("ly")
     else false
   }
}
