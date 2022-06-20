

public class boilerPlate {
    public static String opening = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
            "<!DOCTYPE fcpxml>\n" +
            "<fcpxml version=\"1.9\">\n" +
            "    <resources>\n" +
            "        <format frameDuration=\"1/60s\" height=\"1080\" name=\"FFVideoFormat1080p60\" width=\"1920\" id=\"r0\"/>\n" +
            "        <effect name=\"Basic Title\" uid=\".../Titles.localized/Bumper:Opener.localized/Basic Title.localized/Basic Title.moti\" id=\"r1\"/>\n" +
            "    </resources>\n" +
            "    <library>\n" +
            "        <event name=\"Subtitles\">\n" +
            "            <project name=\"Subtitles\">\n" +
            "                <sequence format=\"r0\" tcStart=\"3600/1s\" duration=\"1258/60s\" tcFormat=\"NDF\">\n" +
            "                    <spine>";

    public static String closing = " </spine>\n" +
            "                </sequence>\n" +
            "            </project>\n" +
            "        </event>\n" +
            "    </library>\n" +
            "</fcpxml>\n";
}
