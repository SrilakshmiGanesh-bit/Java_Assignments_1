package assignment_8_strbuilder;

public class StringBuffers {
	public void stringBuf() {
		
	
	StringBuffer sb=new StringBuffer("transaction in process");
	sb.append("transcation is completed");
	sb.append("Money is withdrawn");
	System.out.println(sb);
	}
	
	public static void main(String[] args) {
		StringBuffers buffer=new StringBuffers();
		buffer.stringBuf();
		
	}

}
