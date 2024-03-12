package ch09.lecture.p1nested.Example.ex8;

public class ButtonExample {
    public static void main(String[] args) {
        Button btnOk = new Button();

        class OkListener implements Button.ClickListener {
            @Override
            public void onClick() {
                System.out.println("ok 버튼 클릭");
            }
        }

        btnOk.setClickListener(new OkListener());

        btnOk.click();

        Button btnCancle = new Button();

        class CancelListener implements Button.ClickListener {
            @Override
            public void onClick() {
                System.out.println(" calncle 버튼 클릭");
            }
        }

        btnCancle.setClickListener(new CancelListener());
        
        btnCancle.click();
    }
}
