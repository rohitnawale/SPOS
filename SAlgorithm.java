import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author administrator
 *
 */
public class SAlgorithm {

	/**
	 * @param args
	 */
	static void FCFS(){
		System.out.println("Enter the number of tasks :");
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		//int pid [] = new int [no];
		//int at [] = new int [no];
		//int bt [] = new int [no];
		//int ct [] = new int[no];
		//int tt [] = new int[no];
		//int wt [] = new int[no];
		ArrayList <Integer> pid = new ArrayList<Integer>();
		ArrayList <Integer> at = new ArrayList<Integer>();
		ArrayList <Integer> bt = new ArrayList<Integer>();
		ArrayList <Integer> ct = new ArrayList<Integer>();
		ArrayList <Integer> tt = new ArrayList<Integer>();
		ArrayList <Integer> wt = new ArrayList<Integer>();
		for(int i=0;i<no;i++){
			pid.add(i);
			System.out.println("Enter arrival time for process " + i);
			at.add(sc.nextInt());
			System.out.println("Enter burst time for process "+ i);
			bt.add(sc.nextInt());
		}
		ArrayList <Integer> original = new ArrayList <Integer>(at);
		Collections.sort(at);
		for(int i=0;i<no;i++){
			System.out.println(at.get(i) + "	"+ bt.get(i));
		}
	}
	
	static void priority(){
		
	}
	
	static void roundRobin(){
		
	}
	
	static void SJF(){
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose the Option\n 1. FCFS\n 2. Priority\n 3. Round Robin\n 4 SJF\n");
		int choice = sc.nextInt();
		switch(choice){
		case 1:
			FCFS();
			break;
			
		case 2:
			priority();
			break;
			
		case 3:
			roundRobin();
			break;
			
		case 4:
			SJF();
			break;
			
		}
		sc.close();
	}

}
