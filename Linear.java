import java.util.*;

public class Linear{
    public static void main(String[] args){
int[] search={25,9,6,8,52,64};
int temp=64;
int not=0;
for(int i=0;i<search.length;i++){
    if(temp==search[i]){
        System.out.println("We get the indix of our number " +i+"");
        not=not+1;
    }
    }
if(not==0){
            System.out.println("not found our number in the array");
    }

}
    }

