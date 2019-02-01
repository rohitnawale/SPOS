import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;


public class MPassOne {

	
		public static void main (String [] args) throws IOException{
			
			FileReader f1 = null;
			FileWriter f2 = null;
			FileWriter f3 = null;
			FileWriter f4 = null;
			try{
				f1 = new FileReader("macro.txt");
				f2 = new FileWriter("MNT.txt");
				f3 = new FileWriter("MDT.txt");
				f4 =  new FileWriter("KPDTAB.txt");
			}
			catch(FileNotFoundException e){
				e.printStackTrace();
			}
			
			BufferedReader br = new BufferedReader(f1);
			BufferedWriter b2 = new BufferedWriter(f2);
			BufferedWriter b3 = new BufferedWriter(f3);
			BufferedWriter b4 = new BufferedWriter(f4);
			String s;
			int mntptr = 1;
			int p = 0;
			int mdtflag= 0 ;
			int paramLine = 0;
			int mCall =0;
			
			while( (s = br.readLine()) != null ){
				StringTokenizer st = new StringTokenizer(s);
				StringTokenizer st1 = new StringTokenizer(s);
				if(paramLine == 1){
					while(st1.hasMoreTokens()){
						String temp = st1.nextToken();
						 if(temp.startsWith("&")){
							 if(temp.contains("=")){
								 int equ = temp.indexOf("=");
								 String s1 = temp.substring(0, equ);
								 String s2 = temp.substring(equ+1, temp.length());
							b4.write(s1+"\t"+s2  + "\n");
							 }
							 
							 else
								 b4.write(temp + "\n");
						}
						 else{
							 b2.write(Integer.toString(mntptr) + "\t"+temp);
								mntptr++;
								
						 }
					}
					paramLine = 0;
				}
				
				else{
				
				
				while(st.hasMoreTokens()){
					String temp = st.nextToken();
					System.out.print(temp);
					if(mdtflag == 1 && paramLine == 0){
						
						if(mCall == 1){
							
						}
						if(temp.equals("MEND")){
							mdtflag = 0;
							mCall =1;
						}
						
						else if(paramLine == 0){
							
							b3.write(temp);
						}
					}
					else if(p == 1 && paramLine == 0 ){
					//	System.out.println(temp);
						
						p = 0;
						mdtflag = 1;
					}
					else if(temp.equals("MACRO")){
						p = 1;
						paramLine = 1;
					}
					
				
				}
				}
				//System.out.println();
			}
			b2.close();
			b3.close();
			b4.close();
		}
		
}
