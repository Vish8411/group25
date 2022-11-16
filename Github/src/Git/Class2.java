package Git;

public class Class2 {
public static void main(String[] args) {
	String s="abcdefgabcd";
	for(int i=0;i<=s.length()-1;i++)
	{
		char ch=s.charAt(i);
		int ab=s.indexOf(ch,i+1);
		if(ab>1)
		{
			System.out.print(s.charAt(i));
		}
	}
}
}
