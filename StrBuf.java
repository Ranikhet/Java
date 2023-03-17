
public class StrBuf {
	public static void main(String[] args) {
		/*StringBuffer s= new StringBuffer("graphic");
		s.append(" era");
		System.out.println("resultant string is "+s);*/
		StringBuffer s1= new StringBuffer("graphic era university");
		//StringBuffer s2= new StringBuffer("graphic");
		int l=s1.length();
		for(int i=0;i<l;i++)
		{
			char ch;
			ch=s1.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{s1.deleteCharAt(i);
			l--;}
		}
		System.out.println(s1);
		//System.out.println(s1==s2);
		//System.out.println(s1.equals(s2));

	}
}
