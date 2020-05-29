import java.util.ArrayList;

public class main {


    public static void main(String[] args) {

        Integer sum=0;
        ArrayList<Integer> arrayList2=new ArrayList();
        for (int i=0;i<98;i++){
            arrayList2.add(100);
        }
        arrayList2.add(90);
        arrayList2.add(100);

        for (int i=1;i<100;i++){
                sum=sum+arrayList2.get(i)*i;
        }

       System.out.println((495000-sum)/10);





    }
}
