package com.panda.fix.config;

import com.panda.fix.constant.FixSessionType;
import com.panda.fix.session.FixSession;

import java.util.HashMap;
import java.util.Map;

public class FixConfig {
    public void load(String configPath) {

    }

    public Map<String, FixSession> createSessions() {
        Map<String, FixSession> sessions = new HashMap<>();
        FixSession fixSession1 = new FixSession();
        fixSession1.setSessionName("TEST-EDWIN");
        fixSession1.setTargetCompId("EDWIN");
        fixSession1.setSourceComId("TEST");
        fixSession1.setType(FixSessionType.ACCEPTOR);
        fixSession1.setPort(12345);
        sessions.put("TEST-EDWIN", fixSession1);
        return sessions;
    }
}