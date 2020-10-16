class SquareFeet {

    public static void main(String[] args) {
        System.out.println(toSquareFeet("15-4 x 14-6"));
        System.out.println(toSquareFeet("12-5 x 17-2"));
        System.out.println(toSquareFeet("15-4 x 14-6"));
        System.out.println(toSquareFeet("10-6 x 16-8"));
        System.out.println(toSquareFeet("12-0 x 13-6"));
        System.out.println(toSquareFeet("11-10 x 11-10"));
        System.out.println(toSquareFeet("9-0 x 17-10"));
        System.out.println(toSquareFeet("11-4 x 16-9"));
    }

    private static long toSquareFeet(String dimensions) {
        String[] split = dimensions.split(" x ");
        int inches1 = toInches(split[0]);
        int inches2 = toInches(split[1]);
        int squareInches = inches1 * inches2;
        return Math.round(squareInches / 144.0);
    }

    private static int toInches(String feetAndInches) {
        String[] split = feetAndInches.split("-");
        int feet = Integer.parseInt(split[0]);
        int inches = Integer.parseInt(split[1]);
        return (feet * 12) + inches;
    }

}