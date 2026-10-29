
public class ExpenseApprovalService {

    private final ExpenseApprover firstApprover;

    public ExpenseApprovalService(ExpenseApprover firstApprover) {
        if (firstApprover == null) {
            throw new IllegalArgumentException(
                    "First approver is required"
            );
        }

        this.firstApprover = firstApprover;
    }

    public void approve(ExpenseRequest request) {
        firstApprover.approve(request);
    }
}
