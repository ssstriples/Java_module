// https://stackoverflow.com/questions/14559878/convert-string-to-macaddress-formate-in-java

public class makeMac {
    public static void main(String[] args) {
        // char divisionChar = ':'; //change to '-' if you want your mac to be like 00-15-5D-03-8D-01
        // String unformattedMAC = "00155D038D01";
        // String formattedMAC = unformattedMAC.replaceAll("(.{2})", "$1"+divisionChar).substring(0,17);
        // System.out.println(formattedMAC);

        String s = "00155D038D01";
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length();)
        {
            sb.append(s.substring(i++, ++i));
            if(i < s.length()) sb.append(":");
        }
        String mac = sb.toString();
        System.out.println(mac);
    }
}
