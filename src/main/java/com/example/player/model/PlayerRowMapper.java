/*
 * You can use the following import statements
 * 
 * import java.sql.ResultSet;
 * import java.sql.SQLException;
 * import org.springframework.jdbc.core.RowMapper;
 * 
 */
package com.example.player.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class PlayerRowMapper implements RowMapper<Player> {
    public Player mapRow(ResultSet rs, int rowNum) throw SQLException {
        return new Player(
            rs.getInt("playerId"),
            rs.getString("PlayerName"),
            rs.getInt("jerseyNumber"),
            rs.getString("role"));
    }
}
