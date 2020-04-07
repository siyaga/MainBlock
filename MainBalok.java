/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pytagoras;
import java.util.Scanner;
/**
 *
 * @author AD
 */
public class MainBalok {
 public static void main(String[] ar)
 {
 
  int p;
  Scanner keyboard=new Scanner(System.in);
  System.out.println("1. Luas lingkaran"); 
  System.out.println("2. Luas Persegi"); 
  System.out.println("3. Luas Segiti");
  System.out.println("=======================================");  
  System.out.print("Pilih = ");
  p = keyboard.nextInt();
  
  switch (p) {
  case 1:
   Double dl, jl, ll;
   Double phi = 3.14;
   Scanner keyboardLingkaran =new Scanner(System.in);
   System.out.println("Hitung Luas Linggkaran");
   System.out.println("=======================================");  
   System.out.print("Diameter = ");
   dl = keyboard.nextDouble();
   jl = dl/2;
   //perhitungan luas lingkaran
   ll = phi * (jl*jl);
   System.out.println("=======================================");
   System.out.println("Luas Linggkaran = "+ll);
   break;
  case 2:
   int sp, lp;
   Scanner keyboardPersegi =new Scanner(System.in);
   System.out.println("Hitung Luas Persegi");
   System.out.println("=======================================");  
   System.out.print("Sisi = ");
   sp = keyboardPersegi.nextInt();
   //perhitungan luas persegi
   lp = sp*sp;
   System.out.println("=======================================");
   System.out.println("Luas Persegi = "+lp);
   break;
  
  }
 
 }
 

    
}