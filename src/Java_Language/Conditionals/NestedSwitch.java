package Java_Language.Conditionals;

class NestedSwitch {
    public static void main(String[] args) {
        String Branch = "CSE";
        int year = 2;
        switch(year){
            case 1:
                //code
                break;
            case 2 :
                switch(Branch){
                    case "CSE":
                        System.out.println("elective course : ML,BigData");
                        break;
                    case "ECE":
                        //code
                        break;
                }
                break;
            case 3:
                //code
                break;
            case 4:
                //code
                break;
            default:
                System.out.println("Invalid year");
        }
    }
}
