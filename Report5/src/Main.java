public class Main {
    public static void main(String[] args) throws Exception {
       try {
         String str = null;
         System.err.println(str.length());
       } catch (NullPointerException e){
            System.err.println("NullPointerExceptiが発生しました。");

            System.err.println("エラーメッセージ:"+e.getMessage());
       }

    }

    
}
