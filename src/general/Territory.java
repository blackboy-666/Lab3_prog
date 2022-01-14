package general;

public enum Territory {
    FRONTAGE("палисадники"),
    COURTYARDES("дворы");
    private String val;
    Territory (String vl){
        val = vl;
    }
    public String GetValue(){
    return val;
    }
}
