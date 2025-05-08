package org.example
import org.jsoup.Jsoup
import org.jsoup.nodes.Document

fun main() {
    val doc: Document = Jsoup.connect("https://mybook.ru/author/duglas-adams/avtostopom-po-galaktike-restoran-u-konca-vselennoj/citations/").get()
    val phrases = doc.select("div.sc-2aegk7-2.bzpNIu")
    var number = 1
    for (i in phrases) {
        val phrase = i.select("div").first()?.text()
        println("$number - $phrase")
        number++
    }
//    val userId: Int = 4318095
//    val doc_2: Document = Jsoup.connect("https://www.aoe2insights.com/user/${userId}").get()
//    val nickName = doc_2.select("h1.h4.m-0 strong").first()?.text()
//    val ratingPlayer = doc_2.select("div.m-0 small").first()?.text()
//    println("Никнейм игрока: $nickName")
//    println("Рейтинг игрока: $ratingPlayer")
}