package template;

/**
 * Abstract base class representing a generic task.
 *
 * <p>This class implements the Template Method design pattern.
 * It defines the fixed structure of the algorithm in the {@code execute()} method
 * while allowing subclasses to provide specific behavior through {@code doExecute()}.</p>
 *
 * <p>The execution flow ensures that an audit trail is recorded
 * before performing the actual task logic.</p>
 */

public class Main {
    public static void main(String[] args){
        var task = new TransferMoneyTask();
        task.execute();

        var task1 = new GenerateReportTask();
        task1.execute();
    }
}
