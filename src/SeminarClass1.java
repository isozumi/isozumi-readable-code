import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 */

/**
 * @author isozumi
 *
 */
public class SeminarClass1 {

	/**
	 * @param args
	 * オムライスのレシピを出力する
	 */
	public static void main(String[] args) {

		/////////////////////////////////////
		//変数宣言

		String output=null;					//メッセージ出力用
		String dataFilePath=null;			//データファイル指定用

		/////////////////////////////////////
		//読み込みファイルの指定
		dataFilePath="data/data.txt";

		/////////////////////////////////////
		//ファイル読み込み

		FileReader fileReader = null;
		try {
			fileReader = new FileReader(dataFilePath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		BufferedReader bufferedReader=new BufferedReader(fileReader);

		try {
			output = bufferedReader.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}

		//実行結果出力
		System.out.println(output);

	}

}
