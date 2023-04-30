package facadeDesignPattern;

public interface IReportGenerator {
    void createConnection();
    void generateCSVReports();
    void generatePDFReports();
}
