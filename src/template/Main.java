package template;

public class Main {
    public static void main(){
        var task = new TransferMoneyTask();
        task.execute();

        var task1 = new GenerateReportTask();
        task1.execute();
    }
}
