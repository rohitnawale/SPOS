import java.util.HashMap;
import java.util.StringTokenizer;
import java.io.*;
public class PassOne {
	
	HashMap<String, String> opcode = new HashMap<String, String>(); 
	HashMap<String, String>register = new HashMap<String, String>();
	HashMap<String, String>condition = new HashMap<String, String>();
	HashMap<String, String>directive = new HashMap<String, String>();
	PassOne(){
		opcode.put("STOP", "00");
		opcode.put("ADD", "01");
		opcode.put("SUB", "02");
		opcode.put("MULT", "03");
		opcode.put("MOVER", "04");
		opcode.put("MOVEM", "05");
		opcode.put("COMP", "06");
		opcode.put("BC", "07");
		opcode.put("DIV", "08");
		opcode.put("READ", "09");
		opcode.put("PRINT", "10");
		
		register.put("AREG", "1");
		register.put("BREG", "2");
		register.put("CREG", "3");
		register.put("DREG", "4");
		
		condition.put("LT", "1");
		condition.put("LE", "2");
		condition.put("EQ", "3");
		condition.put("GT", "4");
		condition.put("GE", "5");
		condition.put("ANY", "6");
		
		directive.put("START", "1");
		directive.put("END", "2");
	
	}
	
	void show(){
		System.out.println( opcode.entrySet());
		System.out.println(register.entrySet());
		System.out.println(condition.entrySet());
		System.out.println(directive.entrySet());
}
	String getFromDirective(String key){
		return directive.get(key);
	}
	
	String getFromOpcode(String key){
		return opcode.get(key);
	}
	
	String getFromRegister(String key){
		return register.get(key);
	}
	
	String getFromCondition(String key){
		return condition.get(key);
	}
	
	int isInOpcode(String key){
		
		if (Integer.parseInt(opcode.get(key)) >= -1){
			return 1;
		}
		else
			return 0;
	}
	
	int isInRegister(String key){
		if (Integer.parseInt(register.get(key)) >=0){
			return 1;
		}
		else
			return 0;
	
	}
	
	int isInCondition(String key){
		if (Integer.parseInt(condition.get(key)) >= 0){
			return 1;
		}
		else
			return 0;
	
	}
	
	public static void main(String [] args) throws IOException{
	 	
		PassOne passone = new PassOne();
		//passone.show();
		FileReader f1 = null;
		FileWriter f2 = null;
		try {
			f1 = new FileReader("text.txt");
			f2 = new FileWriter("output.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		BufferedReader b1=new BufferedReader(f1); 
		BufferedWriter b2 = new BufferedWriter(f2);
		//b2.write("dhbdghdggh");
		  
		String s;
		while((s = b1.readLine()) != null){
			//System.out.println(s);
			StringTokenizer st=new StringTokenizer(s);
			while(st.hasMoreTokens()){
				String temp = st.nextToken();
				System.out.println(temp);
					if(temp.equals("START")){
						//b2.write("dhbdghdggh");
						b2.write(passone.getFromDirective(temp));
					}
					
					else if(temp.equals("END")){
						//b2.write("dhbdghdggh");
						b2.write(passone.getFromDirective(temp));
					}
					
					else if(passone.isInOpcode(temp)> 0){
						b2.write(passone.getFromOpcode(temp));
					}
					
					else if(passone.isInRegister(temp)>0){
						b2.write(passone.getFromRegister(temp));
					}
					else if(passone.isInCondition(temp)>0){
						b2.write(passone.getFromCondition(temp));
					}
					else{
						b2.write(temp);
					}
				
				
			}
			//b2.write("\n");
		}
	b2.close();
}

}
