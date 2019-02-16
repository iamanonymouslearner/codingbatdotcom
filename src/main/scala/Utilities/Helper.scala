package Utilities

import java.io.File
import java.util.Calendar

import scala.util.Random
import scala.collection.mutable.{HashMap, LinkedHashSet, MultiMap, Set}

trait OrderedMultiMap[K, V] extends scala.collection.mutable.MultiMap[K, V] {
  override def makeSet: scala.collection.mutable.Set[V] = new scala.collection.mutable.LinkedHashSet[V]
}

object Helper
{
  var fileList : List[String] = List()

  /*Get the file name from the path */
  def GetFileNameFromPath(path : String) : Array[String] =
  {
    var fileName : Array[String] = Array.empty
    if(path != null || !path.isEmpty)
    {
       val pathlist = path.split("/")
       fileName = pathlist.reverse
    }
    fileName
  }
  /*Get the list of files from sub folders */
  def GetFileList(Directory : String) : List[String] =
  {
     val fp = new File(Directory)
     val dirList = fp.listFiles()
     for(file<-dirList)
     {
         if(file.isFile)
           fileList = file.getAbsolutePath :: fileList
         else
           GetFileList(file.getAbsolutePath)
     }
    fileList
  }


  /* Get the current directory */
  def GetCurrentDirectory(unit: Unit) : String =
  {
    val CurrentDirectory = System.getProperty("user.dir")
    CurrentDirectory
  }

  /*Get today date in the format year-month-date */
  def GetCurrentdate(unit: Unit) : String =
  {
    val now = Calendar.getInstance()
    val month = now.get(Calendar.MONTH)+1
    val CurrentDate = now.get(Calendar.YEAR)+"-"+month+"-"+now.get(Calendar.DATE)
    CurrentDate
  }

  /* Purpose of this function is to get the random number based on min and max */
  def GetRandomNumber(minInclusive : Int, maxExclusive : Int) : Int =
  {
    val rand = new Random()
    minInclusive + rand.nextInt((maxExclusive-minInclusive)+1)
  }
  /* Purpose of this function is to get the random String based on length*/
  def GetRandomString(length : Int) : String =
  {
    Random.alphanumeric.take(10).mkString
  }

  //Latest
  def CreateStudentRecords(NoOfRecords : Int) : MultiMap[Int,String] =
  {
    val StudentsRecords = new HashMap[Int,Set[String]] with OrderedMultiMap[Int,String]
    var i : Int = 0

    //Excel Header information
    StudentsRecords.addBinding(0,"STUDENT ID")
    StudentsRecords.addBinding(0,"STUDENT NAME")
    StudentsRecords.addBinding(0,"PHYSICS MARKS")
    StudentsRecords.addBinding(0,"CHEMISTRY MARKS")
    StudentsRecords.addBinding(0,"MATHS MARKS")
    StudentsRecords.addBinding(0,"TOTAL")
    StudentsRecords.addBinding(0,"AVERAGE")
    StudentsRecords.addBinding(0,"STATUS")

    while(i < NoOfRecords)
    {
      val StudentId = GetRandomNumber(1000, 2000)
      if(!StudentsRecords.contains(StudentId))
      {
        val physicsMarks   = GetRandomNumber(50, 60)
        val ChemistryMarks = GetRandomNumber(70, 90)
        val MathsMarks     = GetRandomNumber(90, 100)

        StudentsRecords.addBinding(StudentId,StudentId.toString)
        StudentsRecords.addBinding(StudentId, GetRandomString(5))
        StudentsRecords.addBinding(StudentId, GetRandomNumber(50, 60).toString)
        StudentsRecords.addBinding(StudentId, GetRandomNumber(70, 90).toString)
        StudentsRecords.addBinding(StudentId, GetRandomNumber(20, 50).toString)

        val total = physicsMarks+ChemistryMarks+MathsMarks

        StudentsRecords.addBinding(StudentId,total.toString)
        StudentsRecords.addBinding(StudentId,(total/3).toString)
        if(total/3.toFloat < 80) {
          StudentsRecords.addBinding(StudentId, "FAIL")
        }
        else {
          StudentsRecords.addBinding(StudentId, "PASS")
        }

        i += 1
      }
    }
    StudentsRecords
  }
}
