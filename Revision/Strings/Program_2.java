

public class Program_2 {
    public static void main(String[] args){
        StringBuffer sb = new StringBuffer("Hello");
        System.out.println("Original StringBuffer : " + sb);
        sb.append("Java");
        System.out.println("After append(String str) method : " + sb);
        sb.insert(1, "What");
        System.out.println("After insert(int offset, String str) method : " + sb);
        sb.replace(4,8, "Why");
        System.out.println("After repalce(int startIndex, int endIndex, String str) method : " + sb);
        sb.delete(4,8);
        System.out.println("After delete(int startIndex, int endIndex) method : " + sb);
        sb.reverse();
        System.out.println("After reverse() method : " + sb);
        
        System.out.println("Using capacity() method : " + sb.capacity());
        sb.ensureCapacity(8);
        System.out.println("Using ensureCapacity(int minimumCapacity) method : " + sb);
    }
}
