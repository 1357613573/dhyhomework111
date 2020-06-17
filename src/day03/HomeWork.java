package day03;

public class HomeWork {

    public static void circle(int row) {
        for (int i = 1; i <=row; i++) {
            for (int j=1;j<=row-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void sum(){
        int sum=2;

        for(int i=2;i<=100;i++){
            for(int j=2;j<i;j++){
                if(i%j == 0 && i!=2){
                    break;
                }else if(j+1==i){
                    sum+=i;
                }
            }
        }
        System.out.println("100以内全部素数和为"+sum);


    }
    public static void main(String[] args) {

        circle(5);//d打印等腰三角形
        sum();//打印100以内素数和

    }
}
