package nl.han.oose.dea.lesson8.view;

import nl.han.oose.dea.lesson8.model.Clock;

public class TwelveHour extends ConsoleView {

    // implements https://en.wikipedia.org/wiki/12-hour_clock#Confusion_at_noon_and_midnight
    public String timeToString(Clock clock) {
        return String.format(
                "{%02d:%02d:%02d %s}",
                clock.getHours() %12 == 0 ? 12 : clock.getHours() % 12,
                clock.getMinutes(),
                clock.getSeconds(),
                clock.getHours() < 12 ? "a.m." : "p.m.");
    }
}
