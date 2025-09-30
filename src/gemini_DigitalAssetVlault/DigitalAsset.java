package gemini_DigitalAssetVlault;

public abstract class DigitalAsset implements Encryptable{
    protected String name;
    protected boolean isEncrypted;

    abstract String getAssetInfo();

    @Override
    public String decrypt() {
        this.isEncrypted = true;
        return "암호화 성공";
    }

    @Override
    public String encrpt() {
        this.isEncrypted = true;
        return "복호화 성공";
    }
}
