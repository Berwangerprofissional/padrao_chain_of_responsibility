
public class ExpenseRequest {

    private String description;
    private int amountInCents;

    public ExpenseRequest(String description, int amountInCents) {
        if (description == null || description.trim().isEmpty()) {
            throw new IllegalArgumentException("Description is required");
        }

        if (amountInCents <= 0) {
            throw new IllegalArgumentException("Amount must be positive");
        }

        this.description = description;
        this.amountInCents = amountInCents;
    }

    public String getDescription() {
        return description;
    }

    public int getAmountInCents() {
        return amountInCents;
    }
}
