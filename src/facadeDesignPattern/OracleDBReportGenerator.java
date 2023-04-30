package facadeDesignPattern;

public class OracleDBReportGenerator implements IReportGenerator{
    @Override
    public void createConnection() {
        System.out.println("Connection with oracle DB created.");
    }

    @Override
    public void generateCSVReports() {
        System.out.println("Generating CSV reports from oracle DB.");
    }

    @Override
    public void generatePDFReports() {
        System.out.println("Generating PDF reports from oracle DB.");
    }
}
