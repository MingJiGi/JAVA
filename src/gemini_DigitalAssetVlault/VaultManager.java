package gemini_DigitalAssetVlault;

public class VaultManager {
    public static void main(String[] args) {


//    Valult<String> a = new Valult<String>();  // digtalasset 을 상속받지 않기때문에 안됌

        Encryptable[] encryptables = new Encryptable[]{new ImageFile(), new DocumentFile()};

        for (Encryptable a : encryptables){
            a.encrpt();
        }
    }
}
