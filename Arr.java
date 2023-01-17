public class Arr {
    public static void sumArr(String[][] array) throws MyArraySizeException, MyArrayDataException {
        if (array.length != 4 || (array[0].length != 4 || array[1].length != 4 || array[2].length != 4 || array[3].length != 4)) {
            throw new MyArraySizeException("Размер не 4х4");
        }
        int s = 0;
        for (int i = 0; i < array.length; i++) {
            String[] str = array[i];
            for (int j = 0; j < str.length; j++) {
                try {
                    s += Integer.parseInt(str[j]);
                }
                catch (NumberFormatException e){
                    throw new MyArrayDataException("Массив содержит не только числа. Ошибка в ячейке: " + i + ":" + j);
                }
            }
        System.out.println(s);
        }
    }
}
