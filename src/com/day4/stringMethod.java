package com.day4;


//6, 6, 5, 9, 2
public class stringMethod {
    public static void main(String[] args) {
//        soal1();
//        soal2();
        latihan();
    }

    public static void soal1() {
//        2 4 6 8 16 32
        System.out.println("Soal 1 :");
        for (int i = 2; i <= 8; i += 2) {
            System.out.println(i);
            if (i == 8)
                for (int j = i * 2; j <= 32; j *= 2) {
                    System.out.println(j);
                }

        }
    }

    public static void soal2() {
//        2 4 8 32 216
        System.out.println("Soal 2:");
        for (int k = 2; k <= 8; k *= 2) {
            System.out.println(k);
            if (k == 8)
                for (int l = k * 4; l <= 32; l *= 4) {
                    System.out.println(l);
                    if (l == 32)
                        for (int m = l * 27 / 4; m <= 216; m *= 27 / 4) {
                            System.out.println(m);
                        }
                }

        }
    }

    public static void latihan() {
        String[] namaKaryawan = new String[5];
        namaKaryawan[0] = "a";
        namaKaryawan[1] = "b";
        namaKaryawan[2] = "c";
        namaKaryawan[3] = "d";
        namaKaryawan[4] = "e";
        int x;
        for (x=0; x<=4; x++){
            System.out.println(namaKaryawan[x]);
        }
    }

    public static void halo() {

    }
}