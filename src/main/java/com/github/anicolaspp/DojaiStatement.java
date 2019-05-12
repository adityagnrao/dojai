package com.github.anicolaspp;

import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.net.URL;
import java.sql.Array;
import java.sql.Blob;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.Date;
import java.sql.NClob;
import java.sql.Ref;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.RowId;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.sql.SQLXML;
import java.sql.Statement;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Map;
import java.util.Properties;

public class DojaiStatement implements Statement {
    
    private final String url;
    private final Properties info;
    
    public DojaiStatement(String url, Properties info) {
        this.url = url;
        this.info = info;
    }
    
    @Override
    public ResultSet executeQuery(String sql) throws SQLException {
        return null;
    }
    
    @Override
    public int executeUpdate(String sql) throws SQLException {
        return 0;
    }
    
    @Override
    public void close() throws SQLException {
    
    }
    
    @Override
    public int getMaxFieldSize() throws SQLException {
        return 0;
    }
    
    @Override
    public void setMaxFieldSize(int max) throws SQLException {
    
    }
    
    @Override
    public int getMaxRows() throws SQLException {
        return 0;
    }
    
    @Override
    public void setMaxRows(int max) throws SQLException {
    
    }
    
    @Override
    public void setEscapeProcessing(boolean enable) throws SQLException {
    
    }
    
    @Override
    public int getQueryTimeout() throws SQLException {
        return 0;
    }
    
    @Override
    public void setQueryTimeout(int seconds) throws SQLException {
    
    }
    
    @Override
    public void cancel() throws SQLException {
    
    }
    
    @Override
    public SQLWarning getWarnings() throws SQLException {
        return null;
    }
    
    @Override
    public void clearWarnings() throws SQLException {
    
    }
    
    @Override
    public void setCursorName(String name) throws SQLException {
    
    }
    
    @Override
    public boolean execute(String sql) throws SQLException {
        return false;
    }
    
    @Override
    public ResultSet getResultSet() throws SQLException {
        return null;
    }
    
    @Override
    public int getUpdateCount() throws SQLException {
        return 0;
    }
    
    @Override
    public boolean getMoreResults() throws SQLException {
        return false;
    }
    
    @Override
    public void setFetchDirection(int direction) throws SQLException {
    
    }
    
    @Override
    public int getFetchDirection() throws SQLException {
        return 0;
    }
    
    @Override
    public void setFetchSize(int rows) throws SQLException {
    
    }
    
    @Override
    public int getFetchSize() throws SQLException {
        return 0;
    }
    
    @Override
    public int getResultSetConcurrency() throws SQLException {
        return 0;
    }
    
    @Override
    public int getResultSetType() throws SQLException {
        return 0;
    }
    
    @Override
    public void addBatch(String sql) throws SQLException {
    
    }
    
    @Override
    public void clearBatch() throws SQLException {
    
    }
    
    @Override
    public int[] executeBatch() throws SQLException {
        return new int[0];
    }
    
    @Override
    public Connection getConnection() throws SQLException {
        return null;
    }
    
    @Override
    public boolean getMoreResults(int current) throws SQLException {
        return false;
    }
    
    @Override
    public ResultSet getGeneratedKeys() throws SQLException {
        return null;
    }
    
    @Override
    public int executeUpdate(String sql, int autoGeneratedKeys) throws SQLException {
        return 0;
    }
    
    @Override
    public int executeUpdate(String sql, int[] columnIndexes) throws SQLException {
        return 0;
    }
    
    @Override
    public int executeUpdate(String sql, String[] columnNames) throws SQLException {
        return 0;
    }
    
    @Override
    public boolean execute(String sql, int autoGeneratedKeys) throws SQLException {
        return false;
    }
    
    @Override
    public boolean execute(String sql, int[] columnIndexes) throws SQLException {
        return false;
    }
    
    @Override
    public boolean execute(String sql, String[] columnNames) throws SQLException {
        return false;
    }
    
    @Override
    public int getResultSetHoldability() throws SQLException {
        return 0;
    }
    
    @Override
    public boolean isClosed() throws SQLException {
        return false;
    }
    
    @Override
    public void setPoolable(boolean poolable) throws SQLException {
    
    }
    
    @Override
    public boolean isPoolable() throws SQLException {
        return false;
    }
    
    @Override
    public void closeOnCompletion() throws SQLException {
    
    }
    
    @Override
    public boolean isCloseOnCompletion() throws SQLException {
        return false;
    }
    
    @Override
    public <T> T unwrap(Class<T> iface) throws SQLException {
        return null;
    }
    
    @Override
    public boolean isWrapperFor(Class<?> iface) throws SQLException {
        return false;
    }
}
