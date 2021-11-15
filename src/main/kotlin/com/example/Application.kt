package com.example

import org.jsoup.Jsoup
import org.jsoup.nodes.Document
import org.jsoup.parser.Parser
import java.io.File
import java.io.FileInputStream


fun main() {
    val file = File("C:\\Users\\prince.mensah\\Documents\\demo\\xml-demo\\src\\main\\kotlin\\com\\example\\bookdemo.xml")
    val fis = FileInputStream(file)
    val doc: Document = Jsoup.parse(fis, null, "", Parser.xmlParser())

//    val everything = doc.select("bookstore")
//    val everything = doc.getElementsByTag("bookstore")[0].child(0).child(3).text()
//    val firstElement = doc.select("book").first().child(3).text()
//
//    println(firstElement)



















    for (e in doc.select("book")) {
        val bookName = e.select("title").text()
        val bookAuthor = e.select("author").text()
        val price = e.select("price").text()

        println("title: $bookName   author: $bookAuthor    price: $price")
    }

//    val x = doc.getElementsByTag("title")[0].attributes()
//    println(x)

//    val a = doc.select("book")
//    for (node in a)
//    println(a)


//val firstbookAut = doc.getElementsByTag("title")[0]
//    val autTxt = firstbookAut.childNode(0)
////    println(autTxt[0])
//    println(autTxt)


}
