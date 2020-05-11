package codegenerator;

/**
 * Created by mohammad hosein on 6/28/2015.
 */
public class Address {
    public int num;
    public TypeAddress type;
    public varType varType;

    public Address(int num,varType varType, TypeAddress type) {
        this.num = num;
        this.type = type;
        this.varType = varType;
    }

    public Address(int num,varType varType) {
        this.num = num;
        this.type = TypeAddress.Direct;
        this.varType = varType;
    }
    public String toString(){
        switch (type){
            case Direct:
                return num+"";
            case Indirect:
                return "@"+num;
            case Imidiate:
                return "#"+num;
        }
        return num+"";
    }
}
