public class Div {
    public static void main(String[] args) {
        int count = 0;
        int counts = 0;
        for(int i = 1;i<=200;i++){
            if(i%4==0||i%5==0){
                count = count +1;
            }
        }
        System.out.println(count);
        for(int i = 1;i<=200;i++){
            if(i%4==0&&i%5==0){
                counts = counts +1;
            }
        }
        System.out.println(counts);
        int result = count - counts;
        System.out.println(result);
    }
}
