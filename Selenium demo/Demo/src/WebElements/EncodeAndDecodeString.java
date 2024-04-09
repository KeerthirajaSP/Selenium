package WebElements;
import org.apache.commons.codec.binary.Base64;

public class EncodeAndDecodeString {

	public static void main(String[] args) {
		String str="Keerthiraja@7";
		byte[] encodedString=Base64.encodeBase64(str.getBytes());
		System.out.println("Encoded String : "+ new String(encodedString));
		
		byte[] decodedString=Base64.decodeBase64(encodedString);
		System.out.println("Decoded String : "+ new String(decodedString));
	}
	

}
