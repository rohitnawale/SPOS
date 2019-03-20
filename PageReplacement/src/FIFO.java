import java.awt.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author administrator
 * this is LRU and Not FIFO!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
 */
public class FIFO {

	/**
	 * @param args
	 */
	public static void LRUPage() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter task sequence");
		String inputSeq = sc.nextLine();
		String pages [] = inputSeq.split("");
		System.out.println("Enter the frame size");
		int frameSize = sc.nextInt();
		
		ArrayList<String> q = new ArrayList<String>();
		int hit = 0;
		int fault = 0;
		
		for(int i=0;i<pages.length;i++){
			if(q.contains(pages[i])){
				hit++;
				q.remove(pages[i]);
				q.add(pages[i]);
				
			}
			else{
				fault++;
				
				if(q.size() < frameSize){
					q.add(pages[i]);
				}
				else{
					q.remove(0);
					q.add(pages[i]);
				}
				
				
			}
			System.out.println("----------");
			System.out.println(q);
			System.out.println("----------");
		}
		System.out.println("Hit  " + hit + "   " + "Fault" + fault);
		sc.close();
	}
	

}
