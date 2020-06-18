package day03;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWorkDay02 {
    public static int[]  arrange(int a[],int b[]){
        int [] c=new int[8];//定义一个大数组
        int q=0;//大数组从q开始计数
        if(a.length>=b.length){//判断两个数组哪个个数多
            for(int i=0;i<b.length;i++){//以个数小的数组下标为最大值
                c[q]=a[i];
                q+=1;
                c[q]=b[i];
                q+=1;
            }
            for(int i=b.length;i<a.length;i++){//遍历个数多的数组剩余部分
                c[q]=a[i];
                q+=1;
            }

        }else{
            for(int i=0;i<a.length;i++){
                c[q]=a[i];
                q+=1;
                c[q]=b[i];
                q+=1;
            }
            for(int i=a.length;i<b.length;i++){
                c[q]=b[i];
                q+=1;
            }

        }

        return c;
    }
    public static void main(String[] args) {
        int [] num=new int[8];
        int j=0;
        int k=0;
        int m = 0;
        int n =0;
        System.out.println("请输入8个整数:");
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<num.length;i++){
            num[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(num));
        int [] num2=new int[8];
        for(int i=0;i<=num.length-1;i++){
            if(num[i]%2==0){ //判断奇数还是偶数
                j+=1; //奇数个数
            }else {
                k+=1;//偶数个数
            }
        }
        int [] arr=new int [j];
        int [] arr1=new int [k];
        for(int i=0;i<=num.length-1;i++) {
            if (num[i] % 2 == 0) { //判断奇数还是偶数

                arr[m] = num[i];
                m=m+1;
            }else{

                arr1[n]= num[i];
                n=n+1;
            }
        }
        System.out.println("偶数数组:"+ Arrays.toString(arr));
        System.out.println("奇数数组:"+ Arrays.toString(arr1));

        int []a=arrange(arr,arr1);

        System.out.println("交替遍历数组"+Arrays.toString(a));


    }
}
