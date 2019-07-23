package org.baeldung.registration;

import java.util.Locale;

import lombok.Getter;
import org.baeldung.persistence.model.User;
import org.springframework.context.ApplicationEvent;

@Getter
@SuppressWarnings("serial")
public class OnRegistrationCompleteEvent extends ApplicationEvent {

    private final String appUrl;
    private final Locale locale;
    private final User user;

    public OnRegistrationCompleteEvent(final User user, final Locale locale, final String appUrl) {
        super(user);
        this.user = user;
        this.locale = locale;
        this.appUrl = appUrl;
    }
}
