
public class Program_1 {
    public static void main(String[] args){
        String s = "Sara";
        System.out.println("String : " + s);
        
        s = s.concat("Tendulkar");
        System.out.println("String after concatination : " + s);
    
        System.out.println("\nString methods.");
        System.out.println("charAt(int index) method : " + s.charAt(3));
        System.out.println("length() method : " + s.length());
        System.out.println("equals(String str) method : " + s.equals(s));
        System.out.println("trim() method : " + s.trim());
        System.out.println("toCharArray() method : " + s.toCharArray());
        System.out.println("toUpperCase() method : " + s.toUpperCase());
        System.out.println("toLowerCase() method : " + s.toLowerCase());
        System.out.println("split(String str) method : " + s.split(" "));
        System.out.println("replace(char old, char new) method : " + s.replace('a', 'b'));
        System.out.println("replace(String old, String new) method : " + s.replace("Sara", "Sachin"));
        System.out.println("indexOf(char c) method : " + s.indexOf('n'));
        System.out.println("indexOf(char c, int index) method : " + s.indexOf('S', 1));
        System.out.println("indexOf(String str) method : " + s.indexOf("Sachin"));
        System.out.println("lastIndexOf(char c) method : " + s.lastIndexOf("a"));
        System.out.println("lastIndexOf(char c, int index) method : " + s.lastIndexOf('a', 8));
        System.out.println("substring(int beginIndex) method : " + s.substring(6));
        System.out.println("substring(int beginIndex, int endIndex) method : " + s.substring(4, 7));
        System.out.println("startsWith(String str) method : " + s.startsWith("Sachin"));
        System.out.println("endsWith(String str) method : " + s.endsWith("Tendulkar"));
        System.out.println("contains(String str) method : " + s.contains("Sachin"));
        System.out.println("isBlank() method : " + s.isBlank());
        System.out.println("isEmpty() method : " + s.isEmpty());
        System.out.println("compareTo(String str) method : " + s.compareTo(s));
        System.out.println("compareToIgnoreCase(String str) method : " + s.compareToIgnoreCase("SACHIN TENDULKAR"));
        System.out.println("concat(String str) method : " + s.concat("Gill"));
        System.out.println("lastIndexOf(String str) method : " + s.lastIndexOf("Tendulkar"));
        System.out.println("strip(String str) method : " + s.strip("Tendulkar"));

        System.out.println("\nComparing a String.");
        String s1 = "Java.";
        String s2 = "Java.";

        System.out.println("String s1 : " + s1);
        System.out.println("String s2 : " + s2);

        System.out.println("Comparing using == operator : " + (s1 == s2));
        System.out.println("Comparing using equals() method : " + s1.equals(s2));
        System.out.println("Comparing using equalsIgnoreCase() method : " + s1.equalsIgnoreCase(s2));
        System.out.println("Comparing using compareTo() method : " + s1.compareTo(s2));
    
    
    }
}
