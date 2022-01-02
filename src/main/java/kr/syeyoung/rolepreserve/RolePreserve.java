package kr.syeyoung.rolepreserve;

import net.dv8tion.jda.api.AccountType;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;

public class RolePreserve {
    public static void main(String args[]) {
        new RolePreserve();
    }

    public RolePreserve() {
        JDA jda = new JDABuilder(AccountType.BOT).setToken("").setStatus(OnlineStatus.ONLINE).addEventListeners()
    }
}
