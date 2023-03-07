package javaapplication8;

import java.util.Scanner;

public class JavaApplication8 {

    public static void main(String[] args) {
        Scanner giris=new Scanner(System.in);
        double Matematik, Fizik, Türkçe, Kimya, Müzik,ortalama = 0;
        System.out.println("matematik notunuz: ");
        Matematik=giris.nextInt();
         
        System.out.println("fızık notunuz:");
        Fizik=giris.nextInt();
        
        System.out.println("turkce notunuz: ");
        Türkçe=giris.nextInt();
        
        System.out.println("kımya notunuz: ");
        Kimya=giris.nextInt();
        
        System.out.println("muzık notunuz: ");
        Müzik=giris.nextInt();
 
        System.out.println("not bilgisi 0-100 aralıgında olmayan notlar ortalamaya dahil edilmez.");
        if((Matematik<0 || Matematik>100)) {
            ortalama=(Fizik+Kimya+Türkçe+Müzik)/5; 
        }
       else if((Türkçe<0 || Türkçe>100)) {
            ortalama=(Fizik+Kimya+Matematik+Müzik)/5; 
        }
       else if((Türkçe<0 || Türkçe>100)) {
            ortalama=(Fizik+Kimya+Matematik+Müzik)/5; 
        }
       else  if((Kimya<0 || Kimya>100)) {
            ortalama=(Fizik+Türkçe+Matematik+Müzik)/5; 
        }
        else  if((Müzik<0 || Müzik>100)) {
            ortalama=(Fizik+Türkçe+Matematik+Kimya)/5; 
        }
        else  if((Fizik<0 || Fizik>100)) {
            ortalama=(Müzik+Türkçe+Matematik+Kimya)/5; 
        }
        if(ortalama>55){
            System.out.println("sinifi gectiniz "+ortalama+"ortalama ile");
        }
        else{
            System.out.println("maalesef"+ortalama+"ile sinif tekrari");
        }
       
    }
    }
    

