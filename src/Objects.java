public abstract class Objects implements Object_Actions{
    String Name;
    public void pitted(){}
    public void found(){}
    public void collapse(){}
    public void disappear(){}
    public String found2(){
        return "спать";
    }
    @Override
    public boolean equals(Object obj) {
        if (this.getClass() != obj.getClass())
            return false;
        Objects others = (Objects) obj;
        return this.Name == others.Name;
    }
    public int hashCode() {
        return this.Name.hashCode();
    }
    public String toString() {
        return this.Name;
    }
}
