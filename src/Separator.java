public class Separator {
    int[] array;

    public Separator(int[] array) {
        this.array = array;
    }

    public int[] even() {
        StringBuilder sb = new StringBuilder();
        for (int i : array) {
            if (i % 2 == 0) {
                sb.append(i);
            }
        }

        String[] str = sb.toString().split("");
        int[] arr = new int[str.length];

        for (int i = 0; i < str.length; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }
        return arr;
    }

    public int[] odd() {
        StringBuilder sb = new StringBuilder();
        for (int i : array) {
            if (i % 2 != 0) {
                sb.append(i);
            }
        }

        String[] str = sb.toString().split("");
        int[] arr = new int[str.length];

        for (int i = 0; i < str.length; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }
        return arr;
    }

    public static void main(String[] args) {
        Separator separator = new Separator(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0});
        separator.odd();
        separator.even();

    }
}
