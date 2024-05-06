package QD.sy4.no1;

public class sportCommand extends Command {
    private final StudentB studentB;

    public sportCommand() {
        studentB = new StudentB("软件学院常洪");
    }

    @Override
    public void execute() {
        studentB.sportCompetition();
    }
}
