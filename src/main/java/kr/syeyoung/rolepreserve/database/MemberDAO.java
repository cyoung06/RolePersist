package kr.syeyoung.rolepreserve.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MemberDAO {
    public static boolean writeData(MemberDTO dto) throws SQLException {
        try (Connection conn = SQLiteConnection.getConnection()) {
            PreparedStatement psmt = conn.prepareStatement("INSERT INTO UserRoles (guildId,userId,roleId) VALUES (?,?,?);");
            psmt.setLong(1, dto.getGuildId());
            psmt.setLong(2, dto.getUserId());
            psmt.set
        }
        return true;
    }
}
