package kr.syeyoung.rolepreserve.database;

import lombok.Data;

import java.util.List;

@Data
public class MemberDTO {
    private long guildId;
    private long userId;
    private List<Long> roleIds;
}
