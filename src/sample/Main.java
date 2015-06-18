package sample;

import eu.fbk.mpba.sensorsflows.debugapp.plugins.inputs.CSVLoader.CSVHandler;
import eu.fbk.mpba.sensorsflows.debugapp.plugins.inputs.CSVLoader.CSVLoaderDevice;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main
{
    static void log(String s){System.out.println(s);}
    static void usaAcaso(int a){}

    static void printNewlinedString()
    {

    }

    public static void main(String[] args) throws Exception {
        String str;
        int sid = 0;
        /*CSVLoaderDevice cd = new CSVLoaderDevice("Gesulado");



        log("Avvio [SID"+(sid++) +"] con file vuoto");
        str = "";
        try { cd.addFile(new InputStreamReader(new ByteArrayInputStream(str.getBytes()))); } catch (Exception e) { e.printStackTrace(); }

        Thread.sleep(1000);

        log("Avvio [SID" + (sid++) + "] con file contenente 'ts'");
        str = "ts";
        try { cd.addFile(new InputStreamReader(new ByteArrayInputStream(str.getBytes()))); } catch (Exception e) { e.printStackTrace(); }

        Thread.sleep(1000);

        log("Avvio [SID"+(sid++) +"] con file contenente 'ts\\n0\\n1\\n2'");
        str = "ts\n0\n1\n2";
        try { cd.addFile(new InputStreamReader(new ByteArrayInputStream(str.getBytes()))); } catch (Exception e) { e.printStackTrace(); }

        log("Avvio [SID"+(sid++) +"] con file contenente 'ts;x\\n0;3\\n1;4\\n2;5'");
        str = "ts;x\n0;3\n1;4\n2;5";
        try { cd.addFile(new InputStreamReader(new ByteArrayInputStream(str.getBytes()))); } catch (Exception e) { e.printStackTrace(); }



        cd.inputPluginInitialize();
        usaAcaso(sid);
        Thread.sleep(600000);
        */

        CSVHandler cs;
        CSVHandler.CSVRow r;

        System.out.println("Tutto a posto");
        str = "ts;x;y;z\n0;3;4;2\n1;4;1;2\n3;4;5;6";
        cs = new CSVHandler(0, new InputStreamReader(new ByteArrayInputStream(str.getBytes())), ";", "\n");
        System.out.println(cs.getDescriptors());
        while((r = cs.getNextRow()) != null)
            System.out.println(Arrays.toString(r.fields) + r.error + "; " + r.errorMsg);


        str = "ts;x;y;z\n0;3;4;2\n1;4;1;2\n3;4;5;6";
        cs = new CSVHandler(0, new InputStreamReader(new ByteArrayInputStream(str.getBytes())), ";", "\n");
        System.out.println(cs.getDescriptors());
        while((r = cs.getNextRow()) != null)
            System.out.println(Arrays.toString(r.fields) + r.error + "; " + r.errorMsg);

        //Ciao come va?
    }
}
