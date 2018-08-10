import java.util.Arrays;
import java.util.Scanner;

public class Demo12 {
    public static void main(String[] args){
        /*考试完毕后，求4名学生3门课程的
        每门课程的平均分和每名同学的总分*/

        //定义一个二维数组，接收4名学生的3门课程的成绩
        double[][] scores=new double[2][3];
        //创建实例对象
        Scanner scanner=new Scanner(System.in);
        //利用双层for接收用户输入的数据
        for (int i=0;i<scores.length;i++){
            for (int j=0;j<scores[0].length;j++){
                //提醒用户输入数据
                System.out.println("请输入第"+(i+1)+"名同学的"+"第"+(j+1)+"门成绩：");
                //保存用户输入的数据到二维数组中
                scores[i][j]=scanner.nextDouble();
            }
        }
        //遍历二维数组，将学生总分添加到新建数组中；把每门课程总分添加到另一个新建数组
        for (double[] arr:scores){
            //System.out.println(Arrays.toString(arr));
        }
        double[] stuScoresSum=new double[scores.length];//新建数组存储学生总分
        double[] avgScores=new double[scores[0].length];//新建数组存储每门课程的平均分
        //利用双层for循环分别添加数据到新数组
        for (int m=0;m<scores.length;m++){
            double stuSum=0;//定义学生总分，确保每次从零开始相加
            for (int n=0;n<scores[0].length;n++){
                stuSum+=scores[m][n];
            }
            stuScoresSum[m]=stuSum;//把每次的学生总分添加到新数组中
        }
        //System.out.println(Arrays.toString(stuScoresSum));
        System.out.println("**************************************");
        //输出每位学生的总分
        //对stuScoresSum遍历,输出每位学生的总分
        for (int a=0;a<stuScoresSum.length;a++){
            System.out.println("第"+(a+1)+"位同学的总分为："+stuScoresSum[a]);
        }
        System.out.println("**************************************");
        //利用for双层嵌套添加数据到新数组
        for (int o=0;o<scores[0].length;o++){//o的值可以取0-scores[0].length-1，代表avgScores的长度
            double scoresSum=0;//定义课程总分，确保每次从零开始相加
            for (int l=0;l<scores.length;l++){
                scoresSum+=scores[l][o];
            }
            avgScores[o]=scoresSum/scores.length;//把平均值添加到avgScores中
        }
        //对avgScores进行遍历，输出每门课程的平均分
        for (int b=0;b<avgScores.length;b++){
            System.out.println("第"+(b+1)+"门课程的平均分为："+avgScores[b]);
        }

    }
}
