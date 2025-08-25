class SpringSeason {
    public static void main(String[] args) {
        int month = Integer.parseInt(args[0]), day = Integer.parseInt(args[1]);
        boolean spring = (month == 3 && day >= 20) || (month == 6 && day <= 20) || (month == 4 || month == 5);
        System.out.println(spring ? "Its a Spring Season" : "Not a Spring Season");
    }
}
