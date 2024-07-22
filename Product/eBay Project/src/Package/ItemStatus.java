package Package;
public enum ItemStatus{
    Coming,
    Here,
    Sold;
    public static ItemStatus stringToStatus(String status){
        switch(status){
            case"Coming":
                return ItemStatus.Coming;
            case"Here":
                return ItemStatus.Here;
            case"Sold":
                return ItemStatus.Sold;
        }
        return ItemStatus.Sold;
    }
    public static String statusToString(ItemStatus status){
        switch(status){
            case Coming:
                return "Coming";
            case Here:
                return "Here";
            case Sold:
                return "Sold";
        }
        return "Here";
    }
    public String getStatusString(){
        return this.toString();
    }
}
