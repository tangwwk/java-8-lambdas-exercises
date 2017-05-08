package temp;

/**
 * Created with IntelliJ IDEA.
 * User: TangWenWu
 * Date: 2016/2/24
 * Time: 20:39
 * CopyRight:HuiMei Engine
 */
public class FangFa {


    public static void main(String args[]){
        weilais();
        laiswei();
        youkan();
        System.out.println("\n方法调用");
    }
    public static void weilais(){
        char c[]={'w','u','y','h','g'};
        for(int x=0;x<c.length;x++){
            System.out.print(c[x]);
        }
        System.out.println("");
    }
    public static void laiswei(){
        int n[]={548,564668,1351,351,354,351};
        int temp=0;
        temp=n[0];
        for(int x=0;x<n.length;x++){
            if(temp>n[x]){
                temp=n[x];
            }
        }
        System.out.println("数组的最大值:"+temp);

    }
    public static void youkan(){
        double ni[]={2.4,7.3,5.1,6.2,7.9,5.2,6.1};
        double min=0;
        min=ni[0];
        for(int x=0;x<ni.length;x++){
            if(ni[x]<min){
                min=ni[x];
            }
        }
        System.out.print(min);
    }

}
