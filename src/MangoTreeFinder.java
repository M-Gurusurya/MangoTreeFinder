import java.util.*;
public class MangoTreeFinder {
        public static void main(String[] args)
        {
            Scanner sc=new Scanner(System.in);
            int row=sc.nextInt();
            int column=sc.nextInt();
            int tree_number=sc.nextInt();
            boolean flag=false;
            if(tree_number <= column)
            {
                flag=true;
            }
            else if(tree_number <= column * row)
            {
                for (int iterator = 1; (iterator * column) <= tree_number; iterator++)
                {
                    if (iterator * column == tree_number)
                        flag = true;
                    else if ((iterator * column) + 1 == tree_number)
                        flag = true;
                }
            }
            String result=flag==true?"true":"false";
            System.out.println(result);
        }
}
