import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TelephoneBilder {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        Pattern pattern = Pattern.compile("^(\\d{3})(\\d{4})$");

        for (int aCount = 100000; aCount <= 9999999; aCount++) {
            Matcher matcher = pattern.matcher(Integer.toString(aCount));
            if (matcher.find()) {
                stringBuilder.append("+7 (926) ").append(matcher.group(1)).append("-").append(matcher.group(2)).append(";");

            }
        }
        
        pattern = Pattern.compile("(\\d[0]{2})-([0]{4})");
        Matcher matcher2 = pattern.matcher(stringBuilder);
        while (matcher2.find()) {
            System.out.println("+ 7 (926)" + matcher2.group(1) + "-" + matcher2.group(2) + ";");
        }
    }
}
