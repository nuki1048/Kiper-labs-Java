class Range {

    private Double min, max;
    private double[] set;

    Range(double min, double max) {
        this.min = min;
        this.max = max;
        this.set = null;
    }

    Range(double[] set) {
        this.set = set;
        this.min = this.max = null;
    }

    boolean contains(double value) {
        if (set != null) {
            for (double d : set) if (d == value) return true;
            return false;
        }
        return value >= min && value <= max;
    }

    String description() {
        if (set != null) {
            StringBuilder sb = new StringBuilder("{ ");
            for (double d : set) sb.append(d).append(" ");
            sb.append("}");
            return sb.toString();
        }
        return "[" + min + ", " + max + "]";
    }
}
