import java.util.Scanner;
public class IT24102655Lab5Q3{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
	System.out.print("Enter the start date (1-31): ");
    int s_date = input.nextInt();
	System.out.print("Enter the end date(1-31): ");
    int e_date = input.nextInt();
	int no_days=e_date-s_date;
	double amount,amount1,amount2,amount3,amount4,amount5;
    amount=48000;
	
	if((s_date<e_date)&&(no_days<3)){
	amount1=no_days*amount;
	System.out.print("Room Charge Per Day: Rs.48000.0/=");
	System.out.print("Number of Days Reserved: "+no_days);
	System.out.print("Room charges per day: "+amount1);}
		else if((s_date<e_date)&&(no_days<=4)){
		amount2=no_days*amount;
		amount3=amount2-(amount2*0.1);
		System.out.print("Room charges per day: "+amount3);}
			else if((s_date<e_date)&&(no_days<=5)){
			amount4=no_days*amount;
			amount5=amount4-(amount4*0.2);
			System.out.print("Room charges per day: "+amount5);}
				else if(s_date>e_date){
				System.out.print("Error: Start Date must be less than End Date");}
					else{
					System.out.print("Error: Days must be between 1 and 31");}
	}
}