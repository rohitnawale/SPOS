import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;


public class PassOne {

	
		public static void main (String [] args) throws IOException{
			
			FileReader f1 = null;
			FileWriter f2 = null;
			try{
				f1 = new FileReader("macro.txt");
				f2 = new FileWriter("MNT.txt");
			}
			catch(FileNotFoundException e){
				e.printStackTrace();
			}
			
			BufferedReader br = new BufferedReader(f1);
			BufferedWriter b2 = new BufferedWriter(f2);
			String s;
			int mntptr = 1;
			int p = 0;
			
			while( (s = br.readLine()) != null ){
				StringTokenizer st = new StringTokenizer(s);
				
				while(st.hasMoreTokens()){
					String temp = st.nextToken();
					System.out.print(temp);
					if(temp.equals("MACRO")){
						//st.nextToken();
						//b2.write(t);
						//b2.write(Integer.toString(mntptr) + "\t"+st.nextToken());
						//mntptr++;
						p = 1;
					}
					if(p == 1){
						System.out.println(temp);
						b2.write(temp);
						mntptr++;
						p = 0;
					}
				}
				//System.out.println();
			}
		}
}
