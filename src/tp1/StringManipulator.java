//package tp1;

public class StringManipulator {

    private String s;

    public StringManipulator(String s) {
        this.s = s;
    }

    public void reverse(){
        String res = "";
        for(int i = s.length()-1;i >= 0;i--)
            res+=s.charAt(i);
        System.out.println("reverse : "+res);
    }

    public void isPalindrome(){
        //do your stuff
        int n = s.length();
        for(int i = 0;i<n/2;i++)
            if(s.charAt(i) != s.charAt(n-i-1)){
                System.out.println("isPalindrome : False");
                return;
            }
        System.out.println("isPalindrome : True");
    }

    public void toUpperCase(){
        String res ="";
        for(int i=0;i<s.length();i++)
            res+= Character.toUpperCase(s.charAt(i));
        System.out.println("uppercase : "+res);
    }

    public void toLowerCase(){
        String res ="";
        for(int i=0;i<s.length();i++)
            res+= Character.toLowerCase(s.charAt(i));
        System.out.println("lowercase : "+res);
    }
    public void getVowelNumber(){
        char []vowel = { 'A', 'E', 'I', 'O', 'U','Y'};
        int con = 0;
        for(int i=0;i < s.length();i++)
            for(int j = 0;j < 6;j++)
                if(Character.toUpperCase(s.charAt(i))== vowel[j] )
                    con++;
        
        System.out.println("vowelNumber : "+con);
    }

    public static void main(String[] args) {
        StringManipulator stringManipulator = new StringManipulator("tene");
        stringManipulator.reverse();
        stringManipulator.isPalindrome();
        stringManipulator.toUpperCase();
        stringManipulator.toLowerCase();
        stringManipulator.getVowelNumber();
    }
}
