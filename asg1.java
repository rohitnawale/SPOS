import java.util.HashMap;
public class asg1 {
	
	//public class Table{
		HashMap<String, String> opcode = new HashMap<String, String>(); 
		asg1(){
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
			
		
		
		}
		
		void show(){
			System.out.println(opcode.values() );
		}
	//}
	
	public static void main(String [] args){
		 	
			asg1 a = new asg1();
			a.show();
		
		
	}
}
