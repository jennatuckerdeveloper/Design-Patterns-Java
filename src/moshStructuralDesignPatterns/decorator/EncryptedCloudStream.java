package moshStructuralDesignPatterns.decorator;

public class EncryptedCloudStream implements Stream {
    public EncryptedCloudStream(Stream stream) {
        this.stream = stream;
    }

    private Stream stream;

    @Override
    public void write(String data) {
        var encrypted = encrypt(data);
       stream.write(encrypted);
    }

    public String encrypt(String data) {
        return "!&@^#^#%!";
    }
}
