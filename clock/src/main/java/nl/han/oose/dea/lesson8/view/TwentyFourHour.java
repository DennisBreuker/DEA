package nl.han.oose.dea.lesson8.view;

import nl.han.oose.dea.lesson8.model.Clock;

public class TwentyFourHour extends ConsoleView {

    public String timeToString(Clock clock) {
        return String.format(
                "[%02d:%02d:%02d]",
                clock.getHours(),
                clock.getMinutes(),
                clock.getSeconds());
    }
}
