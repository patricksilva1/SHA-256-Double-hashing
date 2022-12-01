import java.security.MessageDigest;

public class SHA256Helper {

    public static String hash(String data) {

        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hash = digest.digest(data.getBytes("UTF-8"));

            // Convert Byte to Hexa
            StringBuffer hexaDecimalString = new StringBuffer();

            for (int i = 0; i < hash.length; ++i) {
                String hexadecimal = Integer.toHexString(0xff & hash[i]);

                hexaDecimalString.append(hexadecimal);
            }

            return hexaDecimalString.toString();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
