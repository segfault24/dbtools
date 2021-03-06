package dev.pagefault.eve.dbtools.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dev.pagefault.eve.dbtools.model.MarketGroup;
import dev.pagefault.eve.dbtools.util.Utils;

public class MarketGroupTable {

	private static final String SELECT_ALL_IDS_SQL = "SELECT marketGroupId FROM marketgroup";
	private static final String UPSERT_SQL = "INSERT INTO marketgroup "
			+ "(`marketGroupId`,`parentGroupId`,`marketGroupName`,`description`,`hasTypes`) "
			+ "VALUES (?,?,?,?,?) ON DUPLICATE KEY UPDATE "
			+ "`marketGroupId`=VALUES(`marketGroupId`), `parentGroupId`=VALUES(`parentGroupId`), `marketGroupName`=VALUES(`marketGroupName`), "
			+ "`description`=VALUES(`description`), `hasTypes`=VALUES(`hasTypes`)";

	public static List<Integer> selectAllIds(Connection db) throws SQLException {
		PreparedStatement stmt = db.prepareStatement(SELECT_ALL_IDS_SQL);
		ResultSet rs = stmt.executeQuery();
		List<Integer> types = new ArrayList<Integer>();
		while (rs.next()) {
			types.add(rs.getInt(1));
		}
		Utils.closeQuietly(rs);
		Utils.closeQuietly(stmt);
		return types;
	}

	public static void upsert(Connection db, MarketGroup g) throws SQLException {
		PreparedStatement stmt = db.prepareStatement(UPSERT_SQL);
		stmt.setInt(1, g.getMarketGroupId());
		stmt.setInt(2, g.getParentGroupId());
		stmt.setString(3, g.getMarketGroupName());
		stmt.setString(4, g.getDescription());
		stmt.setBoolean(5, g.hasTypes());
		stmt.execute();
		Utils.closeQuietly(stmt);
	}

	public static void delete(Connection db, MarketGroup g) throws SQLException {
		PreparedStatement stmt = db.prepareStatement("DELETE FROM marketgroup WHERE marketGroupId=?");
		stmt.setInt(1, g.getMarketGroupId());
		stmt.execute();
		Utils.closeQuietly(stmt);
	}

}
