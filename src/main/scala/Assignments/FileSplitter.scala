package Assignments

import java.io.{File, FileNotFoundException, PrintWriter}

import Utilities.Helper

object FileSplitter
{
   def SplitFiles(basePath : String, batchSize : Int) : Unit =
   {
     try
     {
       //Get all the files from the folders and sub folder
       val fileslist = Helper.GetFileList(System.getProperty("user.dir")+"/Inputs/")
       fileslist.filter(!_.contains(".DS_Store")) foreach(println(_))
       //Iterate all the files, read each files and store every batch in to
       //new seperate file
       fileslist.filter(!_.contains(".DS_Store")) foreach { eachFile =>
         //Get the file name5
         val fileName = Helper.GetFileNameFromPath(eachFile)
         val bufferedSource = scala.io.Source.fromFile(eachFile)
         val lines = bufferedSource.getLines()
         lines.grouped(batchSize).zipWithIndex.foreach{lists=>
           val outputfileName = System.getProperty("user.dir")+"/outputs/"+fileName(1)+"/"+fileName(0).split("\\.")(0)+"_part_000"+(lists._2+1)+".csv"
           val outFile = new File(outputfileName)
           outFile.getParentFile.mkdirs()
           val out = new PrintWriter(outFile)
           lists._1.foreach{eachitem=>
             out.write(eachitem+"\n")
           }
           out.close()
         }
         bufferedSource.close()
       }
     }
     catch
     {
       case anf : ArrayIndexOutOfBoundsException => println("Array out of bound exception occurred")
       case fnf : FileNotFoundException => println("File not found exception occurred")
       case _ : Exception => println("Exception Occurred in setFilePaths")
     }
   }

   def main(args :Array[String]) : Unit =
   {
      val CurrentDirectory = Helper.GetCurrentDirectory()
      println("Enter the batch Size :")
      val batchSize = scala.io.StdIn.readInt()
      SplitFiles(CurrentDirectory+"/Inputs/",batchSize)

   }

}
