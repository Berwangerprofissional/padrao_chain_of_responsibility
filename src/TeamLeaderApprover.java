
public class TeamLeaderApprover extends ExpenseApprover {

    private static final int LIMIT = 50000;

    @Override
    protected boolean canApprove(ExpenseRequest request) {
        return request.getAmountInCents() <= LIMIT;
    }

    @Override
    protected void approveExpense(ExpenseRequest request) {
        System.out.println(
                "Team leader approved: " + request.getDescription()
        );
    }
}
