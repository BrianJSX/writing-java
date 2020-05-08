package app;

public class App {

    public static void main(String[] args) throws Exception {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 31 ; j++) {
                int A = 6;
                int V = 15;
                int A2 = 23;
                if(i == 2 && j == 0 || i == 3 && j < 3 && j != 0 || i<3 && j == 3 ){
                    System.out.print('J');
                }else{
                    System.out.print(" ");
                }
                if(i==(A+i)-A && j == (A+3)-i || i ==(A+i)-A && j == A+3+i || i == 2 && j >=8 && j<=10){
                    System.out.print('A');
                }else{
                    System.out.print(" ");
                }
                if(i==(V+i)-V && j == V + i || i==(V+i)-V && j == (V+6)-i   ){
                    System.out.print('V');
                }else{
                    System.out.print(" ");
                }
                if(i==(A2+i)-A2 && j == (A2+3)-i || i ==(A2+i)-A2 && j == A2+3+i || i == 2 && j >=25 && j<=27 ){
                    System.out.print('A');
                }else{
                    System.out.print(" ");
                }
               
                
            }
            System.out.println();
        }
    }
   
}