public class Thread2 {

    public static class NewThread extends Thread {
        @Override
        public void run() {
            System.out.println("Hello from " + this.getName());
        }
    }
    public static void main(String[] args) {

    }
}
