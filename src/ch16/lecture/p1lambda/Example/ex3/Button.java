package ch16.lecture.p1lambda.Example.ex3;

public class Button {
    public static interface ClickListener {
        void onClick();
    }

    private ClickListener clickListener;

    public void setClickListener(ClickListener clickListener) {
        this.clickListener = clickListener;

    }

    public void click() {
        this.clickListener.onClick();
    }
}
