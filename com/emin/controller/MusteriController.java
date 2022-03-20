package com.emin.controller;

import com.emin.repository.entity.Musteri;
import com.emin.services.MusteriService;

import java.util.Scanner;

public class MusteriController {
     private  final MusteriService musteriService;
     Scanner sc=new Scanner(System.in);

     public MusteriController(){
         musteriService=new MusteriService();

     }

     public void MusteriKaydet(){

         System.out.printf("*************************");
         System.out.printf("***** MÜŞTERİ KAYIT *****");
         System.out.printf("*************************");

         Musteri mst =new Musteri();
         System.out.printf("Ad :  ");
         mst.setAd(sc.nextLine());
         System.out.printf("Soyad :  ");
         mst.setSoyad(sc.nextLine());
         System.out.printf("Adres :  ");
         mst.setAdres(sc.nextLine());
         System.out.printf("Telefon :  ");
         mst.setTelefon(sc.nextLine());

         musteriService.save(mst);
         System.out.printf("****  Müşteri Kayıt Edildi  ****");


     }





}
