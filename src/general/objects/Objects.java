package general.objects;

import general.ObjectActions;

public abstract class Objects implements ObjectActions {
    String Name;
    public void universal(){}
    public String foundAsString(){
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
