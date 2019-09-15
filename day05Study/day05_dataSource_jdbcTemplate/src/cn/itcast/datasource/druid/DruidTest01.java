package cn.itcast.datasource.druid;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.ConnectionBuilder;
import java.util.Properties;

public class DruidTest01 {
    public static void main(String[] args) throws Exception {

        Properties prop = new Properties();

        InputStream is = DruidTest01.class.getClassLoader().getResourceAsStream("druid.properties");

        prop.load(is);

        DataSource ds = DruidDataSourceFactory.createDataSource(prop);
        ConnectionBuilder conn = ds.createConnectionBuilder();


    }
}
