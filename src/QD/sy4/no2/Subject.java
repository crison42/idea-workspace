package QD.sy4.no2;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    protected List<Observer> stuList = new ArrayList<>();

    public abstract void attach(Observer observer);

    public abstract void detach(Observer observer);

    public abstract void notify(String message);
}
