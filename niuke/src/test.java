/**
 * @author 阿海774
 * @site
 * @company
 * @create 2022-10-27 20:10
 * @other
 */

/*
* 小明经常需要打车，某一天他在打车途中研究起了某打车软件的计费系统，他发现这个软件的计费方式是这样的，
* 打车并没有出租车所谓的起步费，乘客从上车开始计算时长，每分钟收费0.3元，每行驶一公里收取1.8元，如果里程超过20公里，
* 则超过20公里的部分，每公里加收0.7元的远途费。当然虽然打车没有起步费，但是有一个最低消费限制，如果订单金额小于9元则按9元收取。
现在给出小明乘车的时间和行驶的里程，请你求出小明需要支付多少钱
* */
public class test {
    public static void main(String[] args) {
        float a=3;
        float b=10;
       float gg= test1(a,b);
        System.out.println(gg);
    }

    public static float test1(float time, float km){
        float result=0;
        float resultTime= (float) (time*0.3);
        if(km<=20){
            result= (float) (resultTime+km*1.8);
        }else{
            result= (float) (resultTime+(km-20)*(0.7+0.8)+20*1.8);
        }
        if(result>9){
            return result;
        }

        else {
           return 9;
        }
    }

}
