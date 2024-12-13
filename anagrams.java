import java.util.*;
public class anagrams{
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the first string");
    String a;
    a=sc.nextLine();
    System.out.println(a);
    System.out.println("Enter the second string");
    String b;
    b=sc.nextLine();
    System.out.println(b);
if(a.length()==b.length()){
char[] atochar=a.toCharArray();
char[] btochar=b.toCharArray();
Arrays.sort(atochar);
Arrays.sort(btochar);
String s1=Arrays.toString(btochar);
String s2=Arrays.toString(atochar);


// System.out.println(btochar);
// System.out.println(atochar);


if(s1.equals(s2)){
System.err.println("yes they are anagrams");
}
else {
    System.out.println("they are not anagrams");
}

}
else {
    System.out.println("not anagrams");
}
}
}

