public class InsertSort {
    public int [] array= {1,3,2,4,5};

    // 插入排序
    // 1、特殊：从第二个元素开始，和第一个元素比较，如果满足排序的顺序，则交换顺序。
    // 2、一般：把待比较和他之前的所有元素相比（从右往左），如果满足排序的顺序，这交换。
    public void insertSort(){
        int length = this.array.length;
        for(int i=0;i<length-1;i++){
            for(int j=i;j>0;j--){
                if(array[j-1]>array[j]){
                    int temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                }
            }
        }
        for(Integer it:array){
            System.out.println(it);
        }

    }


    public static void main(String[] args){
        InsertSort is = new InsertSort();
        is.insertSort();
    }
}
