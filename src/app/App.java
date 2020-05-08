package app;

public class App {

    public static void main(String[] args) throws Exception {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 22 ; j++) {
                int A = 6;
                int V = 15;
                if(i == 2 && j == 0 || i == 3 && j < 3 && j != 0 || i<3 && j == 3 ){
                    System.out.print('J');
                }else{
                    System.out.print(" ");
                }
                if(i==(A+i)-A && j == (A+3)-i || i ==(A+i)-A && j == A+3+i || i == 2 && j >=8 && j<=10 ){
                    System.out.print('A');
                }else{
                    System.out.print(" ");
                }
                if(i==(V+i)-V && j == V + i || i==(V+i)-V && j == (V+6)-i   ){
                    System.out.print('V');
                }else{
                    System.out.print(" ");
                }
                // if (i == 2 && j ==0 ||i == 3 && j == 1 || i == 3 && j == 2 || i < 3 && j == 3 ) {
                //     System.out.print('J');
                // }else{
                //     System.out.print(" ");
                // }
                // if (i == 3 && j == 5 || i == 3 && j == 11 || i==2 && j > 5 && j< 11 || i == 1 && j>6 && j <10 && j!=8 || i == 0  && j == 8) {
                //     System.out.print('A');
                // }else{
                //     System.out.print(" ");
                // }
                // if (i == j && j> 12) {
                //     System.out.print('V');
                // }else{
                //     System.out.print(" ");
                // }
                
               

            }
            System.out.println();
        }
    }
   
}