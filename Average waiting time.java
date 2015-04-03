import java.util.Scanner;
import java.util.Arrays;

public class time {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
			System.out.print("Please input number of Process : " );		
			int num = in.nextInt();
			System.out.println("-===-===-===-===-===-===-===-===-===-===-");
			int[] J =  new int[num+1];
		int i = 1 ,TimeProcess = 0 ,TotalWait = 0,r = 1;
		while(i<=num){	
			System.out.print("Burst Time for Process P"+i + " : ");
			int N = in.nextInt();
		    String tt = in.nextLine();
		    J[i] = N;
			TimeProcess += N;
			TotalWait += TimeProcess-N;
		i++;
		}//end while
		// Average Waiting Time Ẻ FCFS
		System.out.println("-===-===-===-===-===-===-===-===-===-===-");
		double AverageWaitingTime = TotalWait/num;
		System.out.println("Total Wait FCFS : " + TotalWait );
		System.out.println("Average Waiting Time FCFS : "+ AverageWaitingTime);
		System.out.println("-===-===-===-===-===-===-===-===-===-===-");

		// Average Waiting Time Ẻ SJF
		int TimeProcess1 = 0, TotalWait1 = 0;
		Arrays.sort(J);
		for(int k=1; k<J.length; k++) {
			TimeProcess1 += J[k];
			TotalWait1 += TimeProcess1;
		}//end for
		TotalWait1 = TotalWait1 - TimeProcess1;
		double AverageWaitingTime1 = TotalWait1/num;
		System.out.println("TotalWait SJF : " + TotalWait1);
		System.out.println("Average Waiting Time SJF (Nonpreemtive) : "+ AverageWaitingTime1);
		System.out.println("-===-===-===-===-===-===-===-===-===-===-");
	}//end method
}//end class
