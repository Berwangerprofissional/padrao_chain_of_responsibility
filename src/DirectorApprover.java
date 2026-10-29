
public class DirectorApprover extends ExpenseApprover {

    private static final int LIMIT = 1000000;

    @Override
    protected boolean canApprove(ExpenseRequest request) {
        return request.getAmountInCents() <= LIMIT;
    }

    @Override
    protected void approveExpense(ExpenseRequest request) {
        System.out.println(
                "Director approved: " + request.getDescription()
        );
    }
}
