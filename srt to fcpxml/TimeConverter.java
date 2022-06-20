
public class TimeConverter {
    public static int convert(String time) {
        int frame = 3600*60;
        String result = "";
        String pieces[] = time.split(":");
        for (int i = 0; i < pieces.length ; i++) {
            System.out.println(pieces[i]);
        }
        String seconds_milliseconds[] = pieces[2].split(",");
        frame += Integer.parseInt(pieces[0])*3600*60;
        frame += Integer.parseInt(pieces[1])*60*60;
        frame += Integer.parseInt(seconds_milliseconds[0])*60;
        frame += (int) (Double.parseDouble(seconds_milliseconds[1])/(1000.0/60));
        return frame;
    }
}
