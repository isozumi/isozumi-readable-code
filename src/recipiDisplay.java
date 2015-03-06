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
public class recipiDisplay {

	/**
	 * @param args
	 * レシピ情報を出力する
	 */
	public static void main(String[] args) {

		/////////////////////////////////////
		//変数宣言

		String outputMessage=null;					//メッセージ出力用
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
			outputMessage = bufferedReader.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}

		/////////////////////////////////////
		//実行結果出力
		System.out.println(outputMessage);

	}

}
