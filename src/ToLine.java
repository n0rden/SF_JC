public class ToLine {
    private int[][] data;

    public ToLine(int[][] data) {
        this.data = data;
    }

    public int[] resize() {
        int size = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                size++;
            }
        }

        int[] arrNum = new int[size];

        int num = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                arrNum[num] = data[i][j];
                num++;
            }
        }
        return arrNum;
    }
}
