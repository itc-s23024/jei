public class d52Q5 {
   public static void main(String[] args){
      String majors = "+----";
      int LIMIT = 400;
      if(args.length == 0) return;
      int max = 0, i = 0;
      int[] data = new int[args.length]; //(28)ウ argsと同じ要素数の配列dataを作成
      for(String s : args) {
          data[i] = Integer.parseInt(s);
          if(data[i] <= 0 || data[i] >= LIMIT) return; //(29) 説明１. より、1以上400未満、つまり0以下または400以上という事
          if(max < data[i]){ //(30)イ 見出し行を表示するための最大maxを記録
              max = data[i];
          }
          i++;
      }
      // 目盛り表示
      int majormax = (max - 1) / 5 + 1;
      System.out.print("      "); //半角スペース7個分
      for ( i = 0; i < majormax; i++) {
          System.out.print(majors.charAt(i % 5)); //(31)イ 0~4の範囲で+と-を出力させたいから
      }
      System.out.println("");

      // グラフ表示
      for (i = 0; i < data.length; i++) {
          System.out.printf("%40d : ", data[i]);
          int n = (data[i] - 1) / 5 + 1; // (32)イ 説明2. より例えば整数13で考えてみると良い
          for(int j = 0; j < n; j++) {
              System.out.print("*");
          }
          System.out.println("");
      }
   }
}
