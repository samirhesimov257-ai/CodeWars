import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {




        /*
        cumlenin pangram oldugunu yoxla
         */
//        String sentence="The quick brown fox jumps over the lazy dog.";
//        for (char abc = 'a'; abc<='z'; abc++){
//            String a= sentence.toLowerCase();
//            if (!a.contains(""+abc)){
//                System.out.println("bu pangram deyil");
//                break;
//            }if (abc=='z'){
//                System.out.println("bu pangramdir");
//            }
//        }



        /*
        Boyuk herflere gore ayir
         */
//        Scanner sc= new Scanner(System.in);
//        String input= sc.nextLine();//samirHashimov
//        System.out.println(  input.replaceAll("([A-Z])", " $1"));
//        int indexA=0;
//        int indexB=0;
//        StringBuilder a=new StringBuilder();
//        for (int i=1;i<input.length();i++){
//            if (Character.isUpperCase(input.charAt(i))){
//                indexA=indexB;
//                indexB=i;
//                a.append(input.substring(indexA, indexB)).append(" ");
//            }
//
//        }
//        a.append(input.substring(indexB));
//        System.out.println(a);



        /*
        verilmis stringlerin birlesdirerek yeni unikal string alinmasi
         */
//        var list=new  TreeSet<Character>();
//        String s1="absed";
//        String s2="abed";
//
//        for (char ch:s1.toCharArray()){
//            list.add(ch);
//        }
//        for (char ch:s2.toCharArray()){
//            list.add(ch);
//        }
//        StringBuilder word= new StringBuilder();
//        for (Character a:list){
//            word.append(a);
//        }
//        System.out.println(word.toString());


//        /*
//        verilmis soz tek saylidisa ortadaki herfi, cut saydadisa ortadaki 2 herfide gotur
//         */
//        String word="slam";
//        int x=word.length()/2;
//        if (word.length()%2!=0){
//            System.out.println(word.charAt(x)+"");
//        }else System.out.println(word.charAt(x-1)+""+word.charAt(x));


//        /*
//        verilmis arrayda ancaq 1 dene cut qalani tek (ve ya tersine) ededler olacaq aralarindaki 1 deneni tap
//         */
//        int [] arr={2,4,6,8,0,12,14,7};
//        var oddList=new ArrayList<Integer>();
//        var evenList=new ArrayList<Integer>();
//
//        for (int i=0;i<arr.length;i++){
//           if (arr[i]%2==0) evenList.add(arr[i]);
//           else oddList.add(arr[i]);
//
//        }
//        if (oddList.size()<2) System.out.println(oddList.getFirst());
//        else System.out.println(evenList.getFirst());


//
//        /*
//        verilmmis stringin icinde sait olub olmadigini yoxlanmasi
//         */
//        String word = "sa;oufihaenufnaskldnfm;iawnfsajkndfm;o";
//        int count =0;
//        for(int i=0; i<word.length();i++){
//            char ch=word.charAt(i);
//            if (ch=='a' || ch=='i' || ch=='e' || ch=='o' || ch=='u' ){
//                count++;
//            }
//        }
//        System.out.println(word.indexOf("o"));
//        System.out.println(word.indexOf("o"));

    }
}