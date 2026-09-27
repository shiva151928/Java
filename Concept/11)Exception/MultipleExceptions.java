class Main {
    static void divide(int a, int b) throws ArithmeticException {
        System.out.println(a / b);
    }

    public static void main(String[] args) {

        try {
            int arr[] = {10, 20, 30};

            divide(10, 0);

            System.out.println(arr[5]);
        }
        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception: " + e.getMessage());
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Exception: " + e.getMessage());
        }
        finally {
            System.out.println("Finally block executed");
        }
    }
}
