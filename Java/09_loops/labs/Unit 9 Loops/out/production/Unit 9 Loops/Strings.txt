import static java.lang.System.in;

public class Strings {


    public static String reverse(String str){
        String ret = "";
        for (char c : str.toCharArray()) {
            ret= ""+c+ret;
        }
        return ret;
    }

    public static int numVowels(String str){
        int count = 0;
        for(char c : str.toLowerCase().toCharArray()){
            if ("aeiou".indexOf(c) != -1) count++;
        }
        return count;
    }

    public static String getUpper(String str){
        String ret = "";
        for (char c : str.toCharArray()){
            if (c == Character.toUpperCase(c) && Character.isAlphabetic(c)) ret+=c;
        }
        return ret;
    }

    public static String everyNth(String str, int n){
        String ret = "";
        for(int i = 0; i< str.length(); i++){
            if (i%n==0) ret+=str.charAt(i);
        }
        return ret;
    }

    public static String box(String str){
        String ret = "";
        for(int i = 0; i<str.length();i++){
            ret+=str+"\n";
        }
        return ret.trim();
    }


    public static String box2(String str){
        String ret = str+"\n";
        for(int i = 1; i < str.length()-1; i++){
            ret+=str.charAt(i) + " ".repeat(str.length()-2) + reverse(str).charAt(i) + "\n";
        }
        ret+=reverse(str);
        return ret;
    }

    public static String staircase(String str){
        String ret = "";
        for (int i = 1; i < str.length()+1; i++){
            for (int j = 0; j < i; j++){
                ret+=str.charAt(j);
            }
            ret+="\n";
        }
        return ret;
    }

    public static String triangleA(int n){
        String ret = "";
        for (int i = 1; i < n+1; i++){
            ret+="*".repeat(i) + "\n";
        }
        return ret;
    }

    public static String triangleB(int n){
        String ret = "";
        for (int i = n; i > 0; i--){
            ret+="*".repeat(i)+"\n";
        }
        return ret;
    }

    public static String triangleC(int n){
        String ret = "";
        for (int i = 1; i < n+1;i++){
            ret += " ".repeat(n-i)+"*".repeat(i)+"\n";
        }
        return ret;
    }

    public static String triangleD(int n){
        String ret = "";
        for (int i = n; i > 0; i--){
            ret += " ".repeat(n-i) + "*".repeat(i) + "\n";
        }
        return ret;
    }

    public static String multiplicationTable(int n){
        int maxNumber = n * n;
        int numDigits = String.valueOf(maxNumber).length();

        StringBuilder table = new StringBuilder();
        table.append("\n");

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                table.append(String.format("%" + (numDigits + 1) + "d", i * j));
            }
            table.append("\n");
        }

        return table.toString();
    }

    public static String makeHappy(String str){
        String ret = "";
        for (int i = 0; i < str.length()-1; i++){
            if (str.substring(i, i+2).equals(":(")){
                ret+=":)";
                i+=1;
            } else ret+="-";
        }
        if (!str.endsWith(":(")) ret+="-";
        return ret;
    }

    public static int countCaps(String str){
        String[] splitString = str.split(" ");
        int count = 0;
        for (String s : splitString){
            if (s.charAt(0) == Character.toUpperCase(s.charAt(0)) && Character.isAlphabetic(s.charAt(0))) count++;
        }
        return count;
    }

    public static boolean isBalanced(String str){
        String s = "";
        for(char c : str.toCharArray()){
            s+=c+" "
;        }
        return s.split("\\(").length == s.split("\\)").length;
    }

}
