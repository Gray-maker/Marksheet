import java.util.Scanner;

public class marksheet {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Dedan Kimathi University of Technology");
        System.out.println("School of Computer Science and IT");
        System.out.println("Department of Computer Science");
        System.out.println("Academic Year: 2024/2025");
        System.out.println("STUDENT MARKSHEET (SECOND YEAR RESULTS)\n");

        // Student 1
        System.out.print("Enter Student Registration Number: ");
        String reg1 = input.nextLine();
        System.out.print("Enter Full Name: ");
        String name1 = input.nextLine();
        System.out.println("Enter Marks for 7 Units:");
        System.out.print("CCS 2207: ");
        int s1u1 = input.nextInt();
        System.out.print("CCS 2208: ");
        int s1u2 = input.nextInt();
        System.out.print("CCS 2209: ");
        int s1u3 = input.nextInt();
        System.out.print("CCS 2212: ");
        int s1u4 = input.nextInt();
        System.out.print("CCS 2213: ");
        int s1u5 = input.nextInt();
        System.out.print("CCS 2215: ");
        int s1u6 = input.nextInt();
        System.out.print("IGS 2216: ");
        int s1u7 = input.nextInt();

        int total1 = s1u1+s1u2+s1u3+s1u4+s1u5+s1u6+s1u7;
        double avg1 = total1/7.0;
        input.nextLine();

        // Student 2
        System.out.print("Enter Student Registration Number: ");
        String reg2 = input.nextLine();
        System.out.print("Enter Full Name: ");
        String name2 = input.nextLine();
        System.out.println("Enter Marks for 7 Units:");
        System.out.print("CCS 2207: ");
        int s2u1 = input.nextInt();
        System.out.print("CCS 2208: ");
        int s2u2 = input.nextInt();
        System.out.print("CCS 2209: ");
        int s2u3 = input.nextInt();
        System.out.print("CCS 2212: ");
        int s2u4 = input.nextInt();
        System.out.print("CCS 2213: ");
        int s2u5 = input.nextInt();
        System.out.print("CCS 2215: ");
        int s2u6 = input.nextInt();
        System.out.print("IGS 2216: ");
        int s2u7 = input.nextInt();

        int total2 = s2u1+s2u2+s2u3+s2u4+s2u5+s2u6+s2u7;
        double avg2 = total2/7.0;
        input.nextLine();

        // Student 3
        System.out.print("Enter Student Registration Number: ");
        String reg3 = input.nextLine();
        System.out.print("Enter Full Name: ");
        String name3 = input.nextLine();
        System.out.println("Enter Marks for 7 Units:");
        System.out.print("CCS 2207: ");
        int s3u1 = input.nextInt();
        System.out.print("CCS 2208: ");
        int s3u2 = input.nextInt();
        System.out.print("CCS 2209: ");
        int s3u3 = input.nextInt();
        System.out.print("CCS 2212: ");
        int s3u4 = input.nextInt();
        System.out.print("CCS 2213: ");
        int s3u5 = input.nextInt();
        System.out.print("CCS 2215: ");
        int s3u6 = input.nextInt();
        System.out.print("IGS 2216: ");
        int s3u7 = input.nextInt();

        int total3 = s3u1+s3u2+s3u3+s3u4+s3u5+s3u6+s3u7;
        double avg3 = total3/7.0;
        input.nextLine();

        // Student 4
        System.out.print("Enter Student Registration Number: ");
        String reg4 = input.nextLine();
        System.out.print("Enter Full Name: ");
        String name4 = input.nextLine();
        System.out.println("Enter Marks for 7 Units:");
        System.out.print("CCS 2207: ");
        int s4u1 = input.nextInt();
        System.out.print("CCS 2208: ");
        int s4u2 = input.nextInt();
        System.out.print("CCS 2209: ");
        int s4u3 = input.nextInt();
        System.out.print("CCS 2212: ");
        int s4u4 = input.nextInt();
        System.out.print("CCS 2213: ");
        int s4u5 = input.nextInt();
        System.out.print("CCS 2215: ");
        int s4u6 = input.nextInt();
        System.out.print("IGS 2216: ");
        int s4u7 = input.nextInt();

        int total4 = s4u1+s4u2+s4u3+s4u4+s4u5+s4u6+s4u7;
        double avg4 = total4/7.0;
        input.nextLine();

        // Student 5
        System.out.print("Enter Student Registration Number: ");
        String reg5 = input.nextLine();
        System.out.print("Enter Full Name: ");
        String name5 = input.nextLine();
        System.out.println("Enter Marks for 7 Units:");
        System.out.print("CCS 2207: ");
        int s5u1 = input.nextInt();
        System.out.print("CCS 2208: ");
        int s5u2 = input.nextInt();
        System.out.print("CCS 2209: ");
        int s5u3 = input.nextInt();
        System.out.print("CCS 2212: ");
        int s5u4 = input.nextInt();
        System.out.print("CCS 2213: ");
        int s5u5 = input.nextInt();
        System.out.print("CCS 2215: ");
        int s5u6 = input.nextInt();
        System.out.print("IGS 2216: ");
        int s5u7 = input.nextInt();

        int total5 = s5u1+s5u2+s5u3+s5u4+s5u5+s5u6+s5u7;
        double avg5 = total5/7.0;

        // Table
        System.out.println();
        System.out.println("Student Score Sheet");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        System.out.println("|Reg No.\t\t\t\tFull Name\t\t\t   CS2207\t  CS2208\t  CS2209\t  CS2212\t  CS2213\t  CS2215\t  IGS2216\t  TOTALS\t  AVERAGE  \tSTATUS \tGRADE");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        System.out.println(reg1 + "\t\t" + name1 + "    \t\t\t" + s1u1 + "  \t\t" + s1u2 + "  \t\t" + s1u3 + "  \t\t" + s1u4 + "  \t\t" + s1u5 + "  \t\t" + s1u6 + "  \t\t" + s1u7 + "  \t\t" + total1 + "  \t\t" + avg1 + "  \t\t" + "\t\t" + "\t\t");
        System.out.println(reg2 + "\t\t" + name2 + "    \t\t" + s2u1 + "  \t\t" + s2u2 + "  \t\t" + s2u3 + "  \t\t" + s2u4 + "  \t\t" + s2u5 + "  \t\t" + s2u6 + "  \t\t" + s2u7 + "  \t\t" + total2 + "  \t\t" + avg2 + "  \t\t" + "\t\t" + "\t\t");
        System.out.println(reg3 + "\t\t" + name3 + "    \t\t\t" + s3u1 + "  \t\t" + s3u2 + "  \t\t" + s3u3 + "  \t\t" + s3u4 + "  \t\t" + s3u5 + "  \t\t" + s3u6 + "  \t\t" + s3u7 + "  \t\t" + total3 + "  \t\t" + avg3 + "  \t\t" + "\t\t" + "\t\t");
        System.out.println(reg4 + "\t\t" + name4 + "    \t\t\t" + s4u1 + "  \t\t" + s4u2 + "  \t\t" + s4u3 + "  \t\t" + s4u4 + "  \t\t" + s4u5 + "  \t\t" + s4u6 + "  \t\t" + s4u7 + "  \t\t" + total4 + "  \t\t" + avg4 + "  \t\t" + "\t\t" + "\t\t");
        System.out.println(reg5 + "\t\t" + name5 + "    \t\t\t" + s5u1 + "  \t\t" + s5u2 + "  \t\t" + s5u3 + "  \t\t" + s5u4 + "  \t\t" + s5u5 + "  \t\t" + s5u6 + "  \t\t" + s5u7 + "  \t\t" + total5 + "  \t\t" + avg5 + "  \t\t" + "\t\t" + "\t\t");

        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------");
    }
}

