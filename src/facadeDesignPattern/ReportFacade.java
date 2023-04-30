package facadeDesignPattern;

public class ReportFacade {

    public void generateReport(String dataSourceType, String reportType){
        if(dataSourceType.equalsIgnoreCase("oracle")){
            IReportGenerator reportGenerator = new OracleDBReportGenerator();
            reportGenerator.createConnection();
            if(reportType.equalsIgnoreCase("csv")){
                reportGenerator.generateCSVReports();
            } else if (reportType.equalsIgnoreCase("pdf")) {
                reportGenerator.generatePDFReports();
            }
        } else if (dataSourceType.equalsIgnoreCase("hdfs")) {
            IReportGenerator reportGenerator = new HDFSReportGenerator();
            reportGenerator.createConnection();
            if(reportType.equalsIgnoreCase("csv")){
                reportGenerator.generateCSVReports();
            } else if (reportType.equalsIgnoreCase("pdf")) {
                reportGenerator.generatePDFReports();
            }
        }
    }
}
