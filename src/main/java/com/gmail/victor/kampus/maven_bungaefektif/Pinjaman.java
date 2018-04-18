/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gmail.victor.kampus.maven_bungaefektif;

/**
 *
 * @author victo
 */
public class Pinjaman {

    float Pinjam;
    float Angsuran, AngsuranBulan, AngsuranTotal, bungaBulan;
    float Kali, Bunga, i;
    float Sisa;

    public float getSisa() {
        return Sisa;
    }
    

    public void setPinjam(long Pinjam) {
        this.Pinjam = Pinjam;
        Sisa = Pinjam;
    }

    public float getPinjam() {
        return Pinjam;
    }

    public void setPinjam(float Pinjam) {
        this.Pinjam = Pinjam;
    }

    public float getAngsuran() {
        return Angsuran;
    }

    public void setAngsuran(float Angsuran) {
        this.Angsuran = Angsuran;
    }

    public float getAngsuranBulan() {
        return AngsuranBulan;
    }

    public void setAngsuranBulan(float AngsuranBulan) {
        this.AngsuranBulan = AngsuranBulan;
    }

    public float getAngsuranTotal() {
        return AngsuranTotal;
    }

    public void setAngsuranTotal(float AngsuranTotal) {
        this.AngsuranTotal = AngsuranTotal;
    }

    public float getBungaBulan() {
        return bungaBulan;
    }

    public void setBungaBulan(float bungaBulan) {
        this.bungaBulan = bungaBulan;
    }

    public float getKali() {
        return Kali;
    }

    public void setKali(float Kali) {
        this.Kali = Kali;
    }

    public float getBunga() {
        return Bunga;
    }

    public void setBunga(float Bunga) {
        this.Bunga = Bunga;
    }

    public float getI() {
        return i;
    }

    public void setBunga(int Bunga) {
        this.Bunga = Bunga;

    }

    public void setKali(int Kali) {
        this.Kali = Kali;
    }

    public void membuatNol() {
        AngsuranTotal = 0;
    }

    public void bungaPerbulan() {

        bungaBulan = (float) Sisa * (Bunga / 100) / Kali;

    }

    public void angsuranPokokPerbulan() {
        AngsuranBulan = Pinjam / Kali;
    }

    public void jumlahAngsuran() {
        Angsuran = AngsuranBulan + bungaBulan;
    }

    public void totalAngsuran() {
        AngsuranTotal = AngsuranTotal + Angsuran;
    }

    public void inSisa() {
        Sisa = (long) ((float) Sisa - AngsuranBulan);

    }

    public void PrintScr() {

        membuatNol();
        angsuranPokokPerbulan();
        System.out.println("\n"
                + "======================================================================================================================");
        System.out.println("| Angsuran ke- | Saldo Angsuran     | Besar Angsuran          |     Bunga                 |    Jumlah Angsuran  |");
        System.out.println("=================================================================================================================");

        for (i = 1; i <= Kali; i++) {
            if (i == 1) {

            } else {
                inSisa();
            }

            bungaPerbulan();
            jumlahAngsuran();
            totalAngsuran();

            System.out.println("|      " + i + " |   Rp. " + (long) Sisa + "  |   Rp. " + AngsuranBulan + "                 | "
                    + "Rp.  " + bungaBulan + "             |   Rp." + Angsuran + " |");

            System.out.println("=============================================================================================================");

        }
        System.out.println("|      Jumlah |     |   Rp. " + (long) Pinjam + "                 | "
                + "Rp.  " + +(long) (AngsuranTotal - Pinjam) + "             |   Rp." + (long) AngsuranTotal + " |");
        System.out.println("=============================================================================================================");
    }

}
