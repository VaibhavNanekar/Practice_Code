package String;

public class ForcounteachChar {
    public static void main(String[] args) {
       /* String str="Java Programming Language";

        for(int i=0;i<str.length();i++) {
            int count=0; // move count to here so it counts from zero every iteration of outer loop
            for(int j=i;j<str.length();j++) {
                if(str.charAt(i)==str.charAt(j)) {
                    count++;
                }
            }
            System.out.println("Count For Each Character "+str.charAt(i)+" is "+count);
        }*/

        String str="Vaibhav Suresh Nanekar";
        String completed = "";
        for(int i=0;i<str.length();i++) {
            int count=0;
            for(int j=i; j<str.length();j++) {
                if(str.charAt(i)==str.charAt(j)) {
                    count++;
                }
            }
            String s = String.valueOf(str.charAt(i));
            if(!completed.contains(s)){
                completed=completed+str.charAt(i);
                System.out.println("Count For Each Character "+str.charAt(i)+" is "+count);
            }
        }
    }
}
