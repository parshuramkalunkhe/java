public class Program_3 {
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println("StringBuilder : " + sb);
        sb.append("Java");
        System.out.println("After append(String str) method : " + sb);
        sb.insert(1,"What");
        System.out.println("After insert(int offset, String str) method : " + sb);
        sb.replace(1, 4, "Tame");
        System.out.println("After replace(int startIndex, int endIndex, String str) method : " + sb);
        sb.delete(1,4);
        System.out.println("After delete(int startIndex, int endIndex) method : " + sb);
        sb.reverse();
        System.out.println("After reverse() method : " + sb);
        System.out.println("Using capacity() method : " + sb.capacity());
        sb.ensureCapacity(10);    
        System.out.println("After ensureCapacity(int minimumCapacity) method : " + sb.capacity());   
    }
}
