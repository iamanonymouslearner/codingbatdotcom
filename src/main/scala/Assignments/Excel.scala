import java.io.{File, FileOutputStream}
import java.util.Calendar

import com.itextpdf.text._
import _root_.Utilities.Helper
import org.apache.poi.xssf.usermodel.XSSFWorkbook
import com.itextpdf.text.pdf.PdfWriter
import com.itextpdf.text.pdf.PdfPTable
import com.itextpdf.text.pdf.PdfPCell
import org.apache.poi.openxml4j.opc.OPCPackage
import com.itextpdf.text.PageSize
import com.itextpdf.text.BaseColor
import com.itextpdf.text.Font.FontFamily
import com.itextpdf.text.Element

object Excel extends App
{
  var success : Boolean = false

  //Get year, Month and day
  val today = Helper.GetCurrentdate();

  //Call the function to generate student records based on size
  print("How many Student Records needs to be generated :")
  val noOfRecords  = scala.io.StdIn.readInt()

  //Create n number of student records based on user input and print the size
  val StudentRecords = Helper.CreateStudentRecords(noOfRecords)
  println(s"No Of Student Records Generated : ${StudentRecords.keySet.size}")

  //Create new Spreadsheet workbook, name the sheet name
  val workbook = new XSSFWorkbook
  val spreadsheet = workbook.createSheet("Student Info")

  //Initialize row and column id
  var rowid :Int = -1
  var cellid : Int = -1

  //Write headers as first row
  val row = spreadsheet.createRow {rowid += 1; rowid}
  StudentRecords.get(0).foreach { Values =>
    Values.foreach { value =>
      val cell = row.createCell {cellid += 1; cellid}
      cell.setCellValue(value)
    }
  }

  //Write all records to excel except header
  StudentRecords.keySet.filter(_!=0) .foreach {key=>
    val row = spreadsheet.createRow {rowid += 1; rowid}
    cellid = -1
    StudentRecords.get(key).foreach { Values =>
      Values.foreach{value=>
        val cell = row.createCell {cellid += 1; cellid}
        cell.setCellValue(value)
      }
    }
    val out = new FileOutputStream(new File( System.getProperty("user.dir")+"/StudentsRecords_"+today+".xlsx"))
    workbook.write(out)
  }
  //Close the workbook
  workbook.close()
  println("Data Exported to Excel successfully!!!")

  //Open xlsx document and get the sheet 'Student Info'
  val input_document = OPCPackage.open(new File(System.getProperty("user.dir")+"/StudentsRecords_"+today+".xlsx"))
  val my_xls_workbook = new XSSFWorkbook(input_document)
  val my_worksheet = my_xls_workbook.getSheetAt(0)
  val rowIterator = my_worksheet.iterator

  //Create new pdf document and open
  var xls_to_pdf = new Document(PageSize.A4, 2f, 2f, 2f, 2f)
  PdfWriter.getInstance(xls_to_pdf,new FileOutputStream("StudentsRecords_"+today+".pdf"))
  xls_to_pdf.open()

  //Create 8 columns as we know how many columns required.
  var my_table = new PdfPTable(8)

  //Table properties
  var columnWidths = Array[Float](25f, 28f, 25f, 25f, 25f, 25f, 25f, 25f )
  my_table.setWidths(columnWidths)
  var font = new Font(FontFamily.HELVETICA, 8, Font.BOLD, BaseColor.BLACK)

  //Iterate all rows and add to table then finally add the table to pdf file pointer
  var table_cell = new PdfPCell
  while(rowIterator.hasNext)
  {
    val Currentrow = rowIterator.next()
    val cellIterator = Currentrow.cellIterator()
    while(cellIterator.hasNext)
    {
      val Currentcell = cellIterator.next
      table_cell = new PdfPCell(new Phrase(Currentcell.getStringCellValue,font))
      table_cell.setHorizontalAlignment(Element.ALIGN_CENTER)
      my_table.addCell(table_cell)
    }
  }

  //Write to pdf
  xls_to_pdf.add(new Paragraph("STUDENT RECORDS",FontFactory.getFont(FontFactory.TIMES_BOLD,18,Font.BOLDITALIC)))
  xls_to_pdf.add(new Paragraph(Calendar.getInstance.getTime.toString,FontFactory.getFont(FontFactory.TIMES,10,Font.NORMAL)))
  xls_to_pdf.add(new Phrase("----------------------------------------------------------------------------------------------------------------------------------"))
  xls_to_pdf.add(Chunk.NEWLINE)
  xls_to_pdf.add(my_table)
  xls_to_pdf.close()
  input_document.close()
  println("pdf Created successfully for all students")

  //Show the student ids to user
  StudentRecords.keySet.filter(_!=0).foreach(println)
  print("Enter Student Id to generate individual pdf:")
  val StudentId  = scala.io.StdIn.readInt()
  if(StudentRecords.contains(StudentId))
  {
    //Create new pdf document and open
    xls_to_pdf = new Document(PageSize.A4, 2f, 2f, 2f, 2f)
    PdfWriter.getInstance(xls_to_pdf,new FileOutputStream(StudentId+".pdf"))
    xls_to_pdf.open()

    my_table = new PdfPTable(2)
    var Status_cell = new PdfPCell
    var Index : Int = 0

    StudentRecords.get(StudentId).foreach{Values=>Values.foreach{Value=>
      table_cell = new PdfPCell(new Phrase(Value,font))
      table_cell.setHorizontalAlignment(Element.ALIGN_CENTER)
      my_table.addCell(StudentRecords.get(0).get.toList.lift(Index).get)

      if(Value.equals("PASS"))
      {
        Status_cell = new PdfPCell(new Phrase(Value,font))
        Status_cell.setHorizontalAlignment(Element.ALIGN_CENTER)
        Status_cell.setBackgroundColor(BaseColor.GREEN)
        my_table.addCell(Status_cell)
        success = true
      }
      else if(Value.equals("FAIL"))
      {
        Status_cell = new PdfPCell(new Phrase(Value,font))
        Status_cell.setHorizontalAlignment(Element.ALIGN_CENTER)
        Status_cell.setBackgroundColor(BaseColor.RED)
        my_table.addCell(Status_cell)
        success = true
      }
      my_table.addCell(Value)

      Index += 1
    }
    }
    xls_to_pdf.add(new Paragraph("STUDENT "+StudentId+" RECORD",FontFactory.getFont(FontFactory.TIMES_BOLD,18,Font.BOLDITALIC)))
    xls_to_pdf.add(new Paragraph(Calendar.getInstance.getTime.toString,FontFactory.getFont(FontFactory.TIMES,10,Font.NORMAL)))
    xls_to_pdf.add(new Phrase("----------------------------------------------------------------------------------------------------------------------------------"))
    xls_to_pdf.add(Chunk.NEWLINE)
    xls_to_pdf.add(my_table)
    xls_to_pdf.close()

    println("pdf Created successfully for all students")

  }
  else
    println("Student Record Not Found")
}

