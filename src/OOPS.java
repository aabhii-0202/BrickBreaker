class OOPS implements CharSequence{

    public static void main(String[] args) {

        String str = "Hello anupama";

        System.out.println(str.length());
    }


    @Override
    public int length() {
        return 0;
    }

    @Override
    public char charAt(int index) {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return CharSequence.super.isEmpty();
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return null;
    }
}
