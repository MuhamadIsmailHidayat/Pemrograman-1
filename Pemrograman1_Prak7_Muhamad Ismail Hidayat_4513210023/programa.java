import java.util.Scanner;
public class programa {
public static void main(String[] args) {
 int i;
 int j;
 Scanner masukan = new Scanner(System.in);
 System.out.print("Masukkan batas bilangannya : ");
 int batas = masukan.nextInt();
 for(i=1;i<=batas;i++)
 {
  for(j=1;j<=i;j++)
  {
   System.out.print(i+" ");
  }
 
 System.out.println();
 }
}
} 