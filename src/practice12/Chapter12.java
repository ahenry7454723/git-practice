package practice12;

import java.sql.SQLException;

public class Chapter12 {

	public static void main(String[] args) {
		try {
			int array[] = { 1, 3, 5 };
			Chapter12.validIndex(array, 2);
			Chapter12.validIndex(array, 3);

			System.out.println("validIndexの呼び出し終了");
		} catch (IllegalArgumentException e) {
			System.out.println("IllegalArgumentExceptionが発生しました");
			e.printStackTrace();
		}

		// tryを記述
		// ・throwSQLExceptionメソッドを呼び出す
		try {
			Chapter12.throwSQLException();

			// catchを記述
			// ・SQLExceptionをキャッチして、メッセージとスタックトレースを出力
			// ・"throwSQLExceptionの呼び出し終了"のメッセージを出力
		} catch (SQLException e) {
			System.out.println("mainメソッド終了");
		}
	}

	// validIndexメソッドを作成
	public static void validIndex(int[] array, int index) {
		// ・indexがarrayのサイズの範囲内なら、インデックスの要素を出力
		// ・サイズの範囲外なら、IllegalArgumentExceptionをスロー		
		if (array.length <= index) {
			throw new IllegalArgumentException(index + "はサイズの範囲外です");
		}
		System.out.println("インデックス " + index + " の要素は " + array[index] + " です");
	}

	public static void throwSQLException() throws SQLException {
		// SQLExceptionは、通常、SQLでエラーの場合に発生する例外
		throw new SQLException("SQLエラーです");
	}
}