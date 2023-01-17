public class HW2 {
    public static void main(String[] args) {
        String[][] Arr1 = new String[][]{{"1", "1", "1", "1"}, {"1", "1", "1", "1"}, {"1", "1", "1", "1"}, {"1", "1", "1", "2"}};
        String[][] Arr2 = new String[][]{{"1", "2", "3", "4", "5"}, {"5", "b", "7", "8"}, {"9", "10", "11", "12"}, {"13", "14", "15", "16"}};
        String[][] Arr3 = new String[][]{{"1", "2", "3", "4"}, {"5", "6", "7", "8"}, {"9", "10", "11", "12"}, {"13", "14", "15", "16"}, {"13", "14", "15", "16"}};
        String[][] Arr4 = new String[][]{{"1", "2", "c", "4"}, {"5", "6", "7", "8"}, {"9", "10", "11", "12"}, {"13", "14", "15", "16"}};

        try {
            Arr.sumArr(Arr1);
        } catch (MyArraySizeException e) {
            System.err.println(e.getMessage());
        } catch (MyArrayDataException ex) {
            System.err.println(ex.getMessage());
        }
    }
}