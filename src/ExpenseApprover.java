
public abstract class ExpenseApprover {

    private ExpenseApprover next;

    public void setNext(ExpenseApprover next) {
        this.next = next;
    }

    public void approve(ExpenseRequest request) {
        if (canApprove(request)) {
            approveExpense(request);
        } else if (next != null) {
            next.approve(request);
        } else {
            System.out.println(
                    "No approver available: " + request.getDescription()
            );
        }
    }

    protected abstract boolean canApprove(ExpenseRequest request);

    protected abstract void approveExpense(ExpenseRequest request);
}
