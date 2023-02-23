public class ArrayTest {
    public static void main(String[] args) {
        myTools mt = new myTools();
        int[] arr = {10, -1, 8, 0, 34};
        mt.bubble(arr);
        //输出排序后的arr
        System.out.println("排序后的arr为：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
    }
}

//创建一个类myTools，编写一个方法，可以完成对int数组冒泡排序的功能
class myTools {
    public void bubble(int[] arr) {
        //冒泡排序
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {//外层循环次数 arr.length -1
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {//交换
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}

//查看类的继承关系 crtl + h
class  person{
    String name;
    int age;

    public person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
