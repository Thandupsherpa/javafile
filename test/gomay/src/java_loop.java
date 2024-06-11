public class java_loop {
    public static void main(String[] args) {
        int i=1;
        System.out.println(i);
        for(int j=1;j<20;j++)
        {
            int ans=i+2;
            System.out.println(ans);
            i=ans;
        }
    }
}
