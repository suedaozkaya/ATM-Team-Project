package sql;

import java.sql.*;

public class ConnectionClose {

    public static void connectionClose(Connection con, Statement st,ResultSet rs) throws SQLException {
        con.close();
        st.close();
        rs.close();
    }
}
