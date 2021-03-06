package net.fortuna.ical4j.data;

import net.fortuna.ical4j.model.Component;
import net.fortuna.ical4j.model.ComponentFactory;
import net.fortuna.ical4j.model.component.*;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class DefaultComponentFactorySupplier implements Supplier<List<ComponentFactory<? extends Component>>> {

    @Override
    public List<ComponentFactory<? extends Component>> get() {
        List<ComponentFactory<?>> rfc5545 = Arrays.asList(new Available.Factory(), new Daylight.Factory(), new Standard.Factory(),
                new VAlarm.Factory(), new VAvailability.Factory(), new VEvent.Factory(),
                new VFreeBusy.Factory(), new VJournal.Factory(), new VTimeZone.Factory(),
                new VToDo.Factory(), new VVenue.Factory());

        return rfc5545;
    }
}
