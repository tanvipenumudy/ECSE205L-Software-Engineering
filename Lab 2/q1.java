package lab;

import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.println("Enter the value of n(no of train data): ");
//        int n = sc.nextInt();
//        int action[] = new int[n];
//        int comedy[] = new int[n];
//        int category[] = new int[n];
        int n = 4;
	    int action[]={100,0,90,21};
	    int comedy[]={0,100,17,80};
	    int category[]={1,2,1,2};

//        System.out.println("Enter TRAINING DATA ");
//        System.out.println("Use 1 for Action and 2 for Comedy:");
//        
//        for (int i = 0; i < n; i++) {
//            System.out.print("action[" + i + "]= ");
//            action[i] = sc.nextInt();
//            System.out.print("comedy[" + i + "]= ");
//            comedy[i] = sc.nextInt();
//            System.out.print("category[" + i + "]= ");
//            category[i] = sc.nextInt();
//        }

        System.out.println("Enter the number of movies you validate : ");
        int m = sc.nextInt();
        while(m>0) {
        	System.out.println("Enter the number of action scenes : ");
        	int x = sc.nextInt();
        	System.out.println("Enter the number of comedy scenes : ");
            int y = sc.nextInt();

            double c[] = new double[n];
            for (int j = 0; j < n; j++) {
                c[j] = (x - action[j]) * (x - action[j]) + (y - comedy[j]) * (y - comedy[j]);
                c[j] = Math.pow(c[j], 0.5);
            }

            double min = c[0];
            int p = 0;
            for (int i = 0; i < n; i++) {
                if (min > c[i]) {
                    min = c[i];
                    p = i;
                }
            }

            if (category[p] == 1) {
                System.out.println("Category is Action");
            } else if (category[p] == 2) {
                System.out.println("Category is Comedy");
            }
            m--;
        }

    }
}