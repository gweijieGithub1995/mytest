package cn.itcast.datasource.druid;

import cn.itcast.utils.JDBCUtils;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DruidTest02 {
    public static void main(String[] args) {
       Connection conn = null;
       PreparedStatement pstmt = null;

        try {
             conn = JDBCUtils.getConnection();
             String sql = "insert into account values(null,?,?)";
             pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,"王五");
            pstmt.setDouble(2,3000);
            int count = pstmt.executeUpdate();
            System.out.println(count);

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
