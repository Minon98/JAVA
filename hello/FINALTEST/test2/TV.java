package test2;

public class TV {

   public int yearOfProduction, inch;
   public String company;
   
   public TV(String company, int yearOfProduction, int inch) {      // TV ��ü ����
      this.company = company;
      this.yearOfProduction = yearOfProduction;
      this.inch = inch;
   }
   
   public String info(){               //TV ���� ���
      return company + "���� ���� " + yearOfProduction + "���� " + inch + "��ġ TV";
   }
   
   public static void main(String[] args) {
         TV myTV = new TV("LG", 2020, 55); // TV ��ü ����
         System.out.println(myTV.info());
      }
}