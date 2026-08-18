import java.util.Scanner;

public class Student {
   String name;
   int registerNumber;
   int[] marks = new int[6];
   double sgpa;

   public Student() {
   }

   public void getData() {
      Scanner var1 = new Scanner(System.in);
      System.out.println("Enter the name:");
      this.name = var1.nextLine();
      System.out.println("Enter Register Number:");
      this.registerNumber = var1.nextInt();
      System.out.println("Enter 3 marks:");

      for(int var2 = 0; var2 < 3; ++var2) {
         this.marks[var2] = var1.nextInt();
      }

   }

   public void computeSgpa() {
      int var1 = 0;

      for(int var2 = 0; var2 < 3; ++var2) {
         var1 += this.marks[var2];
      }

      this.sgpa = (double)var1 / (double)3.0F;
   }

   public void showDetails() {
      System.out.println("Name: " + this.name);
      System.out.println("Register Number: " + this.registerNumber);
      System.out.println("SGPA: " + this.sgpa);
   }

   public static void main(String[] var0) {
      Student var1 = new Student();
      var1.getData();
      var1.computeSgpa();
      var1.showDetails();
   }
}