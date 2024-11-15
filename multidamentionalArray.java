import java.util.*;
class Example{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
    

        System.out.print("Enter student count : ");
        int studentCount=input.nextInt();

        System.out.print("Enter student marks : ");
        int stumarks=input.nextInt();

        Random random=new Random();
        int[][] marks=new int[studentCount][stumarks];

        for(int i=0;i<studentCount;i++){
            for(int j=0;j<stumarks;j++){
                marks[i][j]=random.nextInt(101);
            }
        }

        for(int i=1;i<=stumarks;i++){
            System.out.print("subject"+i+"\t");
        }
        System.out.print("Total");
        System.out.print("\tMin");
        System.out.print("\tMax");
        System.out.print("\tAverage");
        System.out.println();    
        for(int i=0;i<studentCount;i++){
            int total=0;
            double avg=0;
            int min=marks[0][0];
            int max=0;
            for(int j=0;j<stumarks;j++){
                System.out.print(marks[i][j]+"\t\t");
                total +=marks[i][j];
                if(max<marks[i][j]){
                    max=marks[i][j];
                }
                if(marks[i][j]<min){
                    min=marks[i][j];
                }
                
            }
            avg=(double) total/studentCount;
            System.out.print(total+"\t");
            System.out.print(min + "\t");
            System.out.print(max + "\t");
            System.out.printf("%.2f", avg); // Print average with two decimal places
            System.out.println();
        
            
            
        }

    }
}