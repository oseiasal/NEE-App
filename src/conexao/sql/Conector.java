package conexao.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import android.annotation.SuppressLint;
import android.os.StrictMode;
import android.util.Log;

public class Conector {

	@SuppressLint("NewApi")
	public static Connection getConnection() {

		StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
		StrictMode.setThreadPolicy(policy);

		Connection cn = null;
		// FIX: Ao trocar o ip, começou a encerrar a aplicação.
		try {
			String ip = "192.168.0.106";
			String porta = "1433";
			String banco = "NEE";
			String url = "jdbc:jtds:sqlserver://" + ip + ":" + porta + "/" + banco;
			String usuario = "bd807772013";
			String senha = "123456";

			Class.forName("net.sourceforge.jtds.jdbc.Driver").newInstance();
			cn = DriverManager.getConnection(url, usuario, senha);

			Log.e("BANCO", "Conexão Aberta");

		} catch (SQLException e) {

			Log.e("BANCO", "Erro 1: " + e.getMessage());
		} catch (ClassNotFoundException e) {

			Log.e("BANCO", "Erro2" + e.getMessage());
		} catch (Exception e) {

			Log.e("BANCO", "Erro3" + e.getMessage());
		}
		return cn;
	}
}
