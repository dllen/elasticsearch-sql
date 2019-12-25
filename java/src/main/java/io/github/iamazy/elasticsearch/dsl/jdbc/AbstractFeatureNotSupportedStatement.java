package io.github.iamazy.elasticsearch.dsl.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.sql.Statement;

/**
 * @author iamazy
 * @date 2019/12/16
 * @descrition
 **/
public abstract class AbstractFeatureNotSupportedStatement implements Statement {

    @Override
    public final int getFetchDirection() throws SQLException {
        throw new SQLFeatureNotSupportedException("getFetchDirection");
    }

    @Override
    public final void setFetchDirection(int direction) throws SQLException {
        throw new SQLFeatureNotSupportedException("setFetchDirection");
    }

    @Override
    public final void addBatch(String sql) throws SQLException {
        throw new SQLFeatureNotSupportedException("addBatch");
    }

    @Override
    public final void clearBatch() throws SQLException {
        throw new SQLFeatureNotSupportedException("clearBatch");
    }

    @Override
    public final int[] executeBatch() throws SQLException {
        throw new SQLFeatureNotSupportedException("executeBatch");
    }

    @Override
    public final void closeOnCompletion() throws SQLException {
        throw new SQLFeatureNotSupportedException("closeOnCompletion");
    }

    @Override
    public final boolean isCloseOnCompletion() throws SQLException {
        throw new SQLFeatureNotSupportedException("isCloseOnCompletion");
    }

    @Override
    public int executeUpdate(String sql) throws SQLException {
        throw new SQLFeatureNotSupportedException("executeUpdate");
    }

    @Override
    public final void setCursorName(String name) throws SQLException {
        throw new SQLFeatureNotSupportedException("setCursorName");
    }

    @Override
    public int getUpdateCount() throws SQLException {
        throw new SQLFeatureNotSupportedException("getUpdateCount");
    }

    @Override
    public boolean getMoreResults() throws SQLException {
        throw new SQLFeatureNotSupportedException("getMoreResults");
    }

    @Override
    public final ResultSet getGeneratedKeys() throws SQLException {
        throw new SQLFeatureNotSupportedException("getGeneratedKeys");
    }

    @Override
    public final int executeUpdate(String sql, int[] columnIndexes) throws SQLException {
        throw new SQLFeatureNotSupportedException("executeUpdate");
    }

    @Override
    public int executeUpdate(String sql, String[] columnNames) throws SQLException {
        throw new SQLFeatureNotSupportedException("executeUpdate");
    }

    @Override
    public final int executeUpdate(String sql, int autoGeneratedKeys) throws SQLException {
        throw new SQLFeatureNotSupportedException("executeUpdate");
    }

    @Override
    public final boolean execute(String sql, int[] columnIndexes) throws SQLException {
        throw new SQLFeatureNotSupportedException("execute");
    }

    @Override
    public boolean execute(String sql, String[] columnNames) throws SQLException {
        throw new SQLFeatureNotSupportedException("execute");
    }

    @Override
    public final boolean execute(String sql, int autoGeneratedKeys) throws SQLException {
        throw new SQLFeatureNotSupportedException("execute");
    }
}