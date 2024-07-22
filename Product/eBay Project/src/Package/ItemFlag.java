package Package;
public enum ItemFlag{
    None,
    Red,
    Orange,
    Yellow,
    Green;
    public static ItemFlag stringToFlag(String flag){
        switch(flag){
            case"None":
                return ItemFlag.None;
            case"Red":
                return ItemFlag.Red;
            case"Orange":
                return ItemFlag.Orange;
            case"Yellow":
                return ItemFlag.Yellow;
            case"Green":
                return ItemFlag.Green;
        }
        return ItemFlag.None;
    }
    public static String flagToString(ItemFlag flag){
        switch(flag){
            case None:
                return "None";
            case Red:
                return "Red";
            case Orange:
                return "Orange";
            case Yellow:
                return "Yellow";
            case Green:
                return "Green";
        }
        return "None";
    }
    public String getFlagString(){
        return this.toString();
    }
}
