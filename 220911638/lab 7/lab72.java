public class lab72 {

    static int count=0;
    lab72(){
        count++;
    }
    public static void main(String[] args) {
        lab72 x=new lab72();
        lab72 y=new lab72();
        System.out.println("number of objects created are:"+lab72.count);
    }
}
