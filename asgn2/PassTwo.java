import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class PassTwo {

	public static void pass(PassOne passone) throws IOException {

		FileReader f1 = null;
		try {
			f1 = new FileReader("output.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		BufferedReader b1 = new BufferedReader(f1);

		String s;

		while ((s = b1.readLine()) != null) {

			StringTokenizer st = new StringTokenizer(s);
			while (st.hasMoreTokens()) {
				String temp = st.nextToken();

				if (temp.startsWith("S")) {

					String val = passone.getFromSymbol(temp.substring(1));
					System.out.print(val + "\t");
				} else if (temp.startsWith("L")) {
					String valu = passone.getFromLiteral(temp.substring(1));
					System.out.print(valu + "\t");
				} else
					System.out.print(temp + "\t");

			}
			System.out.println();
		}
	}
}
