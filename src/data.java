import java.util.Scanner;


public class data {

	
public static void main(String[] args) {

		
		DOA d = new  DOA();
 		
		Scanner sc = new Scanner(System.in);
		String str;
		do {
			

			System.out.println(" 1) Display  BOOKS \n 2) SEARCH BOOK "
					+ "\n 3) INSERT A BOOK \n 4)DELETE A BOOK \n 5)UPDATE THE BOOK  " + " \n 6)EXIT  ");

			System.out.println("Enter Your Choice...");
                String x = sc.next();
			switch (x) {
			case "1":
				d.DisplayAllBook();
				break;

			case "2":
                 d.searchById();
				break;
				
			case "3":
				 				 
				double p =sc.nextDouble();
                 d.insert();
				break;
			case "4":
                  d.deleteById();
				break;
			case "5":
                  d.update();
				break;
			case "6": return;
			default:
				System.out.println("please Enter valid choice");
				break;
			}
			
			
			System.out.println("Enter Y to Main Menu");
			 str = sc.next();
		}while(str.equalsIgnoreCase("y"));

	}

	

}



