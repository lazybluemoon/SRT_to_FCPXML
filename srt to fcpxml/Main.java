

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sin = new Scanner(System.in);
        System.out.println("Enter SRT File");
        String input = sin.nextLine();
        input = input.replace("\"","");
        System.out.println("Enter File Name");
        String name = sin.nextLine();
        PrintWriter fout = new PrintWriter(new File("C:\\Users\\mikha\\Downloads\\"+name+".fcpxml"));
        fout.println(boilerPlate.opening);

        addText(input,fout);

        fout.println(boilerPlate.closing);
        fout.close();
    }

    public static void addText(String strFile, PrintWriter fout) throws FileNotFoundException {
        Scanner fin = new Scanner(new File(strFile));
        int count = 0;
        while(fin.hasNextLine()) {
            fin.nextLine();
            String times[] = fin.nextLine().split(" --> ");
            int opening = TimeConverter.convert(times[0]);
            int end = TimeConverter.convert(times[1]);
            int duration = end - opening;
            String text = fin.nextLine();
            text = text.replace(".","");
            text = text.replace(",","");
            text = text.replace("?","");
            text = text.replace("!","");
            fin.nextLine();

            String line1 = "<title name= \"Rich\" start=\""+opening+"/60s\" duration=\""+duration+"/60s\" offset=\""+opening+"/60s\" enabled=\"1\" ref=\"r1\">";
            String line2 = "<text roll-up-height=\"0\">";
            String line3 = "<text-style ref=\"ts0\">"+text+"</text-style>";
            String line4 = "</text>\n" +
                    "                            <text-style-def id=\"ts0\">\n" +
                    "                                <text-style strokeColor=\"0 0 0 1\" lineSpacing=\"0\" font=\"Open Sans\" strokeWidth=\"0\" fontColor=\"1 1 1 1\" bold=\"1\" italic=\"0\" alignment=\"center\" fontSize=\"96\"/>\n" +
                    "                            </text-style-def>\n" +
                    "                            <adjust-transform scale=\"1 1\" anchor=\"0 0\" position=\"0 0\"/>\n" +
                    "                        </title>";

            if(count == 0) {
                count = 1;
                fout.println("<gap name=\"Gap\" start=\"3600/1s\" duration=\""+(opening-3600*60)+"/60s\" offset=\"3600/1s\"/>");
            }
            fout.println(line1);
            fout.println(line2);
            fout.println(line3);
            fout.println(line4);
            fout.println("");
        }
    }
}