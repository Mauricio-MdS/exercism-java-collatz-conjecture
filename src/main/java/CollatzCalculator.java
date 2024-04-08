class CollatzCalculator {

    private int steps = 0;

    int computeStepCount(int start) {
        if (start < 1) throw new IllegalArgumentException("Only positive integers are allowed");
        if (start == 1) return steps;

        steps++;
        if (start % 2 == 0) return computeStepCount(start/ 2);
        return computeStepCount(3 * start + 1);
    }

}
