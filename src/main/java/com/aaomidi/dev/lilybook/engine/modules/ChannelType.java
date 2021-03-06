package com.aaomidi.dev.lilybook.engine.modules;

import com.aaomidi.dev.lilybook.LilyBook;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum ChannelType {
    ADMIN_CHAT_MESSAGE("AdminChatMessage"),
    ALERT_CLEAR_SERVERS("AlertClearServers"),
    ALERT_SERVERS("AlertServers"),
    DISPATCH_COMMAND("DispatchCommand"),
    MESSAGE_PLAYER("MessagePlayer"),
    NOTIFY_STAFF("NotifyStaff"),
    PLAYER_LIST("PlayerList"),
    STAFF_LIST("StaffList");

    private final String channelName;

    @Override
    public String toString() {
        return LilyBook.getLILY_CHANNEL() + channelName;
    }

}
