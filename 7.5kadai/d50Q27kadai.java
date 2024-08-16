// s23024
// Q27のプログラムをコマンドライン引数「1」のとき「Warm」コマンドライン引数「2」のとき「Cool」コマンドライン引数「3」のとき「Wind」と出力されるようにレンジする

class d50Q27kadai {
	public static void main(String[] args) {
		int ans = Integer.parseInt(args[0]);
		String mode;

		switch (ans) {
			case 1:
				mode = "Warm";
				break;
			case 2:
				mode = "Cool";
				break;
			default:
				mode = "Wind";
				break;
		}
		System.out.println(mode);
	}
}
