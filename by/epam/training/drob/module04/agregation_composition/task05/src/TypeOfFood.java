public enum TypeOfFood {
    DINNER,
    BREAKFAST,
    ALL_INCLUSIVE;


    @Override
    public String toString() {
        return super.toString().replace('_', ' ').toLowerCase();
    }
}
