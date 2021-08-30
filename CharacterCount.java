class CharacterCount {
	
	public static void charCount(String s){
	    String alpha = "abcdefghijklmnopqrstuvwxyz";
	    int counters[] = new int[26];
	    for(int k = 0;k < s.length();k++)
	    {
	        char ch  = s.charAt(k);
	        int index = alpha.indexOf(Character.toLowerCase(ch));
	        if(index!=-1)
	        {
	            counters[index] += 1;
	        }
	    }
	    for(int i=0;i<counters.length;i++)
	    {
	        System.out.println(alpha.charAt(i)+"\t"+counters[i]);
	    }
	}
	public static void main (String[] args) {
		countOccurences("github");
	}
	
}
/*
OUTPUT
------
a	0
b	1
c	0
d	0
e	0
f	0
g	1
h	1
i	1
j	0
k	0
l	0
m	0
n	0
o	0
p	0
q	0
r	0
s	0
t	1
u	1
v	0
w	0
x	0
y	0
z	0
*/
