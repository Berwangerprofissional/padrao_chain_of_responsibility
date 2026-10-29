
public class Main {

    public static void main(String[] args) {

        // Criando os aprovadores
        ExpenseApprover leader = new TeamLeaderApprover();
        ExpenseApprover manager = new ManagerApprover();
        ExpenseApprover director = new DirectorApprover();
        ExpenseApprover president = new PresidentApprover();

        // Montando a cadeia
        leader.setNext(manager);
        manager.setNext(director);
        director.setNext(president);
        president.setNext(null);

        // O serviço recebe apenas o início da cadeia
        ExpenseApprovalService service =
                new ExpenseApprovalService(leader);

        System.out.println("=== DESPESAS PRINCIPAIS ===");

        service.approve(
                new ExpenseRequest("Office supplies", 30000)
        );

        service.approve(
                new ExpenseRequest("Training", 150000)
        );

        service.approve(
                new ExpenseRequest("Equipment", 800000)
        );

        service.approve(
                new ExpenseRequest("Office renovation", 1500000)
        );

        System.out.println("\n=== LIMITES EXATOS ===");

        service.approve(
                new ExpenseRequest("Exact leader limit", 50000)
        );

        service.approve(
                new ExpenseRequest("Exact manager limit", 200000)
        );

        service.approve(
                new ExpenseRequest("Exact director limit", 1000000)
        );

        System.out.println("\n=== DESAFIO: PRESIDENCIA ===");

        service.approve(
                new ExpenseRequest("Large renovation", 1500000)
        );

        service.approve(
                new ExpenseRequest("Exact president limit", 5000000)
        );

        service.approve(
                new ExpenseRequest("Above president limit", 5000001)
        );
    }
}
