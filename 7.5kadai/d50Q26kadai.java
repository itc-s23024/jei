// s23024 
// 列挙型の課題
// Q26をアレンジして、列挙型で定義したConditionの要素全て
// を出力する課題

enum Condition {ROAD, MUD, SNOW}

class d50Q26kadai {
	public static void main(String[] args) {
		for (int i=0; i < Condition.values().length; i++) {
			System.out.println("Condition is " + Condition.values()[i]);
		}
	}
}
