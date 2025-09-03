public final class EmployeeCSV {
    private final String csvRow;

    public EmployeeCSV(String csvRow) {
        this.csvRow = csvRow;
    }

    public String getCsvRow() {
        return csvRow;
    }

    public String[] tokens() {
        return csvRow.split(",");
    }
}
