package bitlab.askar.module1.lesson7;

public class Main {

    public static void main(String[] args) {
        String result = login("User","qwerty");
        System.out.println(result);

        System.out.println(max(3,5));

        System.out.println(max(4,5,6));

    }

    public static String login(String login, String password){

        if (login.equals("User") && password.equals("qwerty")){
            return "logged in";
        }else {
            return "error, incorrect login or password";
        }
    }


    public static int max(int a,int b){
        if (a>b) return a;
        return b;
    }

    public static int max(int a,int b,int c){
        if (a>b){
            if (a>c) return a;
            return c;
        }else {
            if (b>c) return b;
            return c;
        }
    }

    public static int max(int[] a){
        int max = a[0];

        for (int i=0;i<a.length;i++){
            if (max<a[i]){
                max = a[i];
            }
        }

        return max;
    }

    public static int find(String string){
        int cnt = 0;




        return cnt;
    }


}
