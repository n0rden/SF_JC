public class ToTable {
    private int[] data;
    private int x;
    private int y;


    public ToTable(int[] data, int x, int y) {
        this.data = data;
        this.x = x;
        this.y = y;
    }

    public int[][] resize() {
        int[][] arrNum = new int[x][y];

        int num = 0;
        for (int i = 0; i < arrNum.length; i++) {
            for (int j = 0; j < arrNum[i].length; j++) {
                arrNum[i][j] = data[num];
                num++;
            }
        }
        return arrNum;
    }
}
