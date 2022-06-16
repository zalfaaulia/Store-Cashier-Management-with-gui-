package com.mycompany.tugasakhir;

public class Main {
  public static void main(String[] args) {

        Mart myMart = new Mart();
        Pegawai pegawai1 = new Pegawai("Mengsedih","MS234", "Kasir Sedih");
        RotiCapek Roti1 = new RotiCapek("Roti Capek", 5500, "R123", 5,"20122022");
        RotiSbubu Roti2 = new RotiSbubu("Roti Sbubu", 5500, "R124", 5,"20122022");
        KeripikGapapa Keripik1 = new KeripikGapapa("Keripik Gapapa", 10000, "K001", 5);

        //ambil barang
        myMart.addProduct(Roti1);
        myMart.addProduct(Roti2);
        myMart.addProduct(Keripik1);

        Roti1.jual(2); //udah oke
        Roti2.jual(1); //udah oke
        Keripik1.jual(3); //udah oke
        myMart.satSetSatSet();

        //Print Struk
        System.out.println("==============");
        pegawai1.dataPegawai(); //bisa jalan

        //Cek stok roti 
        Roti1.getStok(); //udah oke
        Roti2.getStok();//udah oke
        Keripik1.getStok(); //udah oke
  }
}

//btw ini cuma gini aja kan? nggak ada lain2? mungkin ini dulu? kali aja besok2 dapet ide buat apa gitu??
// ================SAMBAT WKWKW=====================
    //sampe sini dulu aja keknya, besok lanjutin lagi sambil mikir lainnya, waktunya masih 2 minggu(?)//hooh masih lama ini keknya juga dah hampir jadi 😲

//okee selamat istirahat, besok ppw:D ppw aaargh malesss
// siap2 nambah tugas hehe, tubes lagi tubes lagii
//kelar tugas, uas wkwkw nggak bisa napasss, minggu tenang buat healing AOWWKWWK
//yakin pada make buat belajar...:))))mereka belajar??
//mereka voice channel... YA ALLAH MAU IKUT JUGAsama tapi biasane lakii, ayok to yang perempuan tiba2 ikut banyak wkwk biar nggak malu, kemarin malu banget tapi tak tahan2, tapi mosok ujug2 masuk kek apa ya orang baruu😭😭
// lha salwa gabung tiba2 juga, aku ngikut aja😭😭juga ikut ngobrol?? enggak, cuma diem, ntar klo kelar dia keluar wkwk, sering liatawwee
//ho o ya wkwk, asique tinggal mikir abot pbd kek mana😢
//makasih banyak zal btw kamu kerjain semua nya ini😃aaku membantu doa
// makasih banyak jugaa, kamu juga ikut ngerjain yoo
//pbd gak mau pake nota kamu??
//ya pake db itu kan
//yakalau cuman satu nota, kalau notannya 100 ya banyak datanya wkwkw, hoosih ngasal aja, normalisasi emang bisa di siqil? hooh manual, samasamaa
//kalau pake nota kayaknya datanya cuma 1 nggak e?
// wkwkw, keknya 1 nota, trus kalau db nya udah jadi tinggal nambah2 manual daripada nyari nota yang sama😭😭
//oiya, yang normalisasi bikin tabelnya pake excel dulu kan ya? baru pindah ke sikil? kayaknya gabisa deh wkwk, okidi berarti manual di eksel........😃👍
//okesipp makasiih infonyaa
//keknya pake, tapi yang bagian fungsi2 restore segala macem itu gimana? nambah2 data lagi po?
    //horror kali namane, wkwkwkwkw biar gaada yang beli, bangkrutt, biar fokus jadi progremer
    //btw kalau udah capek boleh bubuk lho wkwkw, kan kamu yang habis acaraa kali kamu capek?
//weh wehh lha kamu sama siapa db nya lha vasa? gataw kek kamu i dah sepaket sama vasa ee, aku sama ell, baru ber 2, vasa aku ajak katanya nggak ikut ngerjain tugas akhir whyy awwwe :( gatauu, mungkin gara2 burnout sama kek pas dia bolos2 dia bilang aku gapaham apa2 zal aku sendiri kekny gaikut lagi.. gitu katane
//sama aku juga gapaham. malah bagus dipresent awowkwk. kukira malah mau utbk ulang or gimana, entah kayaknya iya
    //ini ntar jan lupa di apus lhooo wdhjdhjadhjahj, YA ALLAHH WKWKWKW, GHIBAH JULID, tapi aman bukan ghibah yg ngejelekin kok
    // mencari pembenaran ni ceritanya:))) ini ituu khawatir berkedok ghibah ehhh kebalikkkk, WKWKWKWK lha asd sama siapa zal, belom kalo asd kok bisaa emott bisa dwongss 😂😂😂😂😂ohhh gituu giliran bisa langsung ngulti (caranya pencet windows + .) hooo bisaaa
    // asd aku diajak salwa, kamu udah dapet kelompok belom?👨 itu katanya bisa 3 orang nggak to asd? 2 deh keknya always bu roch itu suka angka 2🐱‍🐉, nggak kayak ajaran islam yang suka ganjil:) nahhh, bu nana tu ughtea😃tomboyy loh itu keknya, ho o tapi coba stalker yutup ibunya ughtea sekali wkwkwdi bookmark juga deh keknya apa ya sholawat atao radio islami gitu, HOO RADIO ISLAMII WWKWKWK ya Allah.. emang anak MIPA banget, pak firma tu juga keknya, ada janggut akhi2😃 dengan pak rifqi ustad eee, wooo baru tauuuuuuu wkkwkw, emang anak mipa sholeh2 hoo yaww
    //ini komennya banyak banget weh wkwkwkw, ngelebihin kodenya awokwk, keknya di simpen aja wkwk, ntar pas present pake netbin aja, boleeh 😂😂
    //tapi pak rifqi pulang belum ee
    //pulang dari mana? kan kemarin habis final thomas cup jadi pasangannya kevin sanjaya, halahh padahal mirip pak rifqiii, anuu mohammad ahsan, raket apaa??
    // ini bercanda to? AKU GAK TAU WEH WKWKWKKW MAAP, nama panjangnya siapa e??? aku kemarin nggak nonton jadi gatau pemainnya siapa hwhwhwhw, mohammad ahsan raket? itu keluar raketnya ohh bukan bentar tak kirim wa aku nge ss 😭
    //ya Allah, niat bangettt😭😭😭
    //aku gabisa tidur wkwkw, gatau kepikiran tugas klo tidur jadi kayak dosa. apalagi yang di dc pada mainan my sikil...
    //masukin keranjang


  