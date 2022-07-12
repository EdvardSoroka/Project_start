package SE;

public class DelenieCheck {
        public static void main(String[] args){
            int x = 5;
            int y = 27;
            int p = 5;
            System.out.println(result(x,y,p));
        }
        public static int result(int x, int y, int p) {
            if (x%p == 0)
                return( y/p - x/p + 1);
            return(y/p - x/p);
        }
}
