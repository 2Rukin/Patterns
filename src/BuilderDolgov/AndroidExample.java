package BuilderDolgov;

public class AndroidExample {

    static class AlertDialog {
        public void show() {
            System.out.println(this);
        }

        static class Builder {
            private String title;

            public Builder(Object o) {
            }

            public AlertDialog create() {
                return new AlertDialog();
            }

            public Builder setTitle(String title) {
                this.title=title;
                return this;
            }
        }

    }

    public static void main(String[] args) {
        AlertDialog.Builder builder = new AlertDialog.Builder(null);
        builder.setTitle("New Title");


        AlertDialog alertDialog = builder.create();
        alertDialog.show();

    }
}
