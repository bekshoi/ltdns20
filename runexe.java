/*
 * Hei Maailma
 * (C) bekshoi 2020
 */
public class runexe {
    public static void main(String[] args) {
Runtime r = Runtime.getRuntime();
Process p = null;
String cmd[]={"excel","asiakkaat.csv"};
try
    {
        p=r.exec(cmd);
    }
catch(java.lang.Exception e) {}
    }
}