// printStackTrace() method;
class Program_6 {
    public static void demo1(){
        demo2();
    }
    public static void demo2(){
        demo3();
    }
    public static void demo3(){
        System.out.println(3/0);
    }
    public static void main(String[] args){
       try {
            demo1();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
