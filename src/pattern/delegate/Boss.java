package pattern.delegate;

public class Boss {
    private  Leader  leader;

    public Boss(Leader leader) {
        this.leader = leader;
    }

   public String commed(String commed){
       System.out.println("boss :"+commed );
         return  leader.task(commed);
    }
}
