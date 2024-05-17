// s23024
// ポリモフィズムの課題 サブクラスCatにスーパークラスAnimalを継承し,d48Q2kadaiクラスでインスタンス化し出力させる

//次の課題に取り組んでください
//「d48Q2kadai.java」に追記で、サブクラスとして新しく「cat」を作成
//ポリフィズムによりmakeSound()メソッドを
//呼び出したときに「ニャー」と出力するプログラムを作成してください

//また１行目にコメントで学籍番号
//２行目のコメントで「どのようなプログラム」かを記入してください

//コンパイル、実行できたらGithubにアップしてください（初回なので一緒にやります）
//Classroomの課題にはリポジトリのURLを投稿してください（初回なので一緒にやります）

//スーパークラスアニマルの定義
class Animal {
    
    public void makesound() {
        System.out.println("動物の音");
    }
    
    public void test() {
        System.out.println("テスト出力");
    }
}

//継承したサブクラスDogの定義
class Dog extends Animal {
    public void makesound() {
        System.out.println("ワンワン");
    }
}

//追記 継承したサブクラスCatの定義
class Cat extends Animal {
    public void makesound() {
        System.out.println("ニャー");
    }
}

public class d48Q2kadai {
     public static void main(String[] args) {
        Animal a = new Dog(); //インスタンス化
	Animal b = new Cat(); //追記 インスタンス化
        a.makesound(); //どのような処理になるでしょう
	b.makesound(); //追求 処理
        a.test(); //どの等な処理になるでしょう
    }
}
