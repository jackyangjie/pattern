package pattern.sigletion.lazy.regiest;

public enum EnumSigletion {
    INSTANS ;

    private Object data;

    public Object getData() {
        return data;
    }

    public  EnumSigletion getInstans(){
        return INSTANS;
    }

}
