package Myproject.com;

 import java.util.*;
 
  public class Main{
    public static void main(String args[]){
       Namagame object = new Namagame();
       Calendar cal = Calendar.getInstance();
       System.out.println("Calendar :: " + cal.getTime() + "\n");
       object.setName("==============WELCOME TO GAME SUT JAWA==============");
       System.out.println(object.getName());
       System.out.print("1. Gunting" + "\n" + "2. Batu" + "\n" + "3. Kertas" + "\n");
       for(int i = 0; i < 53; i++){
         System.out.print("=");
       }
       System.out.println();
       
       String saya = null; // Player 1 //
       String komputer = null; // Player 2 //
       String hasil = null; // Hasil //
       boolean ulang = true;
       Scanner input = new Scanner(System.in);
       while(ulang){
       System.out.print("\n" + "pilih : ");
       int pilih = input.nextInt();
       
        if(pilih == 1){ // Tentukan Pilihanmu //
          saya = "Gunting";
        } else if(pilih == 2){ 
          saya = "Batu";
        } else if(pilih == 3){
          saya = "Kertas";
        } else {
          System.out.println("Input Salah");
        }
        
        int generate = (int)(Math.random()*3+1);
         
          if(generate == 1){
            komputer = "Gunting";
          } else if(generate == 2){
            komputer = "Batu";
          } else if(generate == 3){
            komputer = "Kertas";
          }
          
          if(pilih < 1 || pilih > 3){
            System.out.println("ulang lagi!");
          } else if(saya.equals(komputer)){
            hasil = "Seri";
          } else if(saya == "Gunting" && komputer == "Kertas"){
            hasil = "Anda menang";
          } else if(saya == "Batu" && komputer == "Gunting"){
            hasil = "Anda Menang";
          } else if(saya == "Kertas" && komputer == "Batu"){
            hasil = "Anda Menang";
          } else if(saya == "Gunting" && komputer == "Batu"){
            hasil = "Anda Kalah";
          } else if(saya == "Batu" && komputer == "Kertas"){
            hasil = "Anda Kalah";
          } else if(saya == "Kertas" && komputer == "Gunting"){
            hasil = "Anda Kalah";
          }
          
          // Menampilkan hasil /l
          System.out.print("                      Hasil " + "\n");
          for(int a = 0; a < 53; a++){
            System.out.print("=");
          }
          System.out.println();
          System.out.print("Anda Memilih : " + saya + "\n");
          System.out.print("Komputer Memilih : " + komputer + "\n");
          System.out.println("\n" + hasil);
          for(int b = 0; b < 53; b++){
            System.out.print("=");
          }
          System.out.println();
          Scanner kntl = new Scanner(System.in);
          System.out.print("\n" + "Ulang lagi ? [y/n] : ");
          String x = kntl.nextLine();
            if(x.equals("n")){
              ulang = false;
            }
          kntl.close();
          } 
         input.close();
         System.out.println("Terimakasih sudah memainkan game switjawa");
    }
  }
 
 class Namagame{
   private String name;

   public void setName(String name){
     this.name = name;
   }
   
   public String getName(){
     return name;
   }}