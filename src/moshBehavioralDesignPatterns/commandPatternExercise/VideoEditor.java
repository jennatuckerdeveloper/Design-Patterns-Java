package moshBehavioralDesignPatterns.commandPatternExercise;

public class VideoEditor {

    private float contrast = 0.5f;
    private String text;

    public void setText(String text) {
        this.text = text;
    }

    public void removeText() {
        this.text = "";
    }

    public float getContrast() {
        return contrast;
    }

    public void setContrast(float contrast) {
        this.contrast = contrast;
    }

    @Override
    public String toString() {
        return "VideoEditor{" +
                "contrast=" + this.contrast +
                ", text='" + this.text + '\'' +
                '}';
    }
}
