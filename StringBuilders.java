package assignment_8_strbuilder;

public class StringBuilders {
	public void strbuilder() {
	StringBuilder sb=new StringBuilder("shree, ");
	sb.append("anu, ");
	sb.append("kumar");
	System.out.println(sb);
	}
	
	
	public static void main(String[] args) {
		StringBuilders strb=new StringBuilders();
		strb.strbuilder();
		
	}

}

/*
 * Difference between stringbuilder and string buffer StringBuilder => fast, not
 * thread safe StringBuffer => slow compared to stringbuilder but thread safe
 * and synchronized
 */