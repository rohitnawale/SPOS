import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author administrator
 *THIS is FIFO and not LRU !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!1111111
 */
public class LRU {

	/**
	 * @param args
	 */
	
public static void FIFOPage(){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter task sequence");
	String inputSeq = sc.nextLine();
	String pages [] = inputSeq.split("");
	System.out.println("Enter the frame size");
	int frameSize = sc.nextInt();
	
	Queue <String> q = new LinkedList<String>();
	int hit = 0;
	int fault = 0;
	for(int i=0;i<pages.length;i++){
		
		if(q.contains(pages[i])){
			hit++;
		}
		else{
			fault++;
			if(q.size()< frameSize){
				q.add(pages[i]);
			}
			else{
			q.remove();
			q.add(pages[i]);
			}
			}
		System.out.println("----------");
		System.out.println(q);
		System.out.println("----------");
	}
	System.out.println("Hit	" + hit + "   " + "Fault	" + fault);
	sc.close();
	
	
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose the type of Page Replacment Technique : ");
		System.out.println("1.) FIFO \n" + "2.) LRU\n" + "3.)Optimal\n");
		int choice = sc.nextInt();
		switch(choice){
		case 1 : 
			FIFOPage();
			break;
			
		case 2:
			FIFO.LRUPage();
			break;
			
		case 3:
			break;
			
			
		}
		
		
	}

}
