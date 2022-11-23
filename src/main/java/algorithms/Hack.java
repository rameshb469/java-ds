package algorithms;

import java.util.ArrayList;
import java.util.List;

public class Hack {

    public void code(String s){
        System.out.print("java ");
    }

    public void write(Object o){
        System.out.println("Language");
    }

    public static void main(String[] args) {
        
    }
}

class  E {
    int a;
    private E(){
        this.a = 10;
    }

    public void print(){
        System.out.println(a);
    }

    public static E set(){
        return new E();
    }
}
