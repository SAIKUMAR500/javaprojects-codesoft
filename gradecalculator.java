import java.util.Scanner;

public class gradecalculator
{
   public static void main(String[] args)
   {
    
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the student's name: ");
        String name = scanner.nextLine();

   
      float[] marks = new float[8];
      float tot=0, per;
      int i,finalmark;
      Scanner scan = new Scanner(System.in);
      

      System.out.print("Enter Marks Obtained in 8 Subjects: ");
      for(i=0; i<8; i++)
         marks[i] = scan.nextFloat();
      
      for(i=0; i<8; i++)
         tot = tot + marks[i];
         per = tot/8;
         finalmark=(int)tot;


         
       
    
      System.out.println("Total out of 800 :"+finalmark);
      System.out.println("student name:"+name);

		System.out.println("Percentage :"+per);
        System.out.print("\nGrade = ");
	  
      if(per>=94)
         System.out.println("A\nexcellent");
     else if(per>=90 && per<94)
         System.out.println("A-\nbravo");
      else if(per>=87 && per<90)
         System.out.println("B+\nyou earned it");
     else   if(per>=83 && per<87)
         System.out.println("B\nsuper awesome");
      else if(per>=80 && per<83)
         System.out.println("B-\nsuper");
      else if(per>=77 && per<80)
         System.out.println("C+\nnice");
      else if(per>=73 && per<77)
         System.out.println("C\nfirst class");
      else if(per>=70 && per<73)
         System.out.println("C-you finished");
      else if(per>=67 && per<70)
         System.out.println("D+\nso good");
      else if(per>=63 && per<67)
         System.out.println("D\nnice batter ");
      else if(per>=60 && per<63)
         System.out.println("D-\nyou reached");
      else if(per>=45 && per<60)
         System.out.println("D-\nyou ranked");
      else if(per>=35 && per<45)
         System.out.println("D-\ngot it");
      else
         System.out.println("f\ntry again");
   }
}