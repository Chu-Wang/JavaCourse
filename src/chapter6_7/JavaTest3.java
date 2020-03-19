package chapter6_7;


/**
 * @author WangMingMing
 * @creat 2020-03-11 10:21
 */
public class JavaTest3 {
    public static void main(String[] args){
        if(args.length != 1){
            System.out.println("输入参数有误");
            System.exit(1);
        }
        int row = Integer.parseInt(args[0]);//将输入的参数转为int
        try{
            int[][] array = createArray(row);
            printArray(array);
        }catch (Exception ex){
            System.err.println(ex.getMessage());
        }
    }
    /**
     *  创建一个不规则二维数组
     *  第一行row列
     *  第二行row - 1列
     *  ...
     *  最后一行1列
     *	数组元素值都为默认值
     * @param row 行数
     * @return 创建好的不规则数组
     */
    public static  int[][] createArray(int row) throws Exception {
        if(row <= 0){//抛出异常
            throw new Exception("row的值不能为0或者负数");
        }
        int[][] resultArray = new int[row][];
        for(int i = 0; i < row; i++){
            resultArray[i] = new int[row - i];
        }
        return resultArray;
    }

    /**
     * 逐行打印出二维数组，数组元素之间以空格分开
     * @param a
     */
    public static  void printArray(int[][] a){
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
