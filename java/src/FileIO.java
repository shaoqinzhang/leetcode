import java.io.*;
import java.sql.Connection;
import java.util.HashMap;
import java.util.Locale;


public class FileIO  {

    public static void main(String args[]) {
        byte a = (byte) 0xf3;
        System.out.println(a); //0xfffffff3
        int b = (byte)a >>> 3; //0x1ffffffe
        byte c = (byte) b; //0xfe
        System.out.println(b);//0x1fffffffe
        System.out.println(c);//0xfffffffe
        HashMap<Integer, Integer> s = new HashMap<>();
        s.get(1);
        "sddf".toUpperCase(Locale.U);
        In
    }
}


