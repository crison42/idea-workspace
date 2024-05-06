package QD.sy4.no1;

public class academicCommand extends Command {
    private final StudentA studentA = new StudentA("软件学院常洪");

    @Override
    public void execute() {
        studentA.academicCompetition();
    }
}
