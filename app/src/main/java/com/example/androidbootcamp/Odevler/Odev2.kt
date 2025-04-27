package com.example.androidbootcamp.Odevler

fun kotaUcretiHesapla(kullanilanGb: Int): Int {
    val temelUcret = 100
    val kotaLimiti = 50
    val asimUcreti = 4

    return if (kullanilanGb <= kotaLimiti) {
        temelUcret
    } else {
        val asimMiktari = kullanilanGb - kotaLimiti
        temelUcret + (asimMiktari * asimUcreti)
    }

    print("Kullanılan kota miktarını (GB) girin: ")
    val kullanilanGb = readLine()?.toIntOrNull() ?: 0
    println("Kota ücreti: ${kotaUcretiHesapla(kullanilanGb)} ₺")
}


fun faktoriyelHesap(sayi:Int):Int{
    var fakt=1
    for(i in 1..sayi){
        fakt=fakt*1
    }
    return fakt
}

fun icAciToplami(kenarSayisi: Int): Int {
    return (kenarSayisi - 2) * 180
}

fun maasHesapla(gunSayisi: Int): Int {
    val saatlikUcret = 10
    val mesaiSaatlikUcret = 20
    val calismaSaati = gunSayisi * 8

    return if (calismaSaati <= 160) {
        calismaSaati * saatlikUcret
    } else {
        val normalSaatler = 160
        val mesaiSaatleri = calismaSaati - 160
        (normalSaatler * saatlikUcret) + (mesaiSaatleri * mesaiSaatlikUcret)
    }
}
fun dikdörtgenCevre(kısa:Int, uzun:Int): Int {

    val cevre=2*(kısa+uzun)
    return  cevre
}
fun dönüstür(C:Float): Double{
    val F=C*1.8 + 32
    return F
}
fun aHarfHesapla(adet: Int,kelime: String): Int{
    var adet=0
    for(i in 0 until kelime.length){
        if(kelime[i]=='a'){
            adet=adet+1
        }
    }
    return adet
}