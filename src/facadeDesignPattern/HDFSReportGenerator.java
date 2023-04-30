package facadeDesignPattern;

public class HDFSReportGenerator implements IReportGenerator{
    @Override
    public void createConnection() {
        System.out.println("Connection with HDFS created.");
    }

    @Override
    public void generateCSVReports() {
        System.out.println("Generating CSV reports from HDFS.");
    }

    @Override
    public void generatePDFReports() {
        System.out.println("Generating PDF reports from HDFS.");
    }
}
