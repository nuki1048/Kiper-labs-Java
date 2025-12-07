class CalculatorException extends Exception {

    private Double value;
    private Range range;
    private String operation;

    CalculatorException(String message, String operation, Double value) {
        super(message);
        this.operation = operation;
        this.value = value;
        this.range = null;
    }

    CalculatorException(String message, String operation, Double value, Range range) {
        super(message);
        this.operation = operation;
        this.value = value;
        this.range = range;
    }

    @Override
    public String getMessage() {

        StringBuilder sb = new StringBuilder();

        sb.append("Операція: ").append(operation).append("\n")
                .append("Значення: ").append(value).append("\n");

        if (range != null)
            sb.append("Очікуваний діапазон/набір: ")
                    .append(range.description()).append("\n");

        sb.append("Результат: ").append(super.getMessage());

        return sb.toString();
    }
}
