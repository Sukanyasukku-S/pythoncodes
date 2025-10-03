class CAB{
   public String name;
   public int distance;
   protected int cabid;

    CAB(String name,int distance){
        this.name=name;
        this.distance=distance;

    }
    public int getid(){
        return cabid;
    }
    public void setid(int cabid){
        this.cabid=cabid;
    }
    public int charge(int distance){
        return 0;
    }
}

class mincab extends CAB{
    public mincab(String name,int distance){
        super(name,distance);
    }
    static int rupee=0;
    public  int charge(int distance){
        rupee=distance*10;
        return rupee;

    }
}
class salescab extends CAB{
     public salescab(String name,int distance){
        super(name,distance);
    }
  static int rupee=0;
    public int charge(int distance){
       
         rupee=distance*25;
         return rupee;
        
    }
}
class main{
public static void main(String args[]){
   

  CAB mc=new mincab("bhavani",30);
mc.setid(101);
   System.out.println("name:" + mc.name + " cabID:" + mc.getid() + "  rupees:"  + mc.charge(10));

CAB sb=new salescab("suzuki",20);
sb.setid(102);
System.out.println("name:" + sb.name + " cabID:" + sb.getid() + "  rupees:"  + sb.charge(10));
}}