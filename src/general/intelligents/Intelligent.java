package general.intelligents;

import general.IntelligentActions;

public abstract class Intelligent implements IntelligentActions {
    String Name;

    public void report(){}
    public String got_away(){
        return "устал";
    }

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
