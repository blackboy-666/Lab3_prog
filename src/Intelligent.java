public abstract class Intelligent implements Intelligent_Actions{
    String Name;

    public void report(){}
    public void take_measures(){}
    public void arrested(){}
    public void swear(){}
    public void ransack(){}
    public void check(){}
    public String got_away(){
        return "устал";
    }
    public void turned_on(){}

    @Override
        public boolean equals(Object obj) {
            if (this.getClass() != obj.getClass())
                return false;
            Intelligent others = (Intelligent) obj;
            return this.Name == others.Name;
    }
    public int hashCode() {
        return this.Name.hashCode();
    }
    public String toString() {
        return this.Name;
    }
}
