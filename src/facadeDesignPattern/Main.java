package facadeDesignPattern;

public class Main {
    public static void main(String[] args) {
        ReportFacade reportFacade = new ReportFacade();

        reportFacade.generateReport("oracle", "csv");
    }
}
