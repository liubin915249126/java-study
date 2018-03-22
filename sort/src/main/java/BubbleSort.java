public class BubbleSort {
    public int [] arr= {1,3,2,4,5};


//    冒泡排序
//    1、从第一个元素开始，和第二个元素相比，如果满足排序条件，则交换
//    2、把未排序的元素和后面的元素依次比较，如果满足排序条件，则交换
    public void bubbleSort(){
        int length = this.arr.length;
        for(int i=0;i<length-1;i++){
            for(int j=i+1;j<length-1;j++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(Integer it:arr){
            System.out.println(it);
        }
    }
    public static void main(String[] args){
        BubbleSort bs = new BubbleSort();
        bs.bubbleSort();
    }
}
