import java.util.List;
public class Probabilities {
    private int[][] data;
    private int totalDays;

    public Probabilities(int[][] data) {
        this.data = data;
        this.totalDays = 0;
        for (int[] row : data) {
            for (int cell : row) {
                this.totalDays += cell;
            }
        }
    }

    public double marginalA() {
        int totalA = 0;
        for (int i = 0; i < data[0].length; i++) {
            totalA += data[0][i];
        }
        return (double) totalA / totalDays;
    }

    public double marginalNotA() {
        int totalNotA = 0;
        for (int i = 0; i < data[1].length; i++) {
            totalNotA += data[1][i];
        }
        return (double) totalNotA / totalDays;
    }

    public double marginalB() {
        int totalB = 0;
        for (int i = 0; i < data.length; i++) {
            totalB += data[i][0];
        }
        return (double) totalB / totalDays;
    }

    public double marginalNotB() {
        int totalNotB = 0;
        for (int i = 0; i < data.length; i++) {
            totalNotB += data[i][1];
        }
        return (double) totalNotB / totalDays;
    }

    public double jointAB() {
        return (double) data[0][0] / totalDays;
    }

    public double jointNotANotB() {
        return (double) data[1][1] / totalDays;
    }

    public double conditionalBGivenA() {
        int totalA = 0;
        for (int i = 0; i < data[0].length; i++) {
            totalA += data[0][i];
        }
        return (double) data[0][0] / totalA;
    }

    public double conditionalBGivenNotA() {
        int totalNotA = 0;
        for (int i = 0; i < data[1].length; i++) {
            totalNotA += data[1][i];
        }
        return (double) data[1][0] / totalNotA;
    }

    public double conditionalNotBGivenA() {
        int totalA = 0;
        for (int i = 0; i < data[0].length; i++) {
            totalA += data[0][i];
        }
        return (double) data[0][1] / totalA;
    }

    public double conditionalNotBGivenNotA() {
        int totalNotA = 0;
        for (int i = 0; i < data[1].length; i++) {
            totalNotA += data[1][i];
        }
        return (double) data[1][1] / totalNotA;
    }

    public double conditionalAGivenB() {
        int totalB = 0;
        for (int i = 0; i < data.length; i++) {
            totalB += data[i][0];
        }
        return (double) data[0][0] / totalB;
    }

    public double conditionalAGivenNotB() {
        int totalNotB = 0;
        for (int i = 0; i < data.length; i++) {
            totalNotB += data[i][1];
        }
        return (double) data[0][1] / totalNotB;
    }
}
