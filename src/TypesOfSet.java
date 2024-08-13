import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class TypesOfSet {
    public void TypesOfSet(){
        HashSet<Integer> str=new HashSet<>();
        LinkedHashSet<Integer> str2=new LinkedHashSet<>();
        TreeSet<Integer> str3=new TreeSet<>();

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of the Hashset: ");
        int size=sc.nextInt();
        System.out.println("Enter values: ");


            for(int i=0;i< size;i++){
                int values=sc.nextInt();
                str.add(values);
                str2.add(values);
                str3.add(values);
            }
            System.out.println("HashSet: "+str);
            System.out.println("LinkedHashSet: "+str2);
            System.out.println("TreeSet: "+str3);

    }

    public static void main(String[] args) {
        TypesOfSet obj=new TypesOfSet();
        obj.TypesOfSet();
    }
}
