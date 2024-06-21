// s23024
// Q26のコードをアレンジして数字「5.5」を実行例のように引数で指定するように指定する

public class d49Q26kadai {
   public static void main(String[] args) {
   d49Q26kadai obj = new d49Q26kadai();
   obj.show(args[0]);
   }

   void show(String n) {
     System.out.print("value is " + n);
   }
}
