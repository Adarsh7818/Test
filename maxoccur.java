import java.util.*;
public class maxoccur {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string :");
        String str=sc.nextLine();
        sc.close();

        char maxChar=getmaxoccur(str);
        System.out.println("The max occuring character is "+ maxChar);
 
    }
    public static char getmaxoccur(String str){
    Map<Character,Integer> charCountMap=new HashMap<>();
    for(char c:str.toCharArray()){
        charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
    }
    char maxChar = ' ';
    int maxCount = 0;
    for(Map.Entry<Character,Integer>entry : charCountMap.entrySet()){
        if(entry.getValue()>maxCount){
            maxChar=entry.getKey();
            maxCount=entry.getValue();

        }
    }
    return maxChar;
    }
}
