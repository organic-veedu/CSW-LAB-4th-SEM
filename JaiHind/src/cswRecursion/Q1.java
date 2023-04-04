package cswRecursion;
// Decimal to HexaDecimal
class DBC{
	public String convert(int u, String ref, String res) {
		if(u%16!=0){
			return res;
		}
		else {
			int t = (u%16);
			String temp = ""; 
			//temp = ref.charAt(t) + temp;
			System.out.print(256/16);
			convert(u/16, ref, temp);
		}
		return res;
	}
}
public class Q1 {
	public static void main(String[] args) {
		DBC obj = new DBC();
		String te = obj.convert(256, "123456789ABCDEF", "");
		System.out.println("Conversion " + te);
	}

}
