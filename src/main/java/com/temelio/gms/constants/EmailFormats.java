package com.temelio.gms.constants;


import java.util.HashMap;
import java.util.Map;

public class EmailFormats {

    public static Map<EmailEvent, String> EMAIL_EVENT_FORMAT = new HashMap<>() {
        {
            put(EmailEvent.GRANT_ALLOCATED, "Sending money to nonprofit { name } at address { address }");
        }
    };

    public enum EmailEvent {
        GRANT_ACCEPTED, GRANT_ALLOCATED;
    }

}
