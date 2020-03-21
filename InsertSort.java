import java.lang.reflect.Array;
/**
 * 直接插入排序
 */
class InsertSort {
    public static void main(String[] args) {
        int[] tables = new int[]{43,13,32,5,32,13,45};
        int[] newTables = insertSort(tables);
        for(int i : newTables){
            System.out.print(i + ",");
        }
    }
    private static int[] insertSort(int[] tables){
        if(tables == null || tables.length < 0){
            return null;
        }
        for(int i = 1; i < tables.length; i++){
            int temp = tables[i];
            int m = 0; 
            boolean isChange = false;
            for(int j = i - 1; j >= 0 ; j--){
                if(temp > tables[j]){
                    tables[j+1] = tables[j];
                    m = j;
                    isChange = true;
                }
            }
            if(isChange)
                tables[m] = temp;
        }
        return tables;
    }
}