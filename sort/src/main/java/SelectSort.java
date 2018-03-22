public class SelectSort {
    public int [] arr= {1,3,2,4,5};

//    选择排序
//        1、从第一个位置开始遍历待排序的元素，找到最小值和第一元素交换
//        2、从位置i开始往后遍历，找到i之后元素中的最小值，和第i个元素交换位置。
    public void selectSort(int[] arr){
        int minLoc,temp;
        for (int i = 0; i < arr.length-1; i++){
            minLoc = i;
            for (int j = i+1; j < arr.length; j++){
                if (arr[j] < arr[minLoc]){
                    minLoc = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[minLoc];;
            arr[minLoc] = temp;
        }
        for(Integer it:arr){
            System.out.println(it);
        }
    }
    public static void main(String[] args){
        SelectSort ss = new SelectSort();
        ss.selectSort(ss.arr);
    }
}
