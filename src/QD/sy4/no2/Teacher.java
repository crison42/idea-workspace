package QD.sy4.no2;

public class Teacher extends Subject {

    @Override
    public void attach(Observer observer) {
        stuList.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        stuList.remove(observer);
    }

    @Override
    public void notify(String message) {
        for (Observer stu : stuList) {
            stu.update(message);
        }
    }
}
