/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gmail.victor.kampus.maven_bungaefektif;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author victo
 */
public class bungaEfektif {

    public static void main(String[] args) {
        Pinjaman rent = new Pinjaman();
        List<classAngsuran> angsuran = new ArrayList();
        
        Scanner sn = new Scanner(System.in);

        System.out.print("Masukan Besar Pinjaman : ");
        rent.setPinjam(sn.nextLong());
        System.out.print("Masukan Besar Bunga    : ");
        rent.setBunga(sn.nextInt());
        System.out.print("Masukan Banyak Angsuran: ");
        rent.setKali(sn.nextInt());

        rent.membuatNol();
        rent.angsuranPokokPerbulan();
        System.out.println("\n"
                + "======================================================================================================================");
        System.out.println("| Angsuran ke- | Saldo Angsuran     | Besar Angsuran          |     Bunga                 |    Jumlah Angsuran  |");
        System.out.println("=================================================================================================================");
        float bungaTotal = 0;
        float angsuranTotal = 0;
        float jumlahTotal = 0;
        for (rent.i = 1; rent.i <= rent.Kali; rent.i++) {
            classAngsuran angsur = new classAngsuran();
            if (rent.i == 1) {

            } else {

                rent.inSisa();
            }
            
            rent.bungaPerbulan();
            rent.jumlahAngsuran();
            rent.totalAngsuran();

            angsuranTotal = rent.getAngsuranTotal() ;
            System.out.println(rent.getAngsuranBulan());
            bungaTotal= bungaTotal + rent.getBungaBulan();
            jumlahTotal = jumlahTotal + rent.getAngsuran();
            
            angsur.setBulan(rent.getI());
            angsur.setSaldoAngsuran(rent.getSisa());
            angsur.setBunga(rent.getBungaBulan());
            angsur.setTotalBunga(bungaTotal);
            angsur.setPokokAngsuran(rent.getAngsuranBulan());
            angsur.setTotalAngsuran(bungaTotal);
            angsur.setJumlahAngsuran(rent.getAngsuran());
            angsur.setTotalAngsuran(rent.getAngsuranTotal());
            angsuran.add(angsur);
           
        }
        
        for (classAngsuran ang : angsuran) {
            System.out.println("|      " + ang.getBulan() + " |   Rp. " + (long) ang.getSaldoAngsuran() + "  |   Rp. " + ang.getPokokAngsuran() + "                 | "
                    + "Rp.  " + ang.getBunga() + "             |   Rp." + ang.getJumlahAngsuran() + " |");

            System.out.println("=============================================================================================================");
        }
        System.out.println("|  Jumlah |                 |   Rp. " + (long) angsuranTotal + "                 | "
                + "Rp.  " + +(long) bungaTotal + "             |   Rp." + (long) angsuranTotal + " |");
        System.out.println("=============================================================================================================");

    }
}
