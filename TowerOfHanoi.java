public class TowerOfHanoi {
    public static void m1(int disk,String s,String a , String d){
        if(disk==1){
            System.out.println("Disk_"+disk+" FROM "+ s +" TO "+d);
        }else{
            m1(disk-1,s,d,a);
            System.out.println("Disk_"+disk+ " FROM "+s+" TO "+d);
            m1(disk-1,a,s,d);

        }
    }
}
