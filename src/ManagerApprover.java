
public class ManagerApprover extends ExpenseApprover {

    private static final int LIMIT = 200000;

    @Override
    protected boolean canApprove(ExpenseRequest request) {
        return request.getAmountInCents() <= LIMIT;
    }

    @Override
    protected void approveExpense(ExpenseRequest request) {
        System.out.println(
                "Manager approved: " + request.getDescription()
        );
    }
}
