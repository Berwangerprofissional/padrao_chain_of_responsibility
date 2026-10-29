
public class PresidentApprover extends ExpenseApprover {

    private static final int LIMIT = 5000000;

    @Override
    protected boolean canApprove(ExpenseRequest request) {
        return request.getAmountInCents() <= LIMIT;
    }

    @Override
    protected void approveExpense(ExpenseRequest request) {
        System.out.println(
                "President approved: " + request.getDescription()
        );
    }
}
