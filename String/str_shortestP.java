public class str_shortestP {
    public static float shortest(String path){
          int x=0,y=0;
         for(int i=0;i<path.length();i++){
            char direction=path.charAt(i);
            if(path.charAt(i)=='E')
            {
                x--;
            }else if(path.charAt(i)=='W'){
                x++;
            }else if(path.charAt(i)=='N'){
                y++;
            }else{
                y--;
            }
         }
         int X2=x*x;
         int Y2=y*y;
         return (float)Math.sqrt(X2+Y2);
    }

public static void main(String args[]){
    String path="WNEENESENNN";
    System.out.println(shortest(path));
   }
}