package chapter4_5;
/**
 * @author WangMingMing
 * @creat 2020-03-03 14:22
 */
public class JavaTest2 {
    public static void main(String[] args) {
        String[] stringArray = new String[5];//用来保存生成的五个车牌号
        String str =  "";//一个车牌号
        int count  = 0;
        while(count < 5){
            for(int i = 0; i < 3; i++){//3个大写字母
                str += (char)('A' + (int)(Math.random() * 26));
            }
            for(int i = 0; i < 4; i++){//4个数字
                str += (int)(Math.random() * 10);
            }
            if(!contains(stringArray, str)){//判断是否重复
                stringArray[count] = str;
                count++;
            }
            str = "";//重置车牌号
        }
        System.out.println("生成的不重复的车牌号为： ");
        for(int i = 0; i < 5; i++){
            System.out.println(stringArray[i]);
        }

    }
    public static boolean contains(String[] array, String str){
        for(int i = 0; i < array.length; i++){
            if(str.equals(array[i])){
                return true;
            }
        }
        return false;
    }
}
