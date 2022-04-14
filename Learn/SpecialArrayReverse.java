package Learn;

public class SpecialArrayReverse {

	public static void main(String[] args) {
		String str ="a&r&k%h$$i"; // a#b%j&x*f";   //A&x#";//output x&A#
		char [] ch=str.toCharArray();
		int i=0,j=0;
		j=str.length()-1;
		while(i<j) {
			if(!(Character.isAlphabetic(ch[i]))) {
				i++;
				continue;
			}
			if(!(Character.isAlphabetic(ch[j]))) {
				j--;
				continue;
			}
			else {
				char ch1=ch[i];
				ch[i]=ch[j];
				ch[j]=ch1;
				i++;
				j--;
			}
			
		}
		for(char k:ch) {
			System.out.print(k);
		}
	}

}


/*
int i=0,j=0;
j=str.length()-1;
char ch;
while(i<j) {
	if(!((str.charAt(i)>'A' && str.charAt(i)>'Z')||(str.charAt(i)>'a' && str.charAt(i)>'z'))) {
		i++;
		continue;
	}
	if(!((str.charAt(j)>'A' && str.charAt(j)>'Z')||(str.charAt(j)>'a' && str.charAt(j)>'z'))) {
		j--;
		continue;
	}
	else {
		ch=str.charAt(i);
		//str.charAt(i)=str.charAt(j);
		//str.charAt(j)=ch;
		i++;
		j--;
	}
}
System.out.println(str);
*/