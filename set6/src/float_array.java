public class float_array {
    public static void main(String[] args) {
    float[]numbers={1.2f,1.3f,1.4f,1.5f,1.6f};
    float sum=0;
    for(int i=0;i<numbers.length;i++){
        sum+=numbers[i];
    }
        System.out.println("sum of the numbers"+sum);
    }
}
